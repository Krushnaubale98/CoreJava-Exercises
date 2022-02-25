package T22CoreJavaPracticeExample;

import java.util.Scanner;

//wap to reverse a string using Recursive function
public class E1ReverseString {

	static void reverse(String str) {
		// if the string is null or consists of string character
		// than print the entered string

		if ((str == null) || (str.length() <= 1))
			System.out.println(str);
		else {
			// if string consists of multiple strings

			System.out.print(str.charAt(str.length() - 1));
			// call the function recursively to reverse the string
			reverse(str.substring(0, str.length() - 1));
		}
	}

	public static void main(String[] args) {

		// take a intput from user
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter the String ");
			String str = sc.nextLine();
			// call the recursive function to reverse the string
			System.out.println("The reverse of the entered the string:");
			reverse(str);
		}
	}

}
