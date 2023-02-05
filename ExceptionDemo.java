package simpleProg;

class Exception1{
	
}
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10, b = 5;
			int c = 10/5;
			System.out.println("Value of c: "+c);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Blocked");
		}

	}

}
