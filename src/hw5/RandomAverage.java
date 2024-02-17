package hw5;

public class RandomAverage {

	public int randAvg() {
		int[] randNum = new int[10];
		int randArray = 0;
		for (int i = 0; i < randNum.length; i++) {
			randNum[i] = (int) (Math.random() * 101);
			System.out.print(randNum[i] + "\t");
			randArray += randNum[i];
		}
		System.out.println();
		int randAvg = randArray / 10;
		return randAvg;
	}

	public static void main(String[] args) {

//	請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值

		RandomAverage random = new RandomAverage();
		System.out.println("亂數的平均為 " + random.randAvg());
	}

}
