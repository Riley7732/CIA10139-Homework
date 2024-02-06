package hw3;

import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息
		int ran1, ran2;
		ran1 = (int) (Math.random() * 10);
		System.out.println("0~9 guess one");
		while (true) {
			if (sc.hasNextInt()) {
				ran2 = sc.nextInt();
				if (ran1 == ran2) {
					System.out.println("猜對了!答案就是" + ran1);
					break;
				} else {
					System.out.println("猜錯了");
				}
			}
		}
//		(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
		int ran3, ran4;
		ran3 = (int) (Math.random() * 101);
		System.out.println("0~100 guess one");
		while (true) {
			if (sc.hasNextInt()) {
				ran4 = sc.nextInt();
				if (ran3 == ran4) {
					System.out.println("猜對了!答案就是" + ran3);
					break;
				} else if (ran3 < ran4) {
					System.out.println("猜錯了~比" + ran4 + "更小");
				} else {
					System.out.println("猜錯了~比" + ran4 + "更大");
				}
			}
		}

	}

}
