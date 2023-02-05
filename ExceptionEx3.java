package simpleProg;

public class ExceptionEx3 {
	
	static void Age(int Age) {
		if(Age<18) {
			throw new ArithmeticException("Access denied must be at least 18 years old to watch movie");
		}
		else {
			System.out.println("Access granted to watch movie");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age(21);

	}

}
