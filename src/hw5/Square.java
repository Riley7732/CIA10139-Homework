package hw5;

import java.util.Scanner;

public class Square {

	private int width;
	private int height;

	public Square() {

	}

	public Square(int width, int height) {
		setInfo(width, height);
	}

	public int getInfo() {
		return width & height;
	}

	public void setInfo(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void starSquare() {
		for (int i = 1; i <= width; i++) {
			for (int j = 1; j <= height; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

//	請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如圖:

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入長方形的寬與高");
		int width = sc.nextInt();
		int height = sc.nextInt();

		Square square = new Square(width, height);
		square.starSquare();

	}

}
