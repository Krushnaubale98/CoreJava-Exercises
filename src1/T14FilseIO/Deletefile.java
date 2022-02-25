package T14FilseIO;

import java.io.File;

public class Deletefile {

	public static void main(String[] args) {
		File myfile = new File("file2.txt");
		if(myfile.delete()) {
			System.out.println("File  "+ myfile.getName()+ "is deleted successfully");
		}else {
			System.out.println("File is  not deleted");
		}
	}

}
