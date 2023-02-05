package stream;

import java.util.ArrayList;

public class StreamAPIEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("Rutik");
		al.add("Pallavi");
		al.add("kiran");
		al.add("Lot");
		al.add("Hrushi");
		long count = al.stream().filter(a->a.length()<6).count();
		System.out.println("Elements length less than 6"+count);
		
	}

}
