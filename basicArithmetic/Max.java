package basicArithmetic;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 15;
		int b = 9;
		int c = 7;
		System.out.println(a>=b && a>=c ? "a is greater than b & c":b>=a && b>=c ?"b is greater than a &c":"c is greater");
		
		int re = a>b ? a:b;
		System.out.println("max" +re);
		
		int age = 21;
		String vote = age>18 ? "vote":"not";
		System.out.println(vote);
			

	}

}
