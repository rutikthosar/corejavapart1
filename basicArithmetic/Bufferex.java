package basicArithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("My name is");
		String name = br.readLine();
		int a = Integer.parseInt(br.readLine());
		System.out.println("My Percentage :"+a);
	}

}
