package hw9;

class Bank {
	private int accumulation = 0;

	synchronized public void depositMoney(int money) {
		while (accumulation > 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			System.out.println("熊大被媽媽告知帳戶已經有錢了！");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		accumulation += money;
		System.out.println("媽媽存了" + money + "，帳戶共有：" + accumulation);
		notify();
	}

	synchronized public void withdrawMoney(int money) {
		while (accumulation < money) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			System.out.println("媽媽被熊大要求匯款！");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		accumulation -= money;
		System.out.println("熊大領了" + money + "，帳戶共有：" + accumulation);
		if (accumulation <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify();
		}
	}
}

class Depositing extends Thread {
	Bank money;

	public Depositing() {
	}

	public Depositing(Bank money) {
		this.money = money;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			money.depositMoney(2000);
	}
}

class Withdrawing extends Thread {
	Bank money;

	public Withdrawing() {
	}

	public Withdrawing(Bank money) {
		this.money = money;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			money.withdrawMoney(1000);
	}
}

public class PocketMoney {

	public static void main(String[] args) {
		Bank money = new Bank();
		Withdrawing withdraw = new Withdrawing(money);
		Depositing deposit = new Depositing(money);
		withdraw.start();
		deposit.start();
	}
}
