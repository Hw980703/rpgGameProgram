package game;

import java.util.Scanner;

public class dnfStart {
	static Scanner sc = new Scanner(System.in);
	inven itembox = new inven();
	public static int monsterlevel;
	public static int wolfLevel;
	// 첫번째 실행 화면

	public static void oneStart() {

		if (gameInfo.level == 0) {
			new monsterInfo();
			new gameInfo();
			new inven();
		}

		finish: while (true) {

			int mainSelect = gameInfo.printMenu();

			if (mainSelect == 1) {

				twoStart();
				break;
			}

			else if (mainSelect == 2) {
				System.out.println("게임을 종료합니다.");
				break finish;
			}

			else {
				System.out.println("1~2사이 숫자를 입력해주세요.");
			}
			System.out.println();
		}

	}

	public static void twoStart() {
		// 두번째 실행화면
		finish: while (true) {
			if (gameInfo.heroHp <= 0) {
				break finish;

			} else if (monsterInfo.bossHp <= 0) {
				break finish;
			}

			System.out.println();
			System.out.println("        <<<<<<<< 자바 어드벤처 RPG >>>>>>>>");
			System.out.println("                 >> 1.게임시작       ");
			System.out.println("                 >> 2.캐릭터 생성    ");
			System.out.println("                 >> 3.캐릭터 삭제   ");
			System.out.println("                 >> 4.뒤로가기   ");
			System.out.print("                      선택 : ");
			int twoSelect = sc.nextInt();

			if (twoSelect == 1) {
				if (gameInfo.name == "미생성") {
					gameInfo.userNo();

				} else {

					gameStart();
				}
			} else if (twoSelect == 2) {

				if (gameInfo.name != "미생성") {
					System.out.println();
					System.out.println("캐릭터가 존재합니다");
					System.out.println("캐릭터 삭제 후 재생성 하십시오.");
					System.out.println();

				} else {
					System.out.println();
					gameInfo.userCreate();
					System.out.println();
				}
			}

			else if (twoSelect == 3) {

				if (gameInfo.name == "미생성") {
					System.out.println();
					gameInfo.userNo();
					System.out.println();

				} else {
					System.out.println();
					gameInfo.userSet();
					System.out.println();
				}

			} else if (twoSelect == 4) {
				oneStart();
				break;
			}
		}

	}

///////// 1번 게임 시작
	public static void gameStart() {

		finish:

		for (;;) {
			if (gameInfo.heroHp <= 0) {
				break finish;
			} else if (monsterInfo.bossHp <= 0) {
				break finish;
			}

			System.out.println("******************************");
			System.out.println("1.사냥터 입장");
			System.out.println("2.캐릭터 상태창");
			System.out.println("3.장착 중인 장비");
			System.out.println("4.인벤토리");
			System.out.println("5.상점");
			System.out.println("6.게임 가이드");
			System.out.println("7.보스 도전 캐릭터 만들기");
			System.out.println("10.뒤로가기");
			System.out.println("******************************");
			int gameSelect = sc.nextInt();

			switch (gameSelect) {
			case 1:
				if (gameInfo.heroHp >= 1) {
					gameinput();
					break;
				} else if (gameInfo.heroHp <= 0) {
					break finish;
				} else if (monsterInfo.bossHp <= 0) {
					break finish;
				}

			case 2:
				gameSelf();
				break;
			case 3:
				equipItem();
				break;
			case 4:
				inven.itemBox();
				break;
			case 5:
				itemShop.itemShop();
			case 6:
				gameInfo.gameBook();
				break;
			case 7:
				gameInfo.superUser();
			case 10:
				twoStart();
				break;
			}
		}

	}

//1번 사냥터 입장
	public static void gameinput() {
		finish: if (monsterInfo.bossHp <= 0 || gameInfo.heroHp <= 0) {
			break finish;
		}
		System.out.println("┌──────────────사냥터───────────────┐");
		System.out.println("    1.초보자 던전 : 1레벨 ~ 11레벨    ");
		System.out.println("    2.중급자 던전 : 11레벨 ~ 21레벨    ");
		System.out.println("    3.보스 던전  : 30레벨 ~ 99레벨    ");
		System.out.println("    10.뒤로가기                      ");
		System.out.println("└───────────────────────────────────┘");
		System.out.print("  선택 : ");
		int dgNum = sc.nextInt();
		System.out.println();
		finish: switch (dgNum) {
		case 1:
			level1dg();
			break;
		case 2:
			if (gameInfo.level < 10) {
				System.out.println("중급자 던전은 11레벨 부터 입장 가능합니다.");
				gameinput();
			}
			level2dg();
			break;
		case 3:

			if (monsterInfo.bossHp <= 0) {
				break finish;
			}

			if (gameInfo.level < 29) {
				System.out.println("보스 던전은 30레벨 부터 입장 가능합니다.");
				gameinput();
			}
			bossSe();
			break;
		case 10:
			break;
		default:

			System.out.println();
			System.out.println("┌");
			System.out.println("  올바른 메뉴 선택하세요");
			System.out.println("                         ┘");
			System.out.println();
			gameinput();
		}
	}

// 1번 초보자 던전 입장
	public static void level1dg() {
//	Scanner sc = new Scanner(System.in);
		finish: for (;;) {

			if (monsterInfo.bossHp <= 0 || gameInfo.heroHp <= 0) {
				break finish;
			}

			System.out.println();
			System.out.println("┌                      ┐");
			System.out.println(" ~~~~ 초보자 던전 ~~~~");
			System.out.println("└                      ┘");

			System.out.print("1 : 사냥하기 ");
			System.out.println(" 2 : 마을로 가기");
			System.out.print("선택 >>:");

			int selectUs = sc.nextInt();

			switch (selectUs) {
			case 1:
				level1fg();
				break;
			case 2:
				gameStart();
				break;
			}

		}
	}

//초보자던전 사냥
	public static void level1fg() {

		monsterlevel = monsterInfo.getRandom();
		System.out.println();
		System.out.println("!!!!!!!!!!!!!");
		System.out.println("몬스터 등장");
		System.out.println("LV." + monsterlevel + " 슬라임");
		System.out.println("!!!!!!!!!!!!!");
		int count = 5;
		int HP = 100;

		while (true) {
			if (gameInfo.heroHp <= 0) {
				System.out.println("       ┌─────────────────────────┐");
				System.out.println("         캐릭터가 사망하였습니다.");
				System.out.println("         ------- GAME END ------");
				System.out.println("       └─────────────────────────┘");
				break;
			}
			if (HP <= 0) {
				break;

			}
			System.out.println();

			System.out.println("┌──전투 메뉴───────────────┐");
			System.out.print(" 1.공격 ");
			System.out.print(" 2.스킬 ");
			System.out.println(" 3.가방 ");
			System.out.println("└──────────────────────────┘");
			System.out.print("  선택:");
			int fightSe = sc.nextInt();

			if (fightSe == 1) {
				if (count < 5) {
					count++;
				}
				System.out.println();
				System.out.print("캐릭터가 슬라임을 공격을 했다! ");

//			System.out.println("           슬라임을 공격했다!        ");
				int dmage = gameInfo.getUserAtk();
				HP -= dmage;
				if (HP <= 0) {
					HP = 0;
					System.out.println(" 데미지 : " + dmage + "\n" + " 슬라임의 남은 HP : " + HP);

					System.out.println();
				} else {
					int monsterDg = monsterInfo.getSlimAtk();
					if (monsterDg <= 0) {
						monsterDg = 0;
					}
					gameInfo.heroHp -= monsterDg;
					System.out.println("데미지 : " + dmage + "\n" + "슬라임의 남은 HP : " + HP);

					System.out.println();

					System.out.println();

					System.out.print("슬라임이 캐릭터를 공격했다! ");

//				System.out.println("        슬라임에게 공격을 당했다!");
					System.out.println(" 데미지 : " + monsterDg);
					System.out.println("캐릭터의 남은 HP : " + gameInfo.heroHp);

				}
				if (HP == 0) {
					if (monsterlevel == 1) {
						monsterInfo.getSlimExp(1);

					} else if (monsterlevel == 2) {
						monsterInfo.getSlimExp(2);

					} else if (monsterlevel == 3) {
						monsterInfo.getSlimExp(3);

					} else if (monsterlevel == 4) {
						monsterInfo.getSlimExp(4);

					} else if (monsterlevel == 5) {
						monsterInfo.getSlimExp(5);

					} else if (monsterlevel == 6) {
						monsterInfo.getSlimExp(6);
					} else if (monsterlevel == 7) {
						monsterInfo.getSlimExp(7);
					} else if (monsterlevel == 8) {
						monsterInfo.getSlimExp(8);
					} else if (monsterlevel == 9) {
						monsterInfo.getSlimExp(9);
					} else if (monsterlevel == 10) {
						monsterInfo.getSlimExp(10);
					} else if (monsterlevel == 11) {
						monsterInfo.getSlimExp(11);
					}

					if (gameInfo.exp >= 100) {
						gameInfo.leveUp();

					}
					if (gameInfo.level >= 10) {
						System.out.println("=======================================");
						System.out.println("레벨 10 달성했습니다.");
						System.out.println("전직을 하세요.");
						System.out.println("=======================================");

					}
				}
				if (HP == 0) {
					System.out.println();

					System.out.println("전리품을 얻었습니다!");
					System.out.println();
					int randG = monsterInfo.rand.nextInt(10) + 1;

					if (randG >= 1 && randG <= 3) {
						inven.slimac += 1;
						System.out.println("획득 : 슬라임의 액체");
						System.out.println("[보유한 슬라임의 액체 : " + inven.slimac + "개]");
						System.out.println("=======================================");
						System.out.println();
						break;

					} else if (randG >= 4 && randG <= 6) {
						inven.hpPosion += 1;
						System.out.println("획득 : 체력포션");
						System.out.println("[보유한 체력포션 : " + inven.hpPosion + "개]");
						System.out.println("=======================================");
						System.out.println();
						break;

					} else if (randG == 7 || randG == 8) {

						System.out.println("획득 : "+inven.choelSword);
						for (int i = 0; i < inven.itemSwordArrs.length; i++) {
							if (inven.itemSwordArrs[i] == "없음") {
								System.out.println((i + 1) + "번 인벤토리에 저장되었습니다");
								inven.itemSwordArrs[i] = inven.choelSword;

								break;
							} else if (inven.itemSwordArrs[9] != "없음") {
								System.out.println("인벤토리가 꽉 찼습니다.");
								System.out.println("상점에서 아이템을 판매해주세요.");
								break;
							}
						}
						System.out.println("=======================================");
						System.out.println();

						break;
					} else if (randG == 9 || randG == 10) {

						System.out.println("획득 : " + inven.slimProtect);
						for (int i = 0; i < inven.itemProtecArrs.length; i++) {
							if (inven.itemProtecArrs[i] == "없음") {
								System.out.println((i + 1) + "번 인벤토리에 저장되었습니다");
								inven.itemProtecArrs[i] = inven.slimProtect;

								break;
							} else if (inven.itemProtecArrs[9] != "없음") {
								System.out.println("인벤토리가 꽉 찼습니다.");
								System.out.println("상점에서 아이템을 판매해주세요.");
								break;
							}
						}
						System.out.println("=======================================");
						System.out.println();

						break;
					}

				}
			} else if (fightSe == 2) {
				int skill1 = gameInfo.getSkillAtk();
				// Scanner sc = new Scanner(System.in);
				System.out.println();
				System.out.println("┌──스킬선택──────────────────┐");
				System.out.println("  1.차지어택 " + count + " / " + 5);
				System.out.println("  2.뒤로가기");
				System.out.println("└────────────────────────────┘");

				System.out.print(">>선택:");

				int skillSelect = sc.nextInt();

				if (skillSelect == 1) {
					if (count == 5) {

						int monsterDg = monsterInfo.getSlimAtk();
						if (monsterDg <= 0) {
							monsterDg = 0;
						}
						System.out.println();
						System.out.print("차지어택! ");
						HP -= skill1;
						if (HP <= 0) {
							HP = 0;
							System.out.println(" 스킬 데미지:" + skill1 + "\n" + "슬라임의 남은 HP:" + HP);
							System.out.println();

						} else if (HP >= 1) {
							System.out.println(" 스킬 데미지:" + skill1 + "\n" + "슬라임의 남은 HP:" + HP);
							System.out.println();
						}

						if (HP >= 1) {
							System.out.print("슬라임이 캐릭터를 공격했다! ");

//					System.out.println("        슬라임에게 공격을 당했다!");
							System.out.println(" 데미지 : " + monsterDg);
							System.out.println("캐릭터의 남은 HP : " + (gameInfo.heroHp -= monsterDg));

							System.out.println();
							count = 1;
						}
						if (HP <= 0) {
							if (monsterlevel == 1) {
								monsterInfo.getSlimExp(1);
//						
							} else if (monsterlevel == 2) {
								monsterInfo.getSlimExp(2);

							} else if (monsterlevel == 3) {
								monsterInfo.getSlimExp(3);

							} else if (monsterlevel == 4) {
								monsterInfo.getSlimExp(4);

							} else if (monsterlevel == 5) {
								monsterInfo.getSlimExp(5);

							} else if (monsterlevel == 6) {
								monsterInfo.getSlimExp(6);
							} else if (monsterlevel == 7) {
								monsterInfo.getSlimExp(7);
							} else if (monsterlevel == 8) {
								monsterInfo.getSlimExp(8);
							} else if (monsterlevel == 9) {
								monsterInfo.getSlimExp(9);
							} else if (monsterlevel == 10) {
								monsterInfo.getSlimExp(10);
							} else if (monsterlevel == 11) {
								monsterInfo.getSlimExp(11);
							}
						}
						if (HP <= 0) {

							System.out.println("전리품을 얻었습니다!");
							System.out.println();
							int randG = monsterInfo.rand.nextInt(10) + 1;

							if (randG >= 1 && randG <= 3) {
								inven.slimac += 1;
								System.out.println("획득 : 슬라임의 액체");
								System.out.println("[보유한 슬라임의 액체 : " + inven.slimac + "개]");
								System.out.println("=======================================");
								System.out.println();
//							break;

							} else if (randG >= 4 && randG <= 6) {
								inven.hpPosion += 1;
								System.out.println("획득 : 체력포션");
								System.out.println("[보유한 체력포션 : " + inven.hpPosion + "개]");
								System.out.println("=======================================");
								System.out.println();
//							break;

							} else if (randG == 7 | randG == 8) {
								System.out.println("획득 : "+inven.choelSword);
								for (int i = 0; i < inven.itemSwordArrs.length; i++) {
									if (inven.itemSwordArrs[i] == "없음") {
										System.out.println((i + 1) + "번 인벤토리에 저장되었습니다");
										inven.itemSwordArrs[i] = inven.choelSword;

										break;
									} else if (inven.itemSwordArrs[9] != "없음") {
										System.out.println("인벤토리가 꽉 찼습니다.");
										System.out.println("상점에서 아이템을 판매해주세요.");
										break;
									}
								}
								System.out.println("=======================================");
								System.out.println();

//							break;
							} else if (randG == 9 || randG == 10) {

								System.out.println("획득 : " + inven.slimProtect);
								for (int i = 0; i < inven.itemProtecArrs.length; i++) {
									if (inven.itemProtecArrs[i] == "없음") {
										System.out.println((i + 1) + "번 인벤토리에 저장되었습니다");
										inven.itemProtecArrs[i] = inven.slimProtect;

										break;
									} else if (inven.itemProtecArrs[9] != "없음") {
										System.out.println("인벤토리가 꽉 찼습니다.");
										System.out.println("상점에서 아이템을 판매해주세요.");
										break;
									}
								}
								System.out.println("=======================================");
								System.out.println();

								break;
							}

						}
						if (gameInfo.exp >= 100) {
							gameInfo.leveUp();

						}
//						if (gameInfo.level >= 10) {
//							System.out.println("=======================================");
//							System.out.println("레벨 10 달성했습니다.");
//							System.out.println("전직을 하세요.");
//							System.out.println("=======================================");
//
//						}
						System.out.println();
					} else if (count != 5) {
						System.out.println();
						System.out.println("**스킬은 게이지 5 를 채워야합니다.일반공격시 1씩 채워집니다.**");
						System.out.println();
					}

				} else if (skillSelect == 2) {
				}
				if (gameInfo.exp >= 100) {
					gameInfo.leveUp();

				}
				if (gameInfo.level >= 10) {
					System.out.println("=======================================");
					System.out.println("레벨 10 달성했습니다.");
					System.out.println("전직을 하세요.");
					System.out.println("=======================================");
				}
			} else if (fightSe == 3) {
				int bagSelect;
				System.out.println("┌──────────────가방──────────────┐");
				System.out.println(" 1.체력포션(HP+30) : " + inven.hpPosion + "개  ");
				System.out.println(" 2.뒤로가기");
				System.out.println(" 현재 남은 체력 : " + gameInfo.heroHp);
				System.out.println("└────────────────────────────────┘");

				System.out.print(">>선택 : ");
				bagSelect = sc.nextInt();

				if (bagSelect == 1) {
					if (inven.hpPosion >= 1) {

						if (gameInfo.heroHp >= 100) {

							System.out.println("체력이 최대치입니다.");
						} else if (gameInfo.heroHp <= 99) {
							gameInfo.heroHp += 30;
							if (gameInfo.heroHp > 100) {
								gameInfo.heroHp = 100;
							}
							inven.hpPosion -= 1;
							System.out.println();
							System.out.println("┌─── 체력 30 증가 ─────────┐");
							System.out.println(" 현재 체력 : " + gameInfo.heroHp);
							System.out.println(" HP포션 개수 : " + inven.hpPosion + "개");
							System.out.println("└──────────────────────────┘");

							int monsterDg = monsterInfo.getSlimAtk();
							if (monsterDg <= 0) {
								monsterDg = 0;
							}
							System.out.println();

							System.out.print("슬라임이 캐릭터를 공격했다! ");

//						System.out.println("        슬라임에게 공격을 당했다!");
							System.out.println(" 데미지 : " + monsterDg);
							System.out.println("캐릭터의 남은 HP : " + (gameInfo.heroHp -= monsterDg));

							System.out.println();
						}
					} else if (inven.hpPosion <= 0) {
						System.out.println("*********************");
						System.out.println("HP포션이 부족합니다!!");
						System.out.println("현재 HP포션 개수 : " + inven.hpPosion + "개");
						System.out.println("*********************");
					}
				}
			}

		}
	}

