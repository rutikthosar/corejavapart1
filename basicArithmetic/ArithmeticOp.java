package basicArithmetic;

import java.util.Scanner;

public class ArithmeticOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of a and b");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("Enter your percentage :");
		float per = s.nextFloat();
		System.out.println("Enter your Name :");
		String name = s.next();
		System.out.println("Sum :" + (a+b));
		System.out.println("Percentage :" + per);
		System.out.println("Name :" + name);
	}

}
