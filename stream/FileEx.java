package stream;
import java.io.File;
import java.io.IOException;
public class FileEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File newFile = new File("List of Courses.txt");
		if(newFile.createNewFile()) {
			System.out.println("File created");
		}
		else {
			System.out.println("File exists");
		}
	}
}
