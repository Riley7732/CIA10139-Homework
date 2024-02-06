package hw3;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

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
