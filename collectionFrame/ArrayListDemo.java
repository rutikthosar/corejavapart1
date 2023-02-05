package collectionFrame;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> al = new ArrayList <Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		System.out.println(al);
		System.out.println(al.get(3));
		System.out.println(al.remove(1));
		System.out.println(al);
		System.out.println(al.size());
		
		ArrayList<String> student = new ArrayList<String>();
		student.add(0, "Rutik");
		student.add(1, "Shreyas");
		student.add(2, "Anand");
		student.add(3, "Meghraj");
		student.add("Hrushi");
		student.add("Siddhesh");
		System.out.println(student);
		
		ArrayList<String> employee = new ArrayList<>(Arrays.asList("John", "Jane", "Jack", "Jill"));
		System.out.println(employee);
		//mutate 2nd element
		employee.set(2, "Jack Sparrow");
		System.out.println(employee);

	}

}
