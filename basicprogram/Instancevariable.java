package basicprogram;
class Subject{
	int javaMarks;
	int pythonMarks;
	
	void displayMark() {
		System.out.println("java" + javaMarks);
		System.out.println("python" + pythonMarks);
	}
}

public class Instancevariable {
	public void displayAge() {
		int age = 0;
		age += 10;
		System.out.println("Age:" + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instancevariable instancevariable = new Instancevariable();
		instancevariable.displayAge();
		Subject s = new Subject();
		s.javaMarks = 45;
		s.pythonMarks = 44;
		s.displayMark();
	}

}
