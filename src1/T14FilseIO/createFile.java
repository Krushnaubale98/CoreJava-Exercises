package T14FilseIO;
// wap to create a file 

import java.io.File;
import java.io.IOException;

public class createFile {

	public static void main(String[] args) {
		File myfile = new File("file2.txt");
		try {
			myfile.createNewFile();
			System.out.println("file create successfully");
		} catch (IOException e) {
			System.out.println("Unable to create the file");
			e.printStackTrace();
		}

	}
}
