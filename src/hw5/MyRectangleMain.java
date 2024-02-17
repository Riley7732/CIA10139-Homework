package hw5;

public class MyRectangleMain {

	public static void main(String[] args) {

		MyRectangle area1 = new MyRectangle();
		area1.setWidth(10);
		area1.setDepth(20);
		area1.getArea();

		MyRectangle area2 = new MyRectangle(10, 20);
		area2.getArea();

	}

}
