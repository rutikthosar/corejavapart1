package simpleProg;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] numbers = {1,2,3};
			System.out.println(numbers[50]);
		}
		catch(Exception e) {
			System.out.println("Some Error in code");
		}

	}

}
