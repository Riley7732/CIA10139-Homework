package hw6;

import java.util.Scanner;

public class CalTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("輸入x的值");
			int x = sc.nextInt();
			System.out.println("輸入y的值");
			int y = sc.nextInt();
			Calculator p = new Calculator(x, y);
			System.out.println(x+"的"+y+"次方等於 "+ p.powerXY());
		}catch(CalException e){
			e.printStackTrace();
		}
		
	}

}
