package simpleProg;

public class StudentEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Using getter setter method
		/*Encapsulation e = new Encapsulation();
		e.setRno(12);
		e.setName("Rutik");
		e.setCity("Karjat"); 
		System.out.println("Student roll no: " +e.getRno());
		System.out.println("Student name : " +e.getName());
		System.out.println("City : " +e.getCity()); */
		
		
		// Using parameterized constructor
		Encapsulation e = new Encapsulation(34, "Rutik", "Karjat");
		System.out.println("Student roll no: " +e.getRno());
		System.out.println("Student name : " +e.getName());
		System.out.println("City : " +e.getCity());
		
		e.setRno(69);
		System.out.println("Student roll no: " +e.getRno());
	}

}
