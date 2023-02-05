package simpleProg;
class Threadd1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Table of 4 :");
		int a = 4;
		for(int i=1; i<=10; i++) {
			System.out.println(a+"*"+i+"="+(a*i));
		}
		
	}
	
}
class Threadd2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Table of 5 :");
		int a = 5;
		for(int i=1; i<=10; i++) {
			System.out.println(a+"*"+i+"="+(a*i));
		}
		
	}
	
}
public class ThreadEx2 {

	public static void main(String[] args) {
		Threadd1 t = new Threadd1();
		Thread t1 = new Thread(t);
		t1.start();
		
		Threadd2 t2 = new Threadd2();
		Thread t3 = new Thread(t2);
		t3.start();

	}

}
