package simpleProg;
class Thread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread1 started running..");
	}
	
}
class Thread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread2 started running..");
	}
	
}
public class ThreadEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread t2 = new Thread(t1);
		t2.start();
		
		Thread2 n1 = new Thread2();
		Thread n2 = new Thread(n1);
		n2.start();
	}

}
