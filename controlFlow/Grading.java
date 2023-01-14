package controlFlow;

import java.util.Scanner;

public class Grading {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		int a;
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		
		System.out.println("Enter Percentage");
		double gd = 1/10;
		
		if(gd>=9 && gd<=10) {
			System.out.println("Distinction");
				
		}
		else if(gd>=8 && gd<=9) {
			System.out.println("A grade");
		}
		else if(gd>=7 && gd<=8) {
			System.out.println("A grade");
		}
		else if(gd>=6 && gd<=7) {
			System.out.println("A grade");
		}
		else if(gd>=5 && gd<=6) {
			System.out.println("A grade");
		}
		else if(gd<=5 && gd<=0) {
			System.out.println("A grade");
		}
		else {
			System.out.println("Invalid");
		}		
	}
}
