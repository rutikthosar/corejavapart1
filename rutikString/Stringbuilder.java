package rutikString;

public class Stringbuilder {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		StringBuilder s5 = new StringBuilder("Rutik");
		s5.append("Thosar");
		System.out.println(s5);
		
		s5.insert(1, "Abc");
		System.out.println("insert" +s5);
		
		s5.replace(2, 3, "xyz");
		System.out.println("replace" +s5);
		
		s5.reverse();
		System.out.println(s5);
		
		System.out.println(s5.capacity());

	}

}
