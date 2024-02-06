package hw4;

import java.util.Arrays;

public class Average {

	public static void main(String[] args) {

//		有個一維陣列如下:{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素	
		int[] avg = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		Arrays.sort(avg);
		int sum = 0;
		int avgsum = 0;
		for (int i = 0; i < avg.length; i++) {
			sum += avg[i];
		}
		avgsum = sum / 10;
		System.out.println("平均值 = " + avgsum);
		System.out.print("大於平均值的元素 = ");
		for (int i = 0; i < avg.length; i++) {
			if (avg[i] > avgsum) {
				System.out.print(avg[i] + " ");
			}
		}

	}

}
