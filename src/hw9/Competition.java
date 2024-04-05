package hw9;

public class Competition implements Runnable {

	int rice = 0;
	String name;

	public Competition() {
	}

	public Competition(String name) {
		this.name = name;
	}

	public void run() {
		while (rice < 10) {
			try {
				rice += 1;
				Thread.sleep((int) (Math.random() * 2526) + 500);
				System.out.println(name + "吃了" + rice + "碗");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + "吃完了");
	}

	public static void main(String[] args) {
		System.out.println("-----比賽開始！-----");
		Competition c1 = new Competition("饅頭人");
		Thread t1 = new Thread(c1);
		Competition c2 = new Competition("詹姆士");
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
			System.out.println("-----比賽結束！-----");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
