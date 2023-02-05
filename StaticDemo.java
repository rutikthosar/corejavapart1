package simpleProg;

class StaticDemo1 {
	
	static int a,b;
	static String n;
	static void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(n);
}
}
public class StaticDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo1.a = 10;
		StaticDemo1.b = 20;
		StaticDemo1.n = "abc";
		StaticDemo1.display();
	}

}