	// 2레벨 중급자 던전
	public static void level2dg() {
//		Scanner sc = new Scanner(System.in);
		finish: for (;;) {
			if (gameInfo.heroHp <= 0) {
				break finish;
			}

			System.out.println();
			System.out.println("┌                      ┐");
			System.out.println(" ~~~~ 중급자 던전 ~~~~");
			System.out.println("└                      ┘");

			System.out.print("1 : 사냥하기 ");
			System.out.println(" 2 : 마을로 가기");
			System.out.print("선택 >>:");

			int selectUs = sc.nextInt();

			switch (selectUs) {
			case 1:
				level2fg();
				break;
			case 2:
				gameStart();
				break;
			}

		}
	}

	// 보스던전

	public static void bossSe() {
//		Scanner sc = new Scanner(System.in);

		finish: for (;;) {
			if (gameInfo.heroHp <= 0) {
				break finish;
			} else if (monsterInfo.bossHp <= 0) {
				break finish;
			}

			System.out.println();
			System.out.println("┌                      ┐");
			System.out.println("   ~~~~ 보스 던전 ~~~~");
			System.out.println("└                      ┘");
			System.out.println("처치시 게임 엔딩이 진행됩니다!");

			System.out.print("1 : 도전하기 ");
			System.out.println(" 2 : 마을로 가기");
			System.out.print("선택 >>:");

			int selectUs = sc.nextInt();

			switch (selectUs) {
			case 1:
				bossDg();
				break;
			case 2:
				gameStart();
				break;
			}

		}
	}
	// 보스 던전

