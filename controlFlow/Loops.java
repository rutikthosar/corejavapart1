package controlFlow;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// While loop
		
		int x = 1;
		while(x<=6) {
			System.out.println("Value of x is :" +x);
			x++;
		}
		
		// do while loop
		
		int y = 1;
		do{
			System.out.println("Current executing index :" +y);
			y++;
		}while(y<=1);
		
		// for loop
		
		for(int z = 1; z<=6; z++) {
			System.out.println("Value of z :" +z);
		}
			

	}

}
