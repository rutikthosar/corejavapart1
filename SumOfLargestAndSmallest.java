package simpleProg;

import java.util.Scanner;

public class SumOfLargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
		
		int[] arr = {12,1234,45,67,1};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int a:arr) {
			if(a>max) {
				max=a;
			}
			if(a<min) {
				min=a;
			}
		}
		System.out.println("Largest no:"+max);
		System.out.println("Smallest no:"+min);
		System.out.println("Sum:"+(max+min));

	}

}
