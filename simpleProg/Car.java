package simpleProg;
import java.util.Scanner;

class Brand{
	String a = "TATA";
	void displaya() {
		System.out.println("Car Brand is : " + a);
	}
}

class Model extends Brand{
	String b = "Harrier";
	void displayb() {
		System.out.println("Car Model is : " +b);
	}
}
public class Car {
public static void main(String args[]) {
	Model m = new Model();
	m.displaya();
	m.displayb();
}
}
