package T14FilseIO;

import java.io.FileWriter;
import java.io.IOException;

public class AppendDataFile {
	public static void main(String[] args) {
		
		//String data="";
		try {
			FileWriter output=new FileWriter("file2.txt",true);
			output.write("\\n Mumbai appended...");
			System.out.println("Data successfully appended");
			output.close();
		} catch (IOException e) {
		System.out.println("Data not appended.,..");
			
		}
	}

}
