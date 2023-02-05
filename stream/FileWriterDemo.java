package stream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*FileWriter fw = new FileWriter("Test.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("String is a class.");
		bw.write("File write demo.");
		bw.close();
		System.out.println("File created and edited successfully");
		*/
		try {
			FileWriter fw = new FileWriter("Text.txt");
			fw.write("Welcome");
			fw.close();
		}catch(Exception e) {System.out.println(e);}
		System.out.println("Success");
	}

}
