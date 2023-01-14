package pack1;
class PrivateClass{
	private int a = 12;
	
	private void display() {
		System.out.println("Private method :"  +a);
	}
}
public class PrivateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateClass p = new PrivateClass();
		System.out.println(p.a);
		p.display();      // scope of private method and variable is within class

	}

}
