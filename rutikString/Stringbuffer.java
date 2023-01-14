package rutikString;

public class Stringbuffer {

	public Stringbuffer(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		StringBuffer s5 = new StringBuffer("Rutik");
		s5.append("Thosar");
		System.out.println(s5);
		
		s5.insert(1, "Abc");
		System.out.println("insert" +s5);
		
		s5.replace(2, 3, "xyz");
		System.out.println("replace" +s5);
		
		s5.reverse();
		System.out.println(s5);
		
		System.out.println(s5.capacity());
		
		
		StringBuffer sb1 = new StringBuffer();
        //printing default capacity of string buffer  
        System.out.println("sb1: default capacity: " + sb1.capacity()); 
        // current size 16+10 = 26
        StringBuffer sb2 = new StringBuffer("Welcome to");
        System.out.println("sb2: After declaration capacity: " + sb2.capacity());
	}
}
