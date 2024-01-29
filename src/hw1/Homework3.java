package hw1;

import java.util.Scanner; //Ctrl+Shift+O

public class Homework3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形 (進階功能:加入直角三角形的判斷)
		int a = 0, b = 0, c = 0;
		System.out.println("input three number");
		if (sc.hasNextInt()) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		}
		if ((a + b < c) || (a + c < b) || (b + c < a) || a == 0 || b == 0 || c == 0) {
			System.out.println("不是三角形");
		} else if (a == b && a == c && a != 0) {
			System.out.println("正三角形");
		} else if (a == b || a == c && (b != c || a != c)) {
			System.out.println("等腰三角形");
		} else if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (c * c + b * b == a * a)) {
			System.out.println("直角三角形");
		} else {
			System.out.println("其他三角形");
		}

		System.out.println("==============================");

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

		System.out.println("==============================");

//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字,
//		請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數
		System.out.println("1~9 choose one");
		int hate = 0;
		if (sc.hasNextInt()) {
			hate = sc.nextInt();
		}
		int[] lucky = new int[49];
		int luck = 1, index = 0, count = 0;
		for (; luck < 50; luck++) {
			if (luck % 10 == hate || luck / 10 == hate) {
				continue;
			}
			count++;
			lucky[index] = luck;
			index++;
			System.out.print(luck + " ");
		}
		System.out.println("total= " + count);

		int[] indexLocation = new int[6];
		int sameIndex;
		int r1 = 0;
		for (int x = 0; x < indexLocation.length; x++) {
			sameIndex = 1;
			while (sameIndex == 1) {
				r1 = (int) (Math.random() * count);
				for (int y = 0; y <= 0; y++) {
					if (y == x) {
						sameIndex = 0;
						break;
					} else {
						if (indexLocation[y] == r1) {
							sameIndex = 1;
							break;
						} else {
							sameIndex = 0;
						}
					}
				}
			}
			indexLocation[x] = r1;
		}
		
		int drawNum = 0;
		for (int i = 0; i < 6; i++) {
			drawNum = lucky[indexLocation[i]];
			System.out.print(drawNum + "\t");
		}

	}

}
