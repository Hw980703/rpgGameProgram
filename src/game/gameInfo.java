package game;

import java.util.Random;
import java.util.Scanner;

public class gameInfo {
//	gameInfoBack back = new gameInfoBack();
	public static String name;
	public static int level;
	public static int money;
	public static int str;
	public static int heroHp;
	public static int exp;
	public static String job;
	public static String equipSword;
	public static String equipprotec;
	public static int def;
	public static int dmage;
	public static int oneSkill;

	public static Random rand = new Random();

	public gameInfo() {
		name = "미생성";
		equipSword = "초보자의 검 (def + 0)";
		equipprotec = "초보자의 방어구 (def + 0)";
		str = 5;
		def = 3;
		exp = 0;
		heroHp = 100;
		level = 1;
		money = 500;
		job = "초보자";
		dmage = monsterInfo.rand.nextInt(10) + (gameInfo.str/2);
		oneSkill = 30;
		Random rand = new Random();

	}

	public static void ifnoSet() {
		name = "미생성";

		equipSword = "초보자의 검";
		equipprotec = "초보자의 방어구";
		str = 10;
		def = 5;
		heroHp = 100;
		level = 1;
		money = 500;
		job = "초보자";
	}

	public static void bossSet() {

		equipSword = inven.wolfSword;
		equipprotec = inven.wolfProtect;
		str = 30;
		def = 30;
		heroHp = 100;
		level = 30;
		money = 500;
		job = "초보자";
		inven.hpPosion += 30;
		oneSkill = 30;

	}

	public static void superUser() {
		Scanner sc = new Scanner(System.in);

		System.out.println("바로 보스에 도전할 수 있도록 캐릭터 성장을 도와줍니다.");
		System.out.println("캐릭터의 레벨이 30이 됩니다.");
		System.out.println("캐릭터의 힘 : 30, 방어력 : 30 세팅됩니다.");
		System.out.println("캐릭터의 무기 : 웨어울프의 송곳니 대검 , 방어구 : 웨어울프의 가죽 옷이 세팅됩니다.");
		System.out.println("포션 : 30개가 증정 됩니다.");
		System.out.println("승낙 하시겠습니까?");
		System.out.println("1 : 승낙   2 : 거절");
		System.out.print(">>선택 : ");
		int superSelect = sc.nextInt();

		switch (superSelect) {
		case 1:
			bossSet();
			System.out.println("슈퍼성장이 완료 되었습니다.");
			dnfStart.gameStart();
			break;
		case 2:
			dnfStart.gameStart();
			break;
		}
	}

	public void infoLoad() {
		name = "미생성";

		equipSword = "초보자의 검";
		equipprotec = "초보자의 방어구";
		str = 10;
		heroHp = 100;
		level = 1;
	}

	// 캐릭터 데미지

	public static int getUserAtk() {

		int radom = rand.nextInt(5) + 5;
		int reulst = (radom + str);

		return reulst;

	}

	public static int getSkillAtk() {

		int reulst = oneSkill + gameInfo.str;

		return reulst;

	}

	public static void myInfo() {
		System.out.println("닉네임 : " + name + "\n" + "레벨 : " + level + "\n" + "직업 : " + job + "\n" + "장착중인 무기 : "
				+ equipSword + "\n" + "장착중인 방어구 : " + equipprotec);
	}

	public void mySelf() {
		System.out.println("닉네임 : " + name + "\n" + "레벨 : " + level + "\n" + "직업 : " + job + "\n" + "장착중인 무기 : "
				+ equipSword + " 장착중인 방어구 : " + equipprotec);
	}

	// 메인화면
	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("||||||                           \\`----.__                 ____               \r\n"
				+ " |||  ||| ||||  |||||| ||| ||||   |       `--._         <=#  , *--,           \r\n"
				+ " |||   |||     |||  ||| |||  ||| /_             `-.    ,/  / `````            \r\n"
				+ " |||   |||     |||  ||| |||  |||   \\__             (_.'  ,'                   \r\n"
				+ "|||||  |||      ||||||  |||  |||      \\__ ......'       \\___----^__           \r\n"
				+ "                                   _./               ,'           `.         \r\n"
				+ " ||               ||      |\\     _.'   ___/ )\\...._\"   ___           \\        \r\n"
				+ "||||     |||     ||||     | \\__.'  __.'            `\"\"'   `\"\"`.'\"\"\"`--\\       \r\n"
				+ " |||   ||| |||   |||   ||| \\____.-'                                           \r\n"
				+ " |||   ||| |||   |||   ||||   ||| ||||||     |||||||                          \r\n"
				+ "  ||| |||   ||| |||     |||    |||    |||  |||     |||                        \r\n"
				+ "    |||       |||       |||    |||    |||  |||     |||                        \r\n"
				+ "     |         |       |||||   |||    |||    |||||||||                        \r\n"
				+ "                                                   |||                        \r\n"
				+ "               \"      Java RPG GAME     \"    ||||||||");

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("============  자바 어드벤처 RPG GAME ============");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("  ┌───────────────────────────────────────────┐");
		System.out.println("       자바 어드벤처에 오신것을 환영 합니다!");
		System.out.println("      용사가 되어 자바드래곤을 처치해주세요!!");
		System.out.println("  └───────────────────────────────────────────┘");
		System.out.println("   >> 1. 시작 ");
		System.out.println("   >> 2. 종료 ");
		System.out.print("  선택 : ");
		int seleclt = sc.nextInt();

