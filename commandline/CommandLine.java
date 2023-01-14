package commandline;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO JAVA");
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int sum = x + y;
		System.out.println("The sum of x and y is:" +sum);
		String s = args[2];
		System.out.println("My name is:" +s);
		float percentage = Float.parseFloat(args[3]);
		System.out.println("My percentage is:" +percentage);
		
	}

}
