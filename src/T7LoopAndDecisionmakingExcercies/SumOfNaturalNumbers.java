package T7LoopAndDecisionmakingExcercies;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {

		int no, sum = 0;
		System.out.println("Enter the natural number-");
		try (Scanner sc = new Scanner(System.in)) {
			no = sc.nextInt();
		}

		for (int i = 0; i <= no; i++) {
			sum = sum + i;

		}
		System.out.println("sum of Natural numbers " + sum);

	}

}
