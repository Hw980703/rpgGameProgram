package game;

import java.util.Random;

public class monsterInfo {

	public static int slimAtk ;
	public static int slimDef ;
	public static Random rand = new Random();
	public static int radom ;
	public static String wolf ;
	public static int wolfAtk ;
	public static int slimDg;
	public static int wolfDg;
	public static int wolfDef ;
	public static int bossLevel;
	public static String boss;
	public static int bossHp ;
	public static int bossDg ;
	
	public monsterInfo() {
		slimAtk = 5;
		slimDef = 20 + dnfStart.monsterlevel;
		radom = rand.nextInt(5) + 1;
		wolf = "웨어울프";
		wolfAtk = 35;
		wolfDef = 30 + dnfStart.wolfLevel;
		bossLevel = 50;
		boss = "자바드래곤";
		bossHp = 1000;
		bossDg = 5;
		
		
		
	}

	public static int getRandom() {

		radom = rand.nextInt(11) + 1;
		return radom;
	}

	public static int getWolfRandom() {

		radom = rand.nextInt(11) + 11;
		return radom;
	}

	public static void getWolfExp(int num) {
		int wolfExp;

		if (((7 * num) - (gameInfo.level * 2) <= 0)) {
			wolfExp = 0;
		} else {
			wolfExp = (7 * num) - (gameInfo.level * 2);
		}
		;

		System.out.println("=======================================");
		System.out.println("       레벨 : " + dnfStart.wolfLevel + wolf + "를 잡았다!!");
		gameInfo.exp += wolfExp;
		gameInfo.money += (10 * num);
		System.out.println("        경험치가 " + wolfExp + "EXP 올랐습니다.");
		System.out.println("       소지금이" + (10 * num) + "원 올랐습니다.");

		System.out.println("         현재 경험치 : " + gameInfo.exp + "EXP");
		System.out.println("         현재 소지금 : " + gameInfo.money + "원");

		System.out.println();

	}

	public static void getSlimExp(int num) {
		int slimExp;

		if (((7 * num) - (gameInfo.level * 2)) <= 0) {
			slimExp = 0;
		} else {
			slimExp = ((7 * num) - (gameInfo.level * 2));
		}
		System.out.println("=======================================");
		System.out.println("       레벨 : " + dnfStart.monsterlevel + " 슬라임을 잡았다!!");

		System.out.println("        경험치가 " + slimExp + "EXP 올랐습니다.");
		System.out.println("       소지금이 " + (8 * num) + "원 올랐습니다.");
		gameInfo.exp += slimExp;
		gameInfo.money += (8 * num);
		System.out.println("         현재 경험치 : " + gameInfo.exp + "EXP");
		System.out.println("         현재 소지금 : " + gameInfo.money + "원");

		System.out.println();

	}

	public static int getSlimAtk() {
		radom = rand.nextInt(6) + 1;
		int reulst = ((radom + dnfStart.monsterlevel + slimAtk) - (gameInfo.def / 3));

		return reulst;
	}

	public static int getWolfAtk() {
		radom = rand.nextInt(11) + 11;
		int reulst = ((radom + dnfStart.monsterlevel + wolfAtk) - (gameInfo.def / 3));

		return reulst;
	}

	public static int getBossAtk() {
		radom = rand.nextInt(11) + 5;
		int reulst = ((radom + bossDg));

		return reulst;
	}
}

/*
 * \`----.__ ____ | `--._ <=# , *--, /_ `-. ,/ / ````` \__ (_.' ,' \__ ......'
 * \___----^__ _./ ,' `. \ _.' ___/ )\...._" ___ \ \__.' __.' `""' `""`.'"""`--\
 * 
 */
