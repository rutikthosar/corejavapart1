package simpleProg;
 class Plane{
	 int speed = 1500;
	 void run() {
		 System.out.println("Running");
	 }
 }
 class Vistara extends Plane{
	 
	 void run() {
		 System.out.println("Running safely with"+speed);
	 }
 }
public class Flight {
	public static void main(String aegs[]) {
		Vistara vist = new Vistara();
		vist.run();
		Plane p = new Plane();
		p.speed = 200;
		vist.run();
	}

}
