package simpleProg;

public class ImplicitExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Implicit (Widening)
		
		int x = 46;
		long y = x;
		float z = y;
		
		System.out.println("Before conversion, int value : " + x);
		System.out.println("After conversion, long value : " + y);
		System.out.println("After conversion, float value : " + z);
		
		//Explicit (Narrowing)
		
		double d = 46.789;
		long l = (long)d;
		int i = (int)l;
		
		System.out.println("Before conversion : " + d);
		System.out.println("After conversion into long type : " + l);
		System.out.println("After conversion into int type : " + i);

	}

}
