package T14FilseIO;

import java.io.File;
import java.io.IOException;

public class IOMiniproject {

	public static void main(String[] args) {
		
		File qty = new File("Ouestions.txt");
		File ans = new File("Answers.txt");
		
		try {
			qty.createNewFile();
			ans.createNewFile();
			System.out.println("file create successfully");
		} catch (IOException e) {
			System.out.println("Unable to create the file");
			e.printStackTrace();
		}

	}

}
