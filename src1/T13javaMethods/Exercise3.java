package T13javaMethods;

//wap to count a string words

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the String ");
			String str = sc.nextLine();
			
			
			System.out.println("Number of the words int the string is:" +count_words(str)+"\n");
		}
	}

	public static int count_words(String str) {
		int count = 0;
		if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))) {

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') {
					count++;
				}
			}
			count = count + 1;

		}
		return count; // retruns 0 if String starts or ends with space" ".

	}
}
