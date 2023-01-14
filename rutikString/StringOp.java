package rutikString;

import java.util.Arrays;

public class StringOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "   Rutik   ";
		String s2 = "Thosar";
		String s3 = "Karjat";
		System.out.println(s1.concat(s2));
		System.out.println("Rutik" + "Thosar");
		System.out.println(s1+ " " +s2);
		System.out.println("Length :" +s3.length());
		System.out.println("Substring :" +s3.substring(1, 3));
		System.out.println("Upper case :" +s1.toUpperCase());
		String s4 = "";
		System.out.println("To check a null :" +s3.isBlank());
		char[] arr = new char[10];
		s1.getChars(0, 3, arr, 0);
		System.out.println("Getchars :" +Arrays.toString(arr));
		System.out.println("Comparison :" +s1.compareTo(s2));
		System.out.println("Equals :" +s1.equalsIgnoreCase(s3));
		System.out.println("StartWith :" +s1.startsWith("Ru"));
		System.out.println("EndsWith :" +s1.endsWith("p"));
		System.out.println("Replace :" +s3.replace("Karjat", "Raigad"));
		System.out.println("Repeat :" +s1.repeat(5));
		System.out.println("CharAt :" +s1.charAt(3));
		System.out.println("Trim Lead :" +s1.stripLeading());
		System.out.println("Trim Trail :" +s1.stripTrailing());
		
		
		
		

	}

}