	public static void bossDg() {

		wolfLevel = monsterInfo.getWolfRandom();
		System.out.println();

		System.out.println("          ___====-_  _-====___\r\n" + "           _--^^^#####//      \\\\#####^^^--_\r\n"
				+ "        _-^##########// (    ) \\\\##########^-_\r\n"
				+ "       -############//  |\\^^/|  \\\\############-\r\n"
				+ "     _/############//   (@::@)   \\\\############\\_\r\n"
				+ "    /#############((     \\\\//     ))#############\\\r\n"
				+ "   -###############\\\\    (oo)    //###############-\r\n"
				+ "  -#################\\\\  / VV \\  //#################-\r\n"
				+ " -###################\\\\/      \\//###################-\r\n"
				+ "_#/|##########/\\######(   /\\   )######/\\##########|\\#_\r\n"
				+ "|/ |#/\\#/\\#/\\/  \\#/\\##\\  |  |  /##/\\#/  \\/\\#/\\#/\\#| \\|\r\n"
				+ "`  |/  V  V  `   V  \\#\\| |  | |/#/  V   '  V  V  \\|  '\r\n"
				+ "   `   `  `      `   / | |  | | \\   '      '  '   '\r\n" + "                    (  | |  | |  )\r\n"
				+ "                   __\\ | |  | | /__\r\n" + "                  (vvv(VVV)(VVV)vvv)");
		System.out.println("!!!!!!!!!!!!!");
		System.out.println("보스 등장!");
		System.out.println("LV." + monsterInfo.bossLevel + " 자바드래곤");
		System.out.println("!!!!!!!!!!!!!");
		int count = 5;

		finish: while (true) {
			if (gameInfo.heroHp <= 0) {
				System.out.println("       ┌─────────────────────────┐");
				System.out.println("         캐릭터가 사망하였습니다.");
				System.out.println("         ------- GAME END ------");
				System.out.println("       └─────────────────────────┘");
				break;
			} else if (monsterInfo.bossHp <= 0) {
				System.out.println("       ┌─────────────────────────┐");
				System.out.println("        	   자바 드래곤 처치 !");
				System.out.println("         ------- GAME END ------");
				System.out.println("       └─────────────────────────┘");
				break;
			}
			System.out.println();

			System.out.println("┌──전투 메뉴───────────────┐");
			System.out.print(" 1.공격 ");
			System.out.print(" 2.스킬 ");
			System.out.println(" 3.가방 ");
			System.out.println("└──────────────────────────┘");
			System.out.print("  선택:");
			int fightSe = sc.nextInt();

			if (fightSe == 1) {
				if (count < 5) {
					count++;
				}
				System.out.println();
				System.out.println("캐릭터가 " + monsterInfo.boss + "을 공격을 했다!");
				int dmage = gameInfo.getUserAtk() + 10;
				monsterInfo.bossHp -= dmage;
				if (monsterInfo.bossHp <= 0) {
					monsterInfo.bossHp = 0;
					System.out.println("데미지 : " + dmage + "\n" + monsterInfo.boss + "의 남은 HP : " + monsterInfo.bossHp);

					System.out.println();
				} else {
					int bossDg = monsterInfo.getBossAtk();
					gameInfo.heroHp -= bossDg;
					System.out.println("데미지 : " + dmage + "\n" + monsterInfo.boss + "의 남은 HP : " + monsterInfo.bossHp);

					System.out.println();

					System.out.println();

					System.out.println(monsterInfo.boss + "이 캐릭터를 공격했다!");

					System.out.println("데미지 : " + bossDg);
					System.out.println("캐릭터의 남은 HP : " + gameInfo.heroHp);

				}
				if (monsterInfo.bossHp <= 0) {
					System.out.println("자바 드래곤을 처치하였습니다!");
					System.out.println("마을의 평화가 찾아왔습니다...!");
					System.out.println("게임이 종료 됩니다..........");
					break finish;
				}
			} else if (fightSe == 2) {
				int skill1 = gameInfo.getSkillAtk();
//		Scanner sc = new Scanner(System.in);
				System.out.println();
				System.out.println("┌──스킬선택──────────────────┐");
				System.out.println("  1.차지어택 " + count + " / " + 5);
				System.out.println("  2.뒤로가기");
				System.out.println("└────────────────────────────┘");

				System.out.print(">>선택:");

				int skillSelect = sc.nextInt();

				if (skillSelect == 1) {
					if (count == 5) {
						monsterInfo.bossHp -= skill1;
						if (monsterInfo.bossHp <= 0) {
							monsterInfo.bossHp = 0;
						}
						int bossDg = monsterInfo.getBossAtk();
						System.out.println();
						System.out.println("차지어택!");

						System.out.println(
								"스킬 데미지:" + skill1 + "\n" + monsterInfo.boss + "의 남은 HP:" + monsterInfo.bossHp);
						System.out.println();

						System.out.println(monsterInfo.boss + "이 캐릭터를 공격했다!");

//					System.out.println("        슬라임에게 공격을 당했다!");
						System.out.println("데미지 : " + bossDg);
						System.out.println("캐릭터의 남은 HP : " + (gameInfo.heroHp -= bossDg));

						System.out.println();
						count = 1;
						if (monsterInfo.bossHp <= 0) {
							System.out.println("자바 드래곤을 처치하였습니다!");
							System.out.println("마을의 평화가 찾아왔습니다...!");
							System.out.println("게임이 종료 됩니다..........");
							break finish;
						}

					} else if (count != 5) {
						System.out.println();
						System.out.println("**스킬은 5게이지를 채워야합니다.일반공격시 1게이지씩 채워집니다.**");
						System.out.println();
					}

				} else if (skillSelect == 2) {
				}

			} else if (fightSe == 3) {
				int bagSelect;
				System.out.println("┌──────────────가방──────────────┐");
				System.out.println(" 1.체력포션(HP+30) : " + inven.hpPosion + "개  ");
				System.out.println(" 2.뒤로가기");
				System.out.println(" 현재 남은 체력 : " + gameInfo.heroHp);
				System.out.println("└────────────────────────────────┘");

				System.out.print(">>선택 : ");
				bagSelect = sc.nextInt();

				if (bagSelect == 1) {
					if (inven.hpPosion >= 1) {

						if (gameInfo.heroHp >= 100) {

							System.out.println("체력이 최대치입니다.");
						} else if (gameInfo.heroHp <= 99) {
							gameInfo.heroHp += 30;
							if (gameInfo.heroHp > 100) {
								gameInfo.heroHp = 100;
							}
							inven.hpPosion -= 1;
							System.out.println();
							System.out.println("┌─── 체력 30 증가 ─────────┐");
							System.out.println(" 현재 체력 : " + gameInfo.heroHp);
							System.out.println(" HP포션 개수 : " + inven.hpPosion + "개");
							System.out.println("└──────────────────────────┘");

							int bossDg = monsterInfo.getBossAtk();

							System.out.println();

							System.out.println(monsterInfo.boss + "이 캐릭터를 공격했다!");

//						System.out.println("        슬라임에게 공격을 당했다!");
							System.out.println("데미지 : " + bossDg);
							System.out.println("캐릭터의 남은 HP : " + (gameInfo.heroHp -= bossDg));

							System.out.println();
						}
					} else if (inven.hpPosion <= 0) {
						System.out.println("*********************");
						System.out.println("HP포션이 부족합니다!!");
						System.out.println("현재 HP포션 개수 : " + inven.hpPosion + "개");
						System.out.println("*********************");
					}
				}
			}
		}
	}