		return seleclt;
	}

	// 캐릭터 생성

	public static void userCreate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("┌─────캐릭터 생성─────┐");
		System.out.println(" 닉네임을 입력해주세요.");
		System.out.println("└─────────────────────┘");
		System.out.print("  닉네임 입력 : ");
		new gameInfo();
		gameInfo.name = sc.next();
		System.out.println();
		System.out.println("┌");
		System.out.println("  캐릭터가 생성 되었습니다!");
		System.out.println("                           ┘");

	}

	// 캐릭터 노생성
	public static void userNo() {
		System.out.println("     ┌─────────────────────────────┐");
		System.out.println("      캐릭터가 생성되지 않았습니다");
		System.out.println("         캐릭터를 생성해주세요");
		System.out.println("     └─────────────────────────────┘");
	}

	// 캐릭터 삭제
	public static void userSet() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정말 삭제하시겠습니까?");
		System.out.println();
		System.out.println("현재 내 캐릭터 상태");
		gameInfo.myInfo();
		System.out.println();

		System.out.println("1:YES 2:NO");
		System.out.print(">>선택 : ");

		int setYN = sc.nextInt();
		if (setYN == 1) {
			gameInfo.ifnoSet();
			System.out.println("캐릭터가 초기화 되었습니다.");

		} else if (setYN == 2) {
			System.out.println("취소하셨습니다.");

		} else {
			System.out.println("번과 2번 중 하나를 고르시오.");
		}
	}

	public static void leveUp() {
		gameInfo.level += 1;
		gameInfo.exp = 0;
		gameInfo.str += 3;
		gameInfo.def += 1;
		gameInfo.heroHp = 100;
		System.out.println("---------------------------------------------");
		System.out.println("	레벨업 했습니다!!");
		System.out.println("	[LEVEL" + gameInfo.level + "]");
		System.out.println("	스텟 힘 증가 + 3");
		System.out.println("	스텟 방어력 증가 + 1");
		System.out.println("	현재 스텟 힘 : " + gameInfo.str);
		System.out.println("	현재 스텟 방어력: " + gameInfo.def);
		System.out.println("    [체력 회복] HP : " + gameInfo.heroHp);
		System.out.println("---------------------------------------------");

	}

	public static void gameBook() {
		System.out.println("┌─────────────────────────────────────────────────────┐");
		System.out.println("             게임 가이드");
		System.out.println("  -사냥-  ");
		System.out.println("     1.몬스터 레벨은 랜덤으로 정해진다  ");
		System.out.println("     2.몬스터 레벨에 따라서 몬스터 데미지가 다르다.  ");
		System.out.println("     3.캐릭터 방어력으로 몬스터 데미지 감소가 된다. ");
		System.out.println("     4.몬스터 레벨에 따라서 얻는 경험치가 다르다.  ");
		System.out.println("     5.캐릭터 체력이 0이하가 되면 게임이 종료 된다. ");
		System.out.println("     6.캐릭터 힘 스텟이 올라가면 데미지가 강해진다. ");
		System.out.println("     6.캐릭터 방어력 스텟이 올라가면 데미지를 적게 받는다. ");
		System.out.println("     7.레벨업 시 체력 풀회복 ");
		System.out.println("  -아이템-  ");
		System.out.println("     1.몬스터 처치 시 일정 확률로 전리품을 획득한다. ");
		System.out.println("       쟤료,HP포션,장비 중 확률 획득");
		System.out.println("       1레벨 ~ 11레벨 던전 : 슬라임");
		System.out.println("        ㄴ 철소드,슬라임의 액체 갑옷 드랍");
		System.out.println("       11레벨 ~ 21레벨 던전 : 웨어울프");
		System.out.println("        ㄴ 웨어울프의 송곳니 대검,웨어울프의 가죽 옷 드랍");
		System.out.println("     2.인벤토리는 10칸이다.");
		System.out.println("  -장비-  ");
		System.out.println("     1.무기에는 힘 스텟이 붙어 있다. ");
		System.out.println("     2.무기 장착시 힘 스텟이 올라간다. ");
		System.out.println("     3.기존 무기보다 약한 장착시 힘 스텟이 내려간다. ");
		System.out.println("     4.방어구에는 방어력 스텟이 붙어 있다. ");
		System.out.println("     5.방어구 장착시 방어력 스텟이 올라간다. ");
		System.out.println("     6.기존 방어구보다 약한 장착시 방어력 스텟이 내려간다. ");
		System.out.println("└──────────────────────────────────────────────────────┘");

	}

	public void dataSave() {

//		nameback = name;
//		ageback = age;
//		 levelback = level;
//		moneyback = money;
//		strback = str;
//		hpback = hp;
//		 jobback = job;
//		 equipSwordback = equipSword;
//		equipprotecback = equipprotec;
//		 System.out.println("데이터를 성공적으로 저장했습니다.");

	}

	public void dataLoad() {

//		name = nameback;
//		 age = ageback;
//		 level  = levelback;
//		 money = moneyback;
//		str = strback;
//		hp = hpback;
//		 job = jobback;
//		 equipSword = equipSwordback;
//		 equipprotec = equipprotecback;
//		 System.out.println("데이터를 성공적으로 불러왔습니다.");
//		

	}
}
