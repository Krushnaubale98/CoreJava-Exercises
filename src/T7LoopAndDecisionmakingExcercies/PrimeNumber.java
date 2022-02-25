package T7LoopAndDecisionmakingExcercies;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number");
			int no = sc.nextInt();
			// int no = 0;
			int temp = 0;
			for (int i = 1; i <= no ; i++) {
				if (no % i == 0) {
					temp = temp + 1;

				}

			}
			if (temp == 2) {
				System.out.println(no + " This is a prime number");
			} else {
				System.out.println(no + " this is not a prime number");
			}
		}

	}
}
