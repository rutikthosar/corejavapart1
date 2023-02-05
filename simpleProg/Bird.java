package simpleProg;

abstract class Birdss{
	abstract void makeSound();	
}
class Duck extends Birdss{

	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Sound of Duck: Quack Quack");
	}	
}
class Owl extends Birdss{

	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Sound of Owl: Hoot Hoot");
	}
}
public class Bird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck d = new Duck();
		d.makeSound();
		
		Owl c = new Owl();
		c.makeSound();
	}
}
