package T14FilseIO;

import java.io.File;
import java.util.Date;

//wap to get a last modified time of a file
public class Exercise3 {

	public static void main(String[] args) {
		File file = new File("file1.txt");

		Date date = new Date(file.lastModified());
		System.out.println("\n The file was last modified on " + date + "\n");

	}

}
