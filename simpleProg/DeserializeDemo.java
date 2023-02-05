package simpleProg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Employees e = null;
		FileInputStream fis = new FileInputStream("employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		e = (Employees) ois.readObject();
		ois.close();
		fis.close();
		System.out.println("Deserialized object");
		System.out.println("Name: "+e.name);
		System.out.println("Address: "+e.address);

	}

}
