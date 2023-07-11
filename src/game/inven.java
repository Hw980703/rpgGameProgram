package game;

import java.util.Scanner;

public class inven {
	// 인벤토리
	public static String[] itemSwordArrs;
	public static String[] itemProtecArrs;
	// 슬라임 아이템
	public static int slimac;
	public static String slimProtect;
	public static int slimProtectDef;

	// 웨어울프 아이템
	public static String wolfSword;
	public static String wolfItem;
	public static int wolfItemNum;
	public static String wolfProtect;
	public static int wolfProtectDef;

	// 물약
	public static int hpPosion;
	// 무기

	public static String choboSword;
	public static int choboSwordStr;
	public static int choelSwordStr;
	public static String choelSword;
	public static int wolfSwordStr;
	public static int choboProtectDef;
	public static String choboProtect;

	// 방어구

	// 백업 장비
	public static String backSword = "";
	public static String backProtect = "";

	// for (int i=0; i<itemArrs.length; i++) {

	public inven() {

		itemSwordArrs = new String[10];
		itemProtecArrs = new String[10];

		for (int i = 0; i < itemSwordArrs.length; i++) {
			itemSwordArrs[i] = "없음";
		}
		for (int i = 0; i < itemSwordArrs.length; i++) {
			itemProtecArrs[i] = "없음";
		}

		slimac = 0;
		slimProtect = "슬라임의 액체 갑옷 (def + 10)";
		slimProtectDef = 10;
		wolfSword = "웨어울프의 송곳니 대검 (str + 30)";
		wolfItem = "웨어울프의 가죽";
		wolfItemNum = 0;
		wolfProtect = "웨어울프의 가죽 옷 (def + 30)";
		choelSword = "철소드 (str + 10)";
		wolfProtectDef = 30;
		hpPosion = 5;
		choboSword = "초보자의 검 (def + 0)";
		choboProtect = "초보자의 방어구 (def + 0)";
		choboSwordStr = 0;
		choelSwordStr = 10;
		wolfSwordStr = 30;
		choboProtectDef = 0;

	}
//		itemArrs[i] = "없음";
//	}

