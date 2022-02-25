package T14FilseIO;


import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		char[] data = new char[100];

		try {
			FileReader input = new FileReader("file1.txt");
			input.read(data);
			System.out.println("Data recived from file1.");
			System.out.println(data);
			input.close();
		} catch (IOException e) {
			System.out.println("File read error..");
			e.printStackTrace();
			
		}
	}

}
