package T14FilseIO;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileNotFoundException;


// wap to read a file content line by line

public class Exercise4 {

	public static void main(String[] args) {
		BufferedReader br = null;
		String strline = "";
		try {
			br = new BufferedReader(new FileReader("file1.txt"));
			while ((strline = br.readLine()) != null) {
				System.out.println(strline);
			}
			br.close();

		} catch (FileNotFoundException e) {

			System.out.println("File is not found");

		} catch (Exception es) {
			System.out.println("Unable to read the file");
		}

	}

}