	// 초보자던전 사냥
	public static void level2fg() {

		wolfLevel = monsterInfo.getWolfRandom();
		System.out.println();
		System.out.println("!!!!!!!!!!!!!");
		System.out.println("몬스터 등장");
		System.out.println("LV." + wolfLevel + " 웨어울프");
		System.out.println("!!!!!!!!!!!!!");
		int count = 5;
		int HP = 100;

		while (true) {
			if (gameInfo.heroHp <= 0) {
				System.out.println("       ┌─────────────────────────┐");
				System.out.println("         캐릭터가 사망하였습니다.");
				System.out.println("         ------- GAME END ------");
				System.out.println("       └─────────────────────────┘");
				break;
			}
			System.out.println();

			System.out.println("┌──전투 메뉴───────────────┐");
			System.out.print(" 1.공격 ");
			System.out.print(" 2.스킬 ");
			System.out.println(" 3.가방 ");
			System.out.println("└──────────────────────────┘");
			System.out.print("  선택:");
			int fightSe = sc.nextInt();

			if (fightSe == 1) {
				if (count < 5) {
					count++;
				}
				System.out.println();
				System.out.println("캐릭터가 " + monsterInfo.wolf + "을 공격을 했다!");
				int dmage = gameInfo.getUserAtk() + 10;
				HP -= dmage;
				if (HP <= 0) {
					HP = 0;
					System.out.println("데미지 : " + dmage + "\n" + monsterInfo.wolf + "의 남은 HP : " + HP);

					System.out.println();
				} else {
					int monsterDg = monsterInfo.getWolfAtk();
					if (monsterDg <= 0) {
						monsterDg = 0;
					}
					gameInfo.heroHp -= monsterDg;
					System.out.println("데미지 : " + dmage + "\n" + monsterInfo.wolf + "의 남은 HP : " + HP);

					System.out.println();

					System.out.println();

					System.out.println(monsterInfo.wolf + "가 캐릭터를 공격했다!");

					System.out.println("데미지 : " + monsterDg);
					System.out.println("캐릭터의 남은 HP : " + gameInfo.heroHp);

				}
				if (HP == 0) {
					if (wolfLevel == 11) {
						monsterInfo.getWolfExp(1);

					} else if (wolfLevel == 12) {
						monsterInfo.getWolfExp(2);

					} else if (wolfLevel == 13) {
						monsterInfo.getWolfExp(3);

					} else if (wolfLevel == 14) {
						monsterInfo.getWolfExp(4);

					} else if (wolfLevel == 15) {
						monsterInfo.getWolfExp(5);

					} else if (wolfLevel == 16) {
						monsterInfo.getWolfExp(6);
					} else if (wolfLevel == 17) {
						monsterInfo.getWolfExp(7);
					} else if (wolfLevel == 18) {
						monsterInfo.getWolfExp(8);
					} else if (wolfLevel == 19) {
						monsterInfo.getWolfExp(9);
					} else if (wolfLevel == 20) {
						monsterInfo.getWolfExp(10);
					} else if (wolfLevel == 21) {
						monsterInfo.getWolfExp(11);
					}

					if (gameInfo.exp >= 100) {
						gameInfo.leveUp();

					}
					if (gameInfo.level >= 10) {
						System.out.println("=======================================");
						System.out.println("레벨 10 달성했습니다.");
						System.out.println("전직을 하세요.");
						System.out.println("=======================================");

					}
				}
				if (HP == 0) {
					System.out.println();

					System.out.println("전리품을 얻었습니다!");
					System.out.println();
					int randG = monsterInfo.rand.nextInt(10) + 1;

					if (randG >= 1 && randG <= 3) {
						inven.wolfItemNum += 1;
						System.out.println("획득 : " + inven.wolfItem);
						System.out.println("[보유한" + inven.wolfItem + ":" + inven.wolfItemNum + " 개]");
						System.out.println("=======================================");
						System.out.println();
						break;

					} else if (randG >= 4 && randG <= 6) {
						inven.hpPosion += 1;
						System.out.println("획득 : 체력포션");
						System.out.println("[보유한 체력포션 : " + inven.hpPosion + "개]");
						System.out.println("=======================================");
						System.out.println();
						break;

					} else if (randG == 7 | randG == 8) {

						System.out.println("획득 : " + inven.wolfSword);
						for (int i = 0; i < inven.itemSwordArrs.length; i++) {
							if (inven.itemSwordArrs[i] == "없음") {
								System.out.println((i + 1) + "번 인벤토리에 저장되었습니다");
								inven.itemSwordArrs[i] = inven.wolfSword;

								break;
							} else if (inven.itemSwordArrs[9] != "없음") {
								System.out.println("인벤토리가 꽉 찼습니다.");
								System.out.println("상점에서 아이템을 판매해주세요.");
								break;
							}
						}
						System.out.println("=======================================");
						System.out.println();

						break;
					}

					else if (randG == 9 || randG == 10) {

						System.out.println("획득 : " + inven.wolfProtect);
						for (int i = 0; i < inven.itemProtecArrs.length; i++) {
							if (inven.itemProtecArrs[i] == "없음") {
								System.out.println((i + 1) + "번 인벤토리에 저장되었습니다");
								inven.itemProtecArrs[i] = inven.wolfProtect;

								break;
							} else if (inven.itemProtecArrs[9] != "없음") {
								System.out.println("인벤토리가 꽉 찼습니다.");
								System.out.println("상점에서 아이템을 판매해주세요.");
								break;
							}
						}
						System.out.println("=======================================");
						System.out.println();

						break;
					}

//				
				}
			} else if (fightSe == 2) {
				int skill1 = gameInfo.getSkillAtk();
//			Scanner sc = new Scanner(System.in);
				System.out.println();
				System.out.println("┌──스킬선택──────────────────┐");
				System.out.println("  1.차지어택 " + count + " / " + 5);
				System.out.println("  2.뒤로가기");
				System.out.println("└────────────────────────────┘");

				System.out.print(">>선택:");

				int skillSelect = sc.nextInt();

				if (skillSelect == 1) {
					if (count == 5) {
						HP -= skill1;
						if (HP <= 0) {
							HP = 0;
						}
						int monsterDg = monsterInfo.getWolfAtk();
						if (monsterDg <= 0) {
							monsterDg = 0;
						}
						System.out.println();
						System.out.println("차지어택!");

						System.out.println("스킬 데미지:" + skill1 + "\n" + monsterInfo.wolf + "의 남은 HP:" + HP);
						System.out.println();

						System.out.println(monsterInfo.wolf + "가 캐릭터를 공격했다!");

//						System.out.println("        슬라임에게 공격을 당했다!");
						System.out.println("데미지 : " + monsterDg);
						System.out.println("캐릭터의 남은 HP : " + (gameInfo.heroHp -= monsterDg));

						System.out.println();
						count = 1;
						if (HP <= 0) {
							if (wolfLevel == 11) {
								monsterInfo.getWolfExp(1);
//							
							} else if (wolfLevel == 12) {
								monsterInfo.getWolfExp(2);

							} else if (wolfLevel == 13) {
								monsterInfo.getWolfExp(3);

							} else if (wolfLevel == 14) {
								monsterInfo.getWolfExp(4);

							} else if (wolfLevel == 15) {
								monsterInfo.getWolfExp(5);

							} else if (wolfLevel == 16) {
								monsterInfo.getWolfExp(6);
							} else if (wolfLevel == 17) {
								monsterInfo.getWolfExp(7);
							} else if (wolfLevel == 18) {
								monsterInfo.getWolfExp(8);
							} else if (wolfLevel == 19) {
								monsterInfo.getWolfExp(9);
							} else if (wolfLevel == 20) {
								monsterInfo.getWolfExp(10);
							} else if (wolfLevel == 21) {
								monsterInfo.getWolfExp(11);
							}
						}
						if (HP == 0) {
							System.out.println();

							System.out.println("전리품을 얻었습니다!");
							System.out.println();
							int randG = monsterInfo.rand.nextInt(10) + 1;

							if (randG >= 1 && randG <= 3) {
								inven.wolfItemNum += 1;
								System.out.println("획득 : " + inven.wolfItem);
								System.out.println("[보유한" + inven.wolfItem + ":" + inven.wolfItemNum + " 개]");
								System.out.println("=======================================");
								System.out.println();
								break;

							} else if (randG >= 4 && randG <= 6) {
								inven.hpPosion += 1;
								System.out.println("획득 : 체력포션");
								System.out.println("[보유한 체력포션 : " + inven.hpPosion + "개]");
								System.out.println("=======================================");
								System.out.println();
								break;

							}  else if (randG == 7 || randG == 8) {

								System.out.println("획득 : " + inven.wolfSword);
								for (int i = 0; i < inven.itemSwordArrs.length; i++) {
									if (inven.itemSwordArrs[i] == "없음") {
										System.out.println((i + 1) + "번 인벤토리에 저장되었습니다");
										inven.itemSwordArrs[i] = inven.wolfSword;

										break;
									} else if (inven.itemSwordArrs[9] != "없음") {
										System.out.println("인벤토리가 꽉 찼습니다.");
										System.out.println("상점에서 아이템을 판매해주세요.");
										break;
									}
								}
								System.out.println("=======================================");
								System.out.println();

								break;
							}

							else if (randG == 9 || randG == 10) {

								System.out.println("획득 : " + inven.wolfProtect);
								for (int i = 0; i < inven.itemProtecArrs.length; i++) {
									if (inven.itemProtecArrs[i] == "없음") {
										System.out.println((i + 1) + "번 인벤토리에 저장되었습니다");
										inven.itemProtecArrs[i] = inven.wolfProtect;

										break;
									} else if (inven.itemProtecArrs[9] != "없음") {
										System.out.println("인벤토리가 꽉 찼습니다.");
										System.out.println("상점에서 아이템을 판매해주세요.");
										break;
									}
								}
								System.out.println("=======================================");
								System.out.println();

								break;
							}

						}
						if (gameInfo.exp >= 100) {
							gameInfo.leveUp();

						}
//							if (gameInfo.level >= 10) {
//								System.out.println("=======================================");
//								System.out.println("레벨 10 달성했습니다.");
//								System.out.println("전직을 하세요.");
//								System.out.println("=======================================");
//
//							}
//							System.out.println();
					} else if (count != 5) {
						System.out.println();
						System.out.println("**스킬은 5게이지를 채워야합니다.일반공격시 1게이지씩 채워집니다.**");
						System.out.println();
					}

				} else if (skillSelect == 2) {
				}
				if (gameInfo.exp >= 100) {
					gameInfo.leveUp();

				}
				if (gameInfo.level >= 10) {
					System.out.println("=======================================");
					System.out.println("레벨 10 달성했습니다.");
					System.out.println("전직을 하세요.");
					System.out.println("=======================================");
				}
			} else if (fightSe == 3) {
				int bagSelect;
				System.out.println("┌──────────────가방──────────────┐");
				System.out.println(" 1.체력포션(HP+30) : " + inven.hpPosion + "개  ");
				System.out.println(" 2.뒤로가기");
				System.out.println(" 현재 남은 체력 : " + gameInfo.heroHp);
				System.out.println("└────────────────────────────────┘");

				System.out.print(">>선택 : ");
				bagSelect = sc.nextInt();

				if (bagSelect == 1) {
					if (inven.hpPosion >= 1) {

						if (gameInfo.heroHp >= 100) {

							System.out.println("체력이 최대치입니다.");
						} else if (gameInfo.heroHp <= 99) {
							gameInfo.heroHp += 30;
							if (gameInfo.heroHp > 100) {
								gameInfo.heroHp = 100;
							}
							inven.hpPosion -= 1;
							System.out.println();
							System.out.println("┌─── 체력 30 증가 ─────────┐");
							System.out.println(" 현재 체력 : " + gameInfo.heroHp);
							System.out.println(" HP포션 개수 : " + inven.hpPosion + "개");
							System.out.println("└──────────────────────────┘");

							int monsterDg = monsterInfo.getWolfAtk();
							if (monsterDg <= 0) {
								monsterDg = 0;
							}

							System.out.println();

							System.out.println(monsterInfo.wolf + "가 캐릭터를 공격했다!");

//							System.out.println("        슬라임에게 공격을 당했다!");
							System.out.println("데미지 : " + monsterDg);
							System.out.println("캐릭터의 남은 HP : " + (gameInfo.heroHp -= monsterDg));

							System.out.println();
						}
					} else if (inven.hpPosion <= 0) {
						System.out.println("*********************");
						System.out.println("HP포션이 부족합니다!!");
						System.out.println("현재 HP포션 개수 : " + inven.hpPosion + "개");
						System.out.println("*********************");
					}
				}
			}
		}
	}

