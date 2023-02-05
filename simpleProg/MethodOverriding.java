package simpleProg;

class Emp{
	String ename = "Rutik";
	int eno;
	Emp(int eno){
		this.eno=eno;
		
	}
	void disp() {
		System.out.println("Employee class : " +eno);
	}
}
class Dept extends Emp{
	Dept() {
		super(19);
		// TODO Auto-generated constructor stub
	}

	void disp() {
		super.disp();
		System.out.println("Department class : " +super.ename);
	}
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dept d = new Dept();
		d.disp();
//		Emp e = new Emp();
//		e.disp();

	}

}
