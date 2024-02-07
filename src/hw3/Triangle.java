package hw3;

import java.util.Scanner; //Ctrl+Shift+O

public class Triangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形 (進階功能:加入直角三角形的判斷)
		int a = 0, b = 0, c = 0;
		System.out.println("input three number");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

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

	}

}
