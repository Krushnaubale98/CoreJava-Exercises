package T14FilseIO;

import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {

	public static void main(String[] args) {
		String data = "101,krushna ubale,aurangabad ,India.";

		try {
			FileWriter output = new FileWriter("file1.txt");
			output.write(data);
			System.out.println("Data is written sucessfully");
			output.close();

		} catch (IOException e) {
			System.out.println("File write error...");
			e.printStackTrace();
		}

	}
}