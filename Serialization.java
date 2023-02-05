package simpleProg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Link implements Serializable {
	private String commons;
	private int favorites;
		public Link(String commons, int favorites) {
			this.commons = commons;
			this.favorites = favorites;
}
		public void printLink() {
			System.out.println("Link : " + this.commons);
		}
}
public class Serialization {

	public static void serializeLink(Link inputLink, String fileName) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file = new FileOutputStream(fileName);
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(inputLink);
		out.close();
		file.close();
		}
		public static Link deserializeLink(String fileName) throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream(fileName);
		ObjectInputStream on = new ObjectInputStream(file);
		return (Link) on.readObject();
		}
		public static void main(String[] args) throws IOException, ClassNotFoundException {
		Link randomLink = new Link("My first link", 5);
		final String filename = "example.bin";
		System.out.println("Prior to Serialization : ");
		randomLink.printLink();
		serializeLink(randomLink, filename);
		Link linkFromFile = deserializeLink(filename);
		System.out.println("Following Serialization : ");
		linkFromFile.printLink();
	}

}
