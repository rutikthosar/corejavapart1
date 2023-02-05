package simpleProg;
class SynchronizedEx{
	synchronized void show(String p) {
		try {
			System.out.println("*****");
			System.out.println(p);
			Thread.sleep(1000);
			System.out.println("#####");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class MyThread implements Runnable{
	Thread c;
	String m;
	SynchronizedEx r;
	MyThread(SynchronizedEx w, String k){
		r=w; m=k;
		c=new Thread(this);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		r.show(m);
	}
}
public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SynchronizedEx d = new SynchronizedEx();
		MyThread t1 = new MyThread(d,"Hello");
		MyThread t2 = new MyThread(d, "JAVA");
		t1.c.start();
		t2.c.start();
		t1.c.join();
		t2.c.join();
	}

}
