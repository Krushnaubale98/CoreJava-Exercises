package T22CoreJavaPracticeExample;

import java.util.Scanner;

//Wap count all vowels in a string

public class E6StringVowels {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the String =>");
			String str = sc.nextLine();
			System.out.println("Number of vowels in the string=>" + countVowels(str) + "\n");
		}
	}

	public static int countVowels(String str) {
		int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
						|| str.charAt(i) == 'u') {
					
				
					count++;
				}
				
			}
			return count;
		}
	}


