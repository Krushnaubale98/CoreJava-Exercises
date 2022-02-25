package T14FilseIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// wap to append text to an existing file
public class Exercise5 {

	public static void main(String[] args) {

		
		StringBuilder sb=new StringBuilder();
		String strline="";
		try {
			
			String filename="file1.txt";
			FileWriter fw=new FileWriter(filename,true);
			//appends the string to the file
			fw.write(" java Exercises\n");
			fw.close();
			
			BufferedReader br=new BufferedReader( new FileReader("file1.txt"));
			
			// read the file
			while(strline != null) {
				sb.append(System.lineSeparator());
				strline=br.readLine();
				System.out.println(strline);
			}
			br.close();
		}catch(IOException ioe) {
			System.out.println("IOException" +ioe.getMessage());
		}
	}

}
