package T8NumberClassExcercises;

import java.util.Scanner;

public class NumberIsCube {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a integer number");
			int num = sc.nextInt();
//		int n = (int) Math.round(Math.pow(num, 1.0 / 3.0));
			int n = 3/num;
			if (num == n * n * n) {
				System.out.println(num + " Number is cube");

			} else {
				System.out.println(num + " number is not a cube");

			}
		}
		System.out.println("\n");
	}

}
