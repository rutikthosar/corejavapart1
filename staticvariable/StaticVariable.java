package staticvariable;

public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
	     s1.showData();
	     Student s2 = new Student();
	     s2.showData();

	}

}
class Student{
	int a; 
	static int b; //initialized to zero only when class is loaded not for each object created.

	  Student(){
	   
	   b++;
	  }

	   public void showData(){
	      System.out.println("Value of a = "+a);
	      System.out.println("Value of b = "+b);
	   }
}
