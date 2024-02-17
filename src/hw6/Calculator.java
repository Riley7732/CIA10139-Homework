package hw6;

public class Calculator {

	private int x;
	private int y;

	public Calculator() {

	}

	public Calculator(int x, int y) throws CalException {
		setNumber(x, y);
	}

	public int getNumber() {
		return x & y;
	}

	public void setNumber(int x, int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義！");
		} else if (y < 0) {
			throw new CalException("次方為負數，結果回傳不為整數！");
		} else if (x > 0 && y > 0) {
			this.x = x;
			this.y = y;
		}

	}

	public int powerXY() {
		return (int) Math.pow(x, y);
	}
}
