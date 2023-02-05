package simpleProg;

import java.util.Scanner;

class Addition{
	int a, b;
	Scanner s = new Scanner(System.in);
	void add() {
		System.out.println("Enter the numbers: ");
		a = s.nextInt();
		b = s.nextInt();
		int sum = a+b;
		System.out.println("Sum is "+sum);
	}
}
class Subtract extends Addition{
	int a, b;
	Scanner s = new Scanner(System.in);
	void sub() {
		System.out.println("Enter the numbers: ");
		a = s.nextInt();
		b = s.nextInt();
		int sub = a-b;
		System.out.println("Sub is "+sub);
	}
	
}
class Mult extends Subtract{
	int a, b;
	Scanner s = new Scanner(System.in);
	void mul() {
		System.out.println("Enter the numbers : ");
		a = s.nextInt();
		b = s.nextInt();
		int mult = a*b;
		System.out.println("Multiplication is " +mult);
	}
}
class Division extends Mult{
	int a, b;
	Scanner s = new Scanner(System.in);
	void div() {
		System.out.println("Enter the numbers : ");
		a = s.nextInt();
		b = s.nextInt();
		int divn = a/b;
		System.out.println("Division is " +divn);
		
	}
}
public class UserDInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Division s = new Division();
		s.add();
		s.sub();
		s.mul();
		s.div();
	}

}

