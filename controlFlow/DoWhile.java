package controlFlow;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a, b, c;
		char op;
		Scanner s = new Scanner(System.in);
	
		do {	
			System.out.println("enter an Operator :-");
			op = s.next().charAt(0);
			switch (op) {
			case '+': {
				System.out.println("enter two numbers");
				a = s.nextFloat();
				b = s.nextFloat();
				c = a + b;
				System.out.println(c);
				break;
				
			}
			case '-': {
				System.out.println("enter two numbers");
				a = s.nextFloat();
				b = s.nextFloat();
				c = a - b;
				System.out.println(c);
				break;
				
			}
			case '/': {
				System.out.println("enter two numbers");
				a = s.nextFloat();
				b = s.nextFloat();
				c = a / b;
				System.out.println(c);
				break;

			}
			case '*': {
				System.out.println("enter two numbers");
				a = s.nextFloat();
				b = s.nextFloat();
				c = a * b;
				System.out.println(c);
				break;

			}
			case '4':
				System.exit(0);

			default:
				System.out.println("error");
				break;

			}

		} while (op!=4);



	}

}
