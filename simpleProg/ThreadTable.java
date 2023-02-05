package simpleProg;

class Threads implements Runnable {
	int a;

	public Threads(int a) {
		super();
		this.a = a;
	}

	public void run() {
		try {
			ThreadTable.mul(a);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class Threads1 implements Runnable {
	int b;

	public Threads1(int b) {
		super();
		this.b = b;
	}

	@Override
	public void run() {

		try {
			ThreadTable.mul(b);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


public class ThreadTable {
	static synchronized void mul(int t) throws InterruptedException {
		int a = t;
		System.out.println("Table of" + t + ":");
		for (int i = 1; i <= 10; i++) {

			System.out.println(a + "*" + i + "= " + (a * i));
			Thread.sleep(1000);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threads tt = new Threads(19);
		Thread tt1 = new Thread(tt);
		tt1.start();

		Threads1 tt2 = new Threads1(15);
		Thread tt3 = new Thread(tt2);
		tt3.start();

	}

}
