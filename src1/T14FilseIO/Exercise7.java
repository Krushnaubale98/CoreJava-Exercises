package T14FilseIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//WAP to store text file content line by line into an array

public class Exercise7 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		String strline = "";
		List<String> list = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
			while (strline != null) {
				strline = br.readLine();
				sb.append(strline);
				sb.append(System.lineSeparator());
				strline = br.readLine();
				if (strline == null)
					break;
				list.add(strline);

			}
			System.out.println(Arrays.toString(list.toArray()));
			br.close();

		} catch (FileNotFoundException e) {

			System.out.println("File not found");
		}catch(IOException e) {
			System.err.println("Unable to read the file");;
		}
	}
}