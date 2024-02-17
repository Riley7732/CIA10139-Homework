package hw4;

import java.util.Scanner;

public class Borrow {

	public static void main(String[] args) {

//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;
//		並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」

		Scanner sc = new Scanner(System.in);
		System.out.println("要借多少錢？");
		int needMoney = 0;
		needMoney = sc.nextInt();

		System.out.print("有錢可借的員工編號: ");
		int[][] colleague = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		int count = 0;
		for (int i = 0; i < colleague[1].length; i++) {
			if (colleague[1][i] >= needMoney) {
				System.out.print(colleague[0][i] + " ");
				count++;
			}
		}
		System.out.print("共 " + count + " 人");
		sc.close();
	}

}
