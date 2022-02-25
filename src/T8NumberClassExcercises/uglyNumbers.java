package T8NumberClassExcercises;
import java.util.Scanner;
public class uglyNumbers {
	public static void main(String[] args) {
		try (Scanner as = new Scanner(System.in)) {
			System.out.println("Input an integer number");

			int n = as.nextInt();
			if (n <= 0) {
				System.out.println("input a correct number.");

			}
			int x = 0;
			while (n != 1) {
				if (n % 5 == 0) {
					n /= 5;
				} else if (n % 3 == 0) {
					n /= 3;
				} else if (n % 2 == 0) {
					n /= 2;
				} else {
					System.out.println("Is is not an ugly numbers");
					x = 1;
					break;
				}
			}
			if (x == 0)
				System.out.println("it is an ugly number.");
		}
		System.out.print("\n");

	}

}