	// 무기장착
	public static void swordEquip() {
		Scanner sc = new Scanner(System.in);
		System.out.println("┌────────── 무기 장착─────────────────┐");
		System.out.println(" 1  : " + itemSwordArrs[0]);
		System.out.println(" 2  : " + itemSwordArrs[1]);
		System.out.println(" 3  : " + itemSwordArrs[2]);
		System.out.println(" 4  : " + itemSwordArrs[3]);
		System.out.println(" 5  : " + itemSwordArrs[4]);
		System.out.println(" 6  : " + itemSwordArrs[5]);
		System.out.println(" 7  : " + itemSwordArrs[6]);
		System.out.println(" 8  : " + itemSwordArrs[7]);
		System.out.println(" 9  : " + itemSwordArrs[8]);
		System.out.println(" 10 : " + itemSwordArrs[9]);
		System.out.println("└───────────────────────────────────┘");
		System.out.println("장착할 무기를 선택해주세요");
		System.out.print("장비 번호 선택 : ");
		int swrodNum = sc.nextInt();

		if (itemSwordArrs[swrodNum - 1] != "없음") {
			if (gameInfo.equipSword != itemSwordArrs[swrodNum - 1]) {
				switch (swrodNum) {

				case 1:
					if (itemSwordArrs[swrodNum - 1] == inven.wolfSword) {
						setWolfSword(swrodNum);
					} else if (itemSwordArrs[swrodNum - 1] == choelSword) {

						setCheolSword(swrodNum);
					} else if (itemSwordArrs[swrodNum - 1] == choboSword) {
						setChoboSword(swrodNum);
					}

					break;

				case 2:
					if (itemSwordArrs[swrodNum - 1] == inven.wolfSword) {
						setWolfSword(swrodNum);
					} else if (itemSwordArrs[swrodNum - 1] == choelSword) {

						setCheolSword(swrodNum);
					} else if (itemSwordArrs[swrodNum - 1] == choboSword) {
						setChoboSword(swrodNum);
					}

					break;
				case 3:
					if (itemSwordArrs[swrodNum - 1] == inven.wolfSword) {
						setWolfSword(swrodNum);
					} else if (itemSwordArrs[swrodNum - 1] == choelSword) {

						setCheolSword(swrodNum);
					} else if (itemSwordArrs[swrodNum - 1] == choboSword) {
						setChoboSword(swrodNum);
					}

					break;
				case 4:
					if (itemSwordArrs[swrodNum - 1] == inven.wolfSword) {
						setWolfSword(swrodNum);
					} else if (itemSwordArrs[swrodNum - 1] == choelSword) {

						setCheolSword(swrodNum);
					} else if (itemSwordArrs[swrodNum - 1] == choboSword) {
						setChoboSword(swrodNum);
					}

					break;
				case 5:
					if (itemSwordArrs[swrodNum - 1] == inven.wolfSword) {
						setWolfSword(swrodNum);
					} else if (itemSwordArrs[swrodNum - 1] == choelSword) {

						setCheolSword(swrodNum);
					} else if (itemSwordArrs[swrodNum - 1] == choboSword) {
						setChoboSword(swrodNum);
					}

					break;
				case 6:
					if (itemSwordArrs[swrodNum - 1] == inven.wolfSword) {
						setWolfSword(swrodNum);
					} else if (itemSwordArrs[swrodNum - 1] == choelSword) {

						setCheolSword(swrodNum);
					} else if (itemSwordArrs[swrodNum - 1] == choboSword) {
						setChoboSword(swrodNum);
					}

					break;
				case 7:
					if (itemSwordArrs[swrodNum - 1] == inven.wolfSword) {
						setWolfSword(swrodNum);
					} else if (itemSwordArrs[swrodNum - 1] == choelSword) {

						setCheolSword(swrodNum);
					} else if (itemSwordArrs[swrodNum - 1] == choboSword) {
						setChoboSword(swrodNum);
					}

					break;
				case 8:
					if (itemSwordArrs[swrodNum - 1] == inven.wolfSword) {
						setWolfSword(swrodNum);
					} else if (itemSwordArrs[swrodNum - 1] == choelSword) {

						setCheolSword(swrodNum);
					} else if (itemSwordArrs[swrodNum - 1] == choboSword) {
						setChoboSword(swrodNum);
					}

					break;
				case 9:
					if (itemSwordArrs[swrodNum - 1] == inven.wolfSword) {
						setWolfSword(swrodNum);
					} else if (itemSwordArrs[swrodNum - 1] == choelSword) {

						setCheolSword(swrodNum);
					} else if (itemSwordArrs[swrodNum - 1] == choboSword) {
						setChoboSword(swrodNum);
					}

					break;
				case 10:
					if (itemSwordArrs[swrodNum - 1] == inven.wolfSword) {
						setWolfSword(swrodNum);
					} else if (itemSwordArrs[swrodNum - 1] == choelSword) {

						setCheolSword(swrodNum);
					} else if (itemSwordArrs[swrodNum - 1] == choboSword) {
						setChoboSword(swrodNum);
					}

					break;

				}
			} else {
				System.out.println("같은 무기를 장착 할 수 없습니다");
			}

		} else if (itemSwordArrs[swrodNum] == "없음") {
			System.out.println("해당 번호에 장비가 없습니다.");
			System.out.println();
		}
	}

