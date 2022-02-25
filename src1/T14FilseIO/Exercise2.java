package T14FilseIO;

import java.io.File;

//wap to check if given pathname is a directory or a file

public class Exercise2 {

	public static void main(String[] args) {
		// create a file object
		
		File Myfile=new File("C:\\Users\\Krishna\\eclipse-workspace\\CoreJava practice\\abc.txt");
		if(Myfile.isDirectory()) {
			System.out.println( Myfile.getAbsolutePath()+ " is a directory.\n");
			
		}else {
			System.out.println(Myfile.getAbsolutePath()+" is not a directory.\n");
		}
		if(Myfile.isFile()) {
			System.out.println(Myfile.getAbsolutePath()+" is a file.\n");
		}else {
			System.out.println(Myfile.getAbsolutePath()+" is not a file");
		}
	}

}
