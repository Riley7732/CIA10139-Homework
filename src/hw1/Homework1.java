package hw1;

public class Homework1 {
	
	public static void main(String[] args) {
		
//	請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 12, b = 6;
		System.out.print("1. 和：" + (a + b));
		System.out.println(" 積：" + (a * b));
		
//	請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int egg = 200;
		int dozen = egg/12;
		System.out.print("2. 打：" + dozen);
		int leave = egg%12;
		System.out.println(" 剩餘：" + leave);
		
//	請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int totaltime = 256559;
		int days = (totaltime/(24*60*60));
		System.out.print("3. " + (days) + "天");
		int hours =  (totaltime%(24*60*60)/(60*60));
		System.out.print(hours + "小時");
		int mins = (totaltime%(60*60)/60);
		System.out.print(mins + "分鐘");
		int seconds = (totaltime%60);
		System.out.println(seconds + "秒");
		
//	請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		int radius = 5;
		System.out.printf("4. 圓面積 = %.3f", (Math.pow(radius, 2)*PI));
		System.out.printf(" 圓周長 = %.3f%n", (radius*2*PI));
		
//	某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,
//	本金加利息共有多少錢 (用複利計算,公式請自行google)
		int pv = 1500000;
		double interest = 1+0.02;
		double fv = pv*(Math.pow(interest, 10));
		System.out.println("5. 本金加利息 = " + fv);
		
//	請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//	5 + 5
//	5 + ‘5’
//	5 + “5”並請用註解各別說明答案的產生原因
		int num1 = 5;
		char num2 = '5';
		String num3 = "5";
		System.out.println("6. 5+5 = " +(num1+num1));
//		單純數字相加所得到的和
		System.out.println("6. 5+\'5\' = " +(num1+num2));
//		char'5'為 unicode中0035，35為16進制，JAVA轉換10進制為53
		System.out.println("6. 5+\"5\" = " +(num1+num3));
//		"5"為字串，因此數字會串連並不會加總
		
		
	}	

}
