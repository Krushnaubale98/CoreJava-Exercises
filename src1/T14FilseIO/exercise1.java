package T14FilseIO;

import java.io.File;

//WAp to check if a file or directory by pathname exists or not

public class exercise1 {

	public static void main(String[] args) {
		// creat a file

		File Myfile = new File("file2.txt");

		if (Myfile.exists()) {
			System.out.println("The directory or file exists");
		} else {
			System.out.println("The directory or  file does not exists");
		}

	}

}
