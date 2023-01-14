package controlFlow;

import java.util.Scanner;

public class SwitchStmt {

	private static Scanner scanner;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b;
		char op;
		
		System.out.println("Enter two integers: ");
		Scanner Scanner;
		scanner = new Scanner (System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println("Enter an Operator: ");
		op = scanner.next().charAt(0);
		
		switch(op) {
		case '+':
			System.out.format("%d + %d = %d\n", a, b, a + b);
			break;
			
		case '-':
			System.out.format("%d - %d = %d\n", a, b, a - b);
			break;
			
		case '*':
			System.out.format("%d * %d = %d\n", a, b, a * b);
			break;
			
		case '/':
			System.out.format("%d / %d = %d\n", a, b, a / b);
			break;
			
		default:
			System.out.println("Invalid");
		}
		
	}

}
	
