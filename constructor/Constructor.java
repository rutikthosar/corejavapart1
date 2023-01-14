package constructor;

public class Constructor {
	String name;
	String city;
	String course;
	int rollno;
	public Constructor() {
	
		System.out.println("Default constructor :");
		name = "Rutik";
	}
	Constructor(String c){
		city  = c;
		System.out.println("I stay at : " + city);
	}
	Constructor(int r, String crs){
		rollno = r;
		course = crs;
		System.out.println("My Roll No and Course : "+rollno +" "+course);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c = new Constructor();
		System.out.println("My name is " + c.name);
		Constructor c1 = new Constructor("Karjat");
		Constructor c2 = new Constructor(69, "Java Full Stack");
	}

}