	public static void dnfStart() {

		finish:

		for (;;) {
			if (gameInfo.heroHp >= 100) {
				System.out.println("******************************");
				System.out.println("1.사냥터 입장");
				System.out.println("2.캐릭터 상태창");
				System.out.println("3.장착 중인 장비");
				System.out.println("4.인벤토리");
				System.out.println("5.상점");
				System.out.println("6.전직");
				System.out.println("7.스킬");
				System.out.println("8.캐릭터 정보");
				System.out.println("9.게임 가이드");
				System.out.println("10.뒤로가기");
				System.out.println("******************************");

			} else if (gameInfo.heroHp <= 0) {
				break finish;
			}
			int gameSelect = sc.nextInt();

			switch (gameSelect) {
			case 1:
				if (gameInfo.heroHp >= 1) {
					gameinput();
					break;
				} else {
					break finish;
				}

			case 2:
				gameSelf();
				break;
			case 3:
				equipItem();
				break;
			case 4:
				itemBox();
				break;
			case 9:
				gameInfo.gameBook();
				break;
			case 10:
				break finish;
			}
		}

	}

	// 2번 캐릭터 상태창
	public static void gameSelf() {
		System.out.println("┌──────────────────┐");
		System.out.println(" ------ 상태 ------");
		System.out.println(" 레벨 : " + gameInfo.level + "");
		System.out.println(" 경험치 : " + gameInfo.exp + "");
		System.out.println(" 소지금 : " + gameInfo.money + "원");
		System.out.println(" ------ 스텟 ------");
		System.out.println(" 힘 : " + gameInfo.str + "");
		System.out.println(" 방어력 : " + gameInfo.def + "");
		System.out.println(" 남은 체력 : " + gameInfo.heroHp + "");
		System.out.println("                   ");
		System.out.println("└──────────────────┘");

	}

