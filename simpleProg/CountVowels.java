package simpleProg;

import java.util.HashSet;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to Hotel";
		int a = uniqueVowel(s);
		System.out.println("No. of Vowels: " + a);

	}

	private static int uniqueVowel(String s) {
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				count++;
			}
		}
		return 0;
	}
	static String uniqueCharacter(String r) {
		String s = null;
		for(int i=0; i<s.length(); i++) {
			HashSet<CharacterSet>
		}
		return r;
		
	}

}
