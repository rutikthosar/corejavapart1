package simpleProg;

class Student {
	int studentID = 10;
	void display() {
		System.out.println("Roll No : " + studentID);
	}

}

class EnggStud extends Student{
	String dept = "IT Engg";
	void displaydept() {
		
	}
}

class EnggGrade extends EnggStud{
	int grade = 9;
	void displaygrade() {
		System.out.println("Grade : " +grade);
	}
}

class EnggClg extends Student{
	String clg = "KGCE";
	void displayClg() {
		System.out.println("College : " + clg);
	}
}

public class InheritanceP{
	public static void main(String args[]) {
		EnggStud e = new EnggStud();
		e.display();
		e.displaydept();
		
		EnggClg e1 = new EnggClg();
		e1.display();
		e1.displayClg();
		
		EnggGrade e2 = new EnggGrade();
		e2.displaygrade();
	}
}
