package hw4;

import java.util.Scanner;

public class DateCount {

	public static void main(String[] args) {

//		請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入三個整數代表西元年, 月, 日");
		int year = 0, month = 0, day = 0;
		if (sc.hasNextInt()) {
			year = sc.nextInt();
			month = sc.nextInt();
			day = sc.nextInt();
		}
		
		int sumDate = 0, error = 0;
		int[] date = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if ((year % 4 != 0) || ((year % 4 == 0) && (year % 100 == 0) && (year % 400 != 0))) {
		}
		else {
			date[1] += 1;
		}
		
		for (int i = 0; i < (month - 1); i++) {
			if ((day > date[month - 1]) || (month > 12)) {
				System.out.println("輸入錯誤！");
				error = 1;
				break;
			}
			sumDate += date[i];
		}
		if (error == 0) {
			sumDate += day;
			System.out.println("日期為 " + year + " 的第 " + sumDate + " 天");
		}
	}

}