	// 방어구 장착
	public static void protectEquip() {
		Scanner sc = new Scanner(System.in);
		System.out.println("┌────────── 방어구 장착─────────────────┐");
		System.out.println(" 1  : " + itemProtecArrs[0]);
		System.out.println(" 2  : " + itemProtecArrs[1]);
		System.out.println(" 3  : " + itemProtecArrs[2]);
		System.out.println(" 4  : " + itemProtecArrs[3]);
		System.out.println(" 5  : " + itemProtecArrs[4]);
		System.out.println(" 6  : " + itemProtecArrs[5]);
		System.out.println(" 7  : " + itemProtecArrs[6]);
		System.out.println(" 8  : " + itemProtecArrs[7]);
		System.out.println(" 9  : " + itemProtecArrs[8]);
		System.out.println(" 10 : " + itemProtecArrs[9]);
		System.out.println("└───────────────────────────────────┘");
		System.out.println("장착할 방어구를 선택해주세요");
		System.out.print("장비 번호 선택 : ");
		int protectNum = sc.nextInt();

		if (itemProtecArrs[protectNum - 1] != "없음") {
			if (gameInfo.equipprotec != itemProtecArrs[protectNum - 1]) {
				switch (protectNum) {

				case 1:
					if (itemProtecArrs[protectNum - 1] == inven.wolfProtect) {
						setWolfProtect(protectNum);
					} else if (itemProtecArrs[protectNum - 1] == slimProtect) {

						setslimPotec(protectNum);
					} else if (itemSwordArrs[protectNum - 1] == choboProtect) {
						setChoboProtect(protectNum);
					}

					break;

				case 2:
					if (itemProtecArrs[protectNum - 1] == inven.wolfProtect) {
						setWolfProtect(protectNum);
					} else if (itemProtecArrs[protectNum - 1] == slimProtect) {

						setslimPotec(protectNum);
					} else if (itemSwordArrs[protectNum - 1] == choboProtect) {
						setChoboProtect(protectNum);
					}

					break;
				case 3:
					if (itemProtecArrs[protectNum - 1] == inven.wolfProtect) {
						setWolfProtect(protectNum);
					} else if (itemProtecArrs[protectNum - 1] == slimProtect) {

						setslimPotec(protectNum);
					} else if (itemSwordArrs[protectNum - 1] == choboProtect) {
						setChoboProtect(protectNum);
					}

					break;
				case 4:
					if (itemProtecArrs[protectNum - 1] == inven.wolfProtect) {
						setWolfProtect(protectNum);
					} else if (itemProtecArrs[protectNum - 1] == slimProtect) {

						setslimPotec(protectNum);
					} else if (itemSwordArrs[protectNum - 1] == choboProtect) {
						setChoboProtect(protectNum);
					}

					break;
				case 5:
					if (itemProtecArrs[protectNum - 1] == inven.wolfProtect) {
						setWolfProtect(protectNum);
					} else if (itemProtecArrs[protectNum - 1] == slimProtect) {

						setslimPotec(protectNum);
					} else if (itemSwordArrs[protectNum - 1] == choboProtect) {
						setChoboProtect(protectNum);
					}

					break;
				case 6:
					if (itemProtecArrs[protectNum - 1] == inven.wolfProtect) {
						setWolfProtect(protectNum);
					} else if (itemProtecArrs[protectNum - 1] == slimProtect) {

						setslimPotec(protectNum);
					} else if (itemSwordArrs[protectNum - 1] == choboProtect) {
						setChoboProtect(protectNum);
					}

					break;
				case 7:
					if (itemProtecArrs[protectNum - 1] == inven.wolfProtect) {
						setWolfProtect(protectNum);
					} else if (itemProtecArrs[protectNum - 1] == slimProtect) {

						setslimPotec(protectNum);
					} else if (itemSwordArrs[protectNum - 1] == choboProtect) {
						setChoboProtect(protectNum);
					}

					break;
				case 8:
					if (itemProtecArrs[protectNum - 1] == inven.wolfProtect) {
						setWolfProtect(protectNum);
					} else if (itemProtecArrs[protectNum - 1] == slimProtect) {

						setslimPotec(protectNum);
					} else if (itemSwordArrs[protectNum - 1] == choboProtect) {
						setChoboProtect(protectNum);
					}

					break;
				case 9:
					if (itemProtecArrs[protectNum - 1] == inven.wolfProtect) {
						setWolfProtect(protectNum);
					} else if (itemProtecArrs[protectNum - 1] == slimProtect) {

						setslimPotec(protectNum);
					} else if (itemSwordArrs[protectNum - 1] == choboProtect) {
						setChoboProtect(protectNum);
					}

					break;
				case 10:
					if (itemProtecArrs[protectNum - 1] == inven.wolfProtect) {
						setWolfProtect(protectNum);
					} else if (itemProtecArrs[protectNum - 1] == slimProtect) {

						setslimPotec(protectNum);
					} else if (itemSwordArrs[protectNum - 1] == choboProtect) {
						setChoboProtect(protectNum);
					}

					break;

				}
			} else {
				System.out.println("같은 방어구를 장착 할 수 없습니다");
			}

		} else if (itemProtecArrs[protectNum] == "없음") {
			System.out.println("해당 번호에 장비가 없습니다.");
			System.out.println();
		}
	}

