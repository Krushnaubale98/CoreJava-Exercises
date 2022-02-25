package T8NumberClassExcercises;

import java.util.Scanner;
//import java.util.*;

public class HappyNumbers {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number");
			int num = sc.nextInt();
			int sum = 0;
			int happy = num;
			while (happy > 1) {
				while (happy > 0) {
					int mod = happy % 10;
					sum = sum + (int) Math.pow(mod, 2);
					happy = happy / 10;
				}
				happy = sum;
				sum = 0;

			}
			if (happy == 1) {
				System.out.println(num + " is happy number");

			} else {
				System.out.println(num + " is not a happy number");
			}
		}
	}
}