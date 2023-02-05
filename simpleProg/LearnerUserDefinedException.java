package simpleProg;

class Learner{
	String fname,lname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
}
class LearnerNameException extends Exception{
	public LearnerNameException(String s) {
		super(s);
	}
}

public class LearnerUserDefinedException {
	
	void checkName(String fname,String lname) throws LearnerNameException{
		if(fname.isBlank() && lname.isBlank()) {
			throw new LearnerNameException("fname and lname is enpty");
			
		}
		else if(fname.isBlank()) {
			throw new LearnerNameException("fname is empty");
		}
		else if(lname.isBlank()) {
			throw new LearnerNameException("lname is empty");
		}
	}

	public static void main(String[] args) throws LearnerNameException {
		// TODO Auto-generated method stub
		Learner l = new Learner();
		l.setFname("a");
		l.setLname("");
		LearnerUserDefinedException lu = new LearnerUserDefinedException();
		lu.checkName(l.getFname(), l.getLname());
		

	}

}