	public static void itemBox2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("┌────────── 방어구 인벤토리 ──────────┐");
		System.out.println(" 1  : " + itemProtecArrs[0]);
		System.out.println(" 2  : " + itemProtecArrs[1]);
		System.out.println(" 3  : " + itemProtecArrs[2]);
		System.out.println(" 4  : " + itemProtecArrs[3]);
		System.out.println(" 5  : " + itemProtecArrs[4]);
		System.out.println(" 6  : " + itemProtecArrs[5]);
		System.out.println(" 7  : " + itemProtecArrs[6]);
		System.out.println(" 8  : " + itemProtecArrs[7]);
		System.out.println(" 9  : " + itemProtecArrs[8]);
		System.out.println(" 10 : " + itemProtecArrs[9]);
		System.out.println("└─────────────────────────────────────┘");

		System.out.println("<< 메뉴 >>");
		System.out.println(">>1.방어구 장착");
		System.out.println(">>2.무기 인벤토리");
		System.out.println(">>3.방어구 판매");
		System.out.println(">>4.뒤로가기");
		System.out.print("선택 : ");
		int invenSelect = sc.nextInt();
		
		
		
		
		if (invenSelect == 1) {
			protectEquip();
		} else if (invenSelect == 2) {
			itemBox();
		}else if (invenSelect ==3 ) {
			protectSell();
		}
	}
	
	public static void protectSell() {
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("수락 시 모든 방어구가 판매 됩니다.");
		System.out.println("1.수락  2.거절");
		System.out.print("선택 : ");
		int sell2 = sc.nextInt();
		
		switch(sell2) {
		case 1 : for (int i=0; i<itemProtecArrs.length; i++) {
			
			if ( itemProtecArrs[i] !="없음") {
		
			count+=1;
			}
			itemProtecArrs[i] = "없음";
		}
		System.out.println("방어구 판매 : "+count*50+"원 획득");
		System.out.println("현재 소지금 : "+ (gameInfo.money += (count*50))); 
		}
	}
	
	public static void SwordSell() {
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("수락 시 모든 무기가 판매 됩니다.");
		System.out.println("1.수락  2.거절");
		System.out.print("선택 : ");
		int sell2 = sc.nextInt();
		
		switch(sell2) {
		case 1 : for (int i=0; i<itemSwordArrs.length; i++) {
			
			if ( itemSwordArrs[i] !="없음") {
		
			count+=1;
			}
			itemSwordArrs[i] = "없음";
		}
		System.out.println("무기 판매 : "+count*50+"원 획득");
		System.out.println("현재 소지금 : "+ (gameInfo.money += (count*50))); 
		}
	}

	public static void itemBox() {
		Scanner sc = new Scanner(System.in);
		System.out.println("┌────────── 무기 인벤토리 ──────────┐");
		System.out.println(" 1  : " + itemSwordArrs[0]);
		System.out.println(" 2  : " + itemSwordArrs[1]);
		System.out.println(" 3  : " + itemSwordArrs[2]);
		System.out.println(" 4  : " + itemSwordArrs[3]);
		System.out.println(" 5  : " + itemSwordArrs[4]);
		System.out.println(" 6  : " + itemSwordArrs[5]);
		System.out.println(" 7  : " + itemSwordArrs[6]);
		System.out.println(" 8  : " + itemSwordArrs[7]);
		System.out.println(" 9  : " + itemSwordArrs[8]);
		System.out.println(" 10 : " + itemSwordArrs[9]);
		System.out.println("└───────────────────────────────────┘");

		System.out.println("<< 메뉴 >>");
		System.out.println(">>1.무기 장착");
		System.out.println(">>2.방어구 인벤토리");
		System.out.println(">>3.무기 판매");
		System.out.println(">>4.뒤로가기");
		System.out.print("선택 : ");
		int invenSelect = sc.nextInt();
		if (invenSelect == 1) {
			swordEquip();
		} else if (invenSelect == 2) {
			itemBox2();
		}else if (invenSelect==3) {
			SwordSell();
		}
	}

	// 방어구
	public static void setWolfProtect(int select) {

		if (gameInfo.equipprotec == slimProtect) {
			gameInfo.def = (gameInfo.def - slimProtectDef) + inven.wolfProtectDef;
			System.out.println("┌──────────────────────────────────────────────┐");
			System.out.println("  " + inven.wolfProtect + " 장착 완료");
			System.out.println("  방어구 스텟 " + (inven.wolfProtectDef - 10) + " 증가");
			System.out.println("  현재 방어구 스텟 : " + gameInfo.def);
			System.out.println("└──────────────────────────────────────────────┘");
			backProtect = gameInfo.equipprotec;
			gameInfo.equipprotec = itemProtecArrs[select - 1];
			itemProtecArrs[select - 1] = backProtect;
		} else if (gameInfo.equipprotec == choboProtect) {
			System.out.println("방어구가 두단계 이상 상승할 수 없습니다.");
		}

	}

	public static void setslimPotec(int select) {

		if (gameInfo.equipprotec == inven.wolfProtect) {
			gameInfo.def = (gameInfo.def - inven.wolfProtectDef) + inven.slimProtectDef;
			System.out.println("┌──────────────────────────────────────────────┐");
			System.out.println("  " + inven.slimProtect + " 장착 완료");
			System.out.println("  방어구 스텟 " + (inven.wolfProtectDef - 10) + "감소");
			System.out.println("  현재 방어구 스텟 : " + gameInfo.def);
			System.out.println("└──────────────────────────────────────────────┘");
//			backProtect = gameInfo.equipprotec;
//			gameInfo.equipprotec = itemProtecArrs[select-1] ;
//			itemProtecArrs[select-1] = backProtect;
		}

		if (itemProtecArrs[select - 1] == slimProtect) {

			gameInfo.def = (gameInfo.def - choboProtectDef) + slimProtectDef;
			System.out.println("┌──────────────────────────────────┐");
			System.out.println(slimProtect + " 장착 완료");
			System.out.println("  방어구 스텟 " + slimProtect + " 증가");
			System.out.println("  현재 방어구 스텟 : " + gameInfo.def);
			System.out.println("└──────────────────────────────────┘");
		} else if (itemProtecArrs[select - 1] == "초보자의 방어구") {
			gameInfo.def = (gameInfo.def - slimProtectDef) + choboProtectDef;
			System.out.println("┌──────────────────────────────────┐");
			System.out.println("  초보자의 방어구 장착 완료");
			System.out.println("  방어구 스텟" + slimProtectDef + " 감소");
			System.out.println("  현재 방어구 스텟 : " + gameInfo.def);
			System.out.println("└──────────────────────────────────┘");
		}
		backProtect = gameInfo.equipprotec;
		gameInfo.equipprotec = itemProtecArrs[select - 1];
		itemProtecArrs[select - 1] = backProtect;
	}

	public static void setChoboProtect(int select) {

		if (gameInfo.equipprotec == slimProtect) {
			gameInfo.def = (gameInfo.def - slimProtectDef) + choboProtectDef;
			System.out.println("┌────────────────────────────┐");
			System.out.println("  " + choboProtect + " 장착 완료");
			System.out.println("  방어구 스텟 " + slimProtectDef + " 감소");
			System.out.println("  현재 방어구 스텟 : " + gameInfo.def);
			System.out.println("└────────────────────────────┘");
			backProtect = gameInfo.equipprotec;
			gameInfo.equipprotec = itemProtecArrs[select - 1];
			itemProtecArrs[select - 1] = backProtect;

		} else if (gameInfo.equipprotec == wolfProtect) {
			System.out.println("방어구가 두단계 이상 하락할 수 없습니다.");
		}

	}

	// 장비
	public static void setWolfSword(int select) {

		if (gameInfo.equipSword == "철소드 (str + 10)") {
			gameInfo.str = (gameInfo.str - choelSwordStr) + inven.wolfSwordStr;
			System.out.println("┌────────────────────────────────────────┐");
			System.out.println("  " + inven.wolfSword + " 장착 완료");
			System.out.println("  힘 스텟 " + choelSword + "차감 후 증가");
			System.out.println("  힘 스텟 " + (inven.wolfSwordStr - 10) + " 증가");
			System.out.println("  현재 힘 스텟 : " + gameInfo.str);
			System.out.println("└────────────────────────────────────────┘");
			backSword = gameInfo.equipSword;
			gameInfo.equipSword = itemSwordArrs[select - 1];
			itemSwordArrs[select - 1] = backSword;
		} else if (gameInfo.equipSword == choboSword) {
			System.out.println("무기가 두단계 이상 상승 할 수 없습니다.");
		}

	}

	public static void setCheolSword(int num) {

		if (gameInfo.equipSword == inven.wolfSword) {
			gameInfo.str = (gameInfo.str - inven.wolfSwordStr) + inven.choelSwordStr;
			System.out.println("┌────────────────────────────────────────┐");
			System.out.println("  " + inven.choelSword + " 장착 완료");
			System.out.println("  힘 스텟 " + wolfSword + "장착 해제로 감소");
			System.out.println("  힘 스텟 " + (inven.wolfSwordStr - 10) + "감소");
			System.out.println("  현재 힘 스텟 : " + gameInfo.str);
			System.out.println("└────────────────────────────────────────┘");
			backSword = gameInfo.equipSword;
			gameInfo.equipSword = itemSwordArrs[num - 1];
			itemSwordArrs[num - 1] = backSword;
		}

		if (itemSwordArrs[num - 1] == "철소드 (str + 10)") {

			gameInfo.str = (gameInfo.str - choboSwordStr) + choelSwordStr;
			System.out.println("┌──────────────────────────────────┐");
			System.out.println("  철소드 장착 완료");
			System.out.println("  힘 스텟 " + choelSwordStr + " 증가");
			System.out.println("  현재 힘 스텟 : " + gameInfo.str);
			System.out.println("└──────────────────────────────────┘");
		} else if (itemSwordArrs[num - 1] == "초보자의 검") {
			gameInfo.str = (gameInfo.str - choelSwordStr) + choboSwordStr;
			System.out.println("┌──────────────────────────────────┐");
			System.out.println("  초보자의 검 장착 완료");
			System.out.println("  힘 스텟" + choelSword + "수치 감소");
			System.out.println("  힘 스텟" + choelSwordStr + " 감소");
			System.out.println("  현재 힘 스텟 : " + gameInfo.str);
			System.out.println("└──────────────────────────────────┘");
		}
		backSword = gameInfo.equipSword;
		gameInfo.equipSword = itemSwordArrs[num - 1];
		itemSwordArrs[num - 1] = backSword;
	}

	public static void setChoboSword(int select) {

		if (gameInfo.equipSword == "철소드 (str + 10)") {
			gameInfo.str = (gameInfo.str - choelSwordStr) + choboSwordStr;
			System.out.println("┌──────────────────────────────────┐");
			System.out.println("  " + choboSword + " 장착 완료");
			System.out.println("  힘 스텟 " + choelSwordStr + " 감소");
			System.out.println("  현재 힘 스텟 : " + gameInfo.str);
			System.out.println("└──────────────────────────────────┘");
			backSword = gameInfo.equipSword;
			gameInfo.equipSword = itemSwordArrs[select - 1];
			itemSwordArrs[select - 1] = backSword;
		} else if (gameInfo.equipSword == wolfSword) {
			System.out.println("무기가 두단계 이상 하락할 수 없습니다.");
		}

	}

}
