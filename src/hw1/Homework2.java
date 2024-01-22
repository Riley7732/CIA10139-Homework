package hw1;

public class Homework2 {
	
	public static void main(String[] args) {
		
//		1. 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum = 0;
		for (int s=1; s<=1000; s++) {
			if (s%2 == 1) {
				continue;
			}
			sum += s;
		}
		System.out.println(sum);
		
//		2. 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int a = 1;
		for (int b=1; b<=10; b++) {
			a *= b;
		}
		System.out.println(a);
		
//		3. 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int i = 1, j = 1;
		while (j <= 10) {
			i *= j;
			j++;
		}
		System.out.println(i);
		
//		4. 請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100
		int x = 1, y = 1;
		for (; x<=10; x++) {
			for(;y == x; y++) {
				System.out.print(x + "*" + y + "=" + x * y + "\t" );
			}
		}
		System.out.println();
		
//		5. 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//		輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int luck1, luck2, count=0;
		for (luck1 =0; luck1 <=4; luck1++) {
			for (luck2 =0; luck2 <=9; luck2++) {
				if(luck1==4 || luck2==4 || (luck1==0 && luck2==0)) {
					continue;
				}
				count +=1;
				System.out.print(luck1 + "" + luck2 + " ");
			}
		}
		System.out.println("total= " +count);

//		6.
		int e = 10;
		for (; e>0; e--) {
			for(int d=1; d <= e; d++) {
				System.out.print(d);
			}
			System.out.println();
		}
		
//		7.
		for(int eng1 = 65; eng1 <= 70; eng1++) {
			for(int eng2 = 65; eng2 <= eng1; eng2++) {
				System.out.print((char)eng1);
			}
			System.out.println();
		}
		
	}

}
