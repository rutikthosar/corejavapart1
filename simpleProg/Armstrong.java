package simpleProg;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, number, remainder, total = 0;
		System.out.println("Enter 3 Digit number :");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		number = num;

        while (number != 0)
        {
        	remainder = number % 10;
            total = total + remainder*remainder*remainder;
            number /= 10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");

	}

}
