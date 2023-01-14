package pack1;
class DefaultClass{       //parent class
	int a = 12;
	
	void display() {
		System.out.println("Default class variable : "+a);
	}
}
class DefaultSub extends DefaultClass{   //sub class
	void displaySub() {
		System.out.println("Default Sub class variable");
	}
}
public class DefaultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultSub d = new DefaultSub();  //we access the property of parent class
		d.display();
		d.displaySub();
	}

}