	public static void equipItem() {
		System.out.println(" ┌───────────장착중인 장비───────────┐");
		System.out.println("   무기   : " + gameInfo.equipSword);
		System.out.println("   방어구 : " + gameInfo.equipprotec);
		System.out.println(" └───────────────────────────────────┘");

	}

	public static void itemBox() {
		Scanner sc = new Scanner(System.in);
		System.out.println("┌────────── 무기 인벤토리 ──────────┐");
		System.out.println(" 1  : " + inven.itemSwordArrs[0]);
		System.out.println(" 2  : " + inven.itemSwordArrs[1]);
		System.out.println(" 3  : " + inven.itemSwordArrs[2]);
		System.out.println(" 4  : " + inven.itemSwordArrs[3]);
		System.out.println(" 5  : " + inven.itemSwordArrs[4]);
		System.out.println(" 6  : " + inven.itemSwordArrs[5]);
		System.out.println(" 7  : " + inven.itemSwordArrs[6]);
		System.out.println(" 8  : " + inven.itemSwordArrs[7]);
		System.out.println(" 9  : " + inven.itemSwordArrs[8]);
		System.out.println(" 10 : " + inven.itemSwordArrs[9]);
		System.out.println("└───────────────────────────────────┘");

		System.out.println("<< 메뉴 >>");
		System.out.println(">>1.무기 장착");
		System.out.println(">>2.방어구 인벤토리");
		System.out.println(">>3.뒤로가기");
		System.out.print("선택 : ");
		int invenSelect = sc.nextInt();
		if (invenSelect == 1) {
			inven.swordEquip();
		} else if (invenSelect == 2) {
			inven.itemBox2();
		}
	}

//	public static void monsterAtk() {
//		int monsterDg = monsterInfo.slimAtk +monsterInfo.radom - gameInfo.def;
//		gameInfo.heroHp -= monsterDg;
//		System.out.println("              데미지:" + dmage + "              " + "\n" + "        슬라임의 남은 HP :"
//				+ HP + "            ");
//		System.out.println(" ************************************");
//		System.out.println("└───────────────────────────────────┘");
//		System.out.println();
//
//		System.out.println();
//		System.out.println("┌───────────────────────────────────┐");
//		System.out.println(" /// 슬라임이 캐릭터를 공격했다! ///");
//		System.out.println(" ************************************");
////	System.out.println("        슬라임에게 공격을 당했다!");
//		System.out.println("              데미지 : " + monsterDg);
//		System.out.println("         캐릭터의 남은 HP : " + gameInfo.heroHp);
//		System.out.println(" ************************************");
//		System.out.println("└───────────────────────────────────┘");
//	}

}
