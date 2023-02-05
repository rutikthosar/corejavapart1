package stream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			OutputStream oStream = new FileOutputStream("Output.txt");
			oStream.write(70);
			oStream.write(65);
			oStream.write(78);
			oStream.close();
			System.out.println("Successfully created and written the file.");
			
		}catch(IOException e) {
			System.out.println("Exception");
		}

	}

}
