package simpleProg;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			int[] number = {1,2,3};
//			System.out.println(number[12]);
			
//			int a = Integer.parseInt(null);
//			System.out.println("a = "+a);
			
//			int b = Integer.parseInt("Hi");
//			System.out.println("b = "+b);
			
			int c = Integer.parseInt("90");
			System.out.println("c = "+c);
		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Code");
		}


	}

}
