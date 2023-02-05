package simpleProg;

import java.util.stream.IntStream;

public class StringSeparateChar {
	
	public void getStream(String s) {
		s.chars()
		.forEach(i -> System.out.print((char) i + " "));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Rutik";
		new StringSeparateChar().getStream(s);
		
		//2nd way to add space
		IntStream stream = " Thosar".chars();
		stream.mapToObj(i -> (char) i + " ").forEach(System.out::print);
	}

}
