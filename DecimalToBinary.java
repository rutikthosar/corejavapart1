package simpleProg;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Decimal No: ");
		a = s.nextInt();
		System.out.println("Binary no: ");
		String b = Integer.toBinaryString(a);
		System.out.println(b);
	}

}
