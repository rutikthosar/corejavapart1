package simpleProg;

import java.util.Scanner;

public class SumOfRemainders {
	
	int findSumOfRemainder(int n, int div) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum = sum+(i%div);
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n,div;
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		System.out.println("Enter Divisor: ");
		div = sc.nextInt();
		SumOfRemainders r = new SumOfRemainders();
		int ans = r.findSumOfRemainder(n, div);
		System.out.println("Sum of remainder is: "+ans);
	}

}
