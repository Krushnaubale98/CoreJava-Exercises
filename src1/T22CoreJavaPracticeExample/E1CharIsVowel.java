package T22CoreJavaPracticeExample;

import java.util.Scanner;

//WAP entered char is is vowel or not using switch
// The alphabet A,E,I,O,U and same smallcase are known as vowels.
public class E1CharIsVowel {

	public static void main(String[] args) {
		boolean bool = false;
		System.out.print("Enter a character =>");
		try (Scanner sc = new Scanner(System.in)) {
			char ch = sc.next().charAt(0);
			switch (ch) {

			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				bool = true;
			}
		}
		if (bool == true) {
			System.out.println("Given character is an vowel");

		} else {
			System.out.println("GIven character is a constant");
		}

	}

}
