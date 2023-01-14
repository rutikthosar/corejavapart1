package simpleProg;

abstract class Bike{
	abstract void speed();
	void display() {
		System.out.println("Bike class");
	}
}

abstract class Motorbike extends Bike{

	 @Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Motor Bike");
	}
	
}
public class AbstractEx extends Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike a = new AbstractEx();   //AbstractEX is replaced with Bike
		a.display();
		a.speed();
		Motorbike m = new Motorbike() {
		};;
		m.speed();
	}

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Nice Bike");
		
	}

}
