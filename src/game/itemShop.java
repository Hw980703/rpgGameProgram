package game;

import java.util.Scanner;

public class itemShop {

	public static Scanner sc = new Scanner(System.in);
	public static int hpPrice;

	public static void itemShop() {
		hpPrice = 50;
		System.out.println(" ┌────── 상점 ───────────┐");
		System.out.println("  1. HP포션 가격 : " + hpPrice + "원 ");
		System.out.println("                        ");
		System.out.println("                        ");
		System.out.println(" └──────────────────────┘");
		System.out.println(" 나의 소지금 : " + gameInfo.money + "원");
		System.out.println(" >>1.구매");
		System.out.println(" >>2.뒤로가기");
		System.out.print("  선택 : ");
		int shopBuy = sc.nextInt();
		switch (shopBuy) {
		case 1:
			posionBuy();
			break;
		case 2:
			dnfStart.gameStart();
			break;
		default:
			System.out.println("올바른 선택을 하세요.");
			itemShop();
			break;
		}

	}

	public static void posionBuy() {
		System.out.println("HP포션 구매");
		System.out.println("구매 수량을 입력하세요.");
		int posionSelect = sc.nextInt();
		if (gameInfo.money >= hpPrice * posionSelect) {
			inven.hpPosion += posionSelect;
			gameInfo.money -= (hpPrice * posionSelect);
			System.out.println();
			System.out.println("HP포션" + posionSelect + "개 구매 완료");
			System.out.println("HP포션 개수 : " + inven.hpPosion);
			System.out.println("현재 소지금 : " + gameInfo.money);
			System.out.println();
			dnfStart.gameStart();
		} else {
			System.out.println();
			System.out.println("소지금이 부족합니다!!");
			System.out.println();
			itemShop();
		}
	}
}
