package stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("Test.txt"));
		System.out.println("No of characters");
		while(br.ready()) {
			System.out.println((char)br.read());
			
		}
		
	}

}
