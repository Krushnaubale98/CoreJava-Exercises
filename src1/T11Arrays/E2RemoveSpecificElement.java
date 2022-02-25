package T11Arrays;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
//import java.util.stream.IntStream;

public class E2RemoveSpecificElement {

	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			String[] a = { "raju", "kaju", "baju", "sadhu" };
			String[] anew = new String[a.length - 1];
			System.out.println("Enter the index number for delete");
			int j = sc.nextInt();

			if (j >= a.length) {
				System.out.println("Invalid input");
			}

			for (int i = 0, k = 0; i < a.length; i++) {
				if (i != j) {
					anew[k] = a[i];
					k++;

				}
			}

			System.out.println("Before deletion :" + Arrays.toString(a));
			System.out.println("After deletion:" + Arrays.toString(anew));
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(e);
		}

	}

}
