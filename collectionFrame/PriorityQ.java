package collectionFrame;

import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Scanner;

class Student {
	public String  name;
	public int grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

}
class GradeComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		if(s1.grade<s2.grade)
			return 1;
		else if (s1.grade>s2.grade)
			return -1;
		else 
			return 0;
	}
}


public class PriorityQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		PriorityQueue<Student> pq = new PriorityQueue<Student>(5,new GradeComparator());
		Student s1 = new Student("abc",7);
		pq.add(s1);
		Student s2 = new Student("mno",9);
		pq.add(s2);
		Student s3 = new Student("xyz",8);
		pq.add(s3);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll().getName());
		}
	}

}
