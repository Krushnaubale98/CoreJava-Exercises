package T14FilseIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//WAP find the longest word in a text file

public class Exercise6 {

	public static void main(String[] args) throws FileNotFoundException{
		new Exercise6().findLongestWord();

	}

	public String findLongestWord() throws FileNotFoundException {
		String longestWord = "";
		String current;
		Scanner sc = new Scanner(new File("file1.txt"));

		while (sc.hasNext()) {
			current = sc.next();
			if (current.length() > longestWord.length()) {
				longestWord = current;

			}

		}
		System.out.println("\n" + longestWord + "\n");
		return longestWord;
	}

}
