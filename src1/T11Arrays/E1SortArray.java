package T11Arrays;

import java.util.Arrays;

public class E1SortArray {

	public static void main(String[] args) {

		String[] a = { "raju", "ram", "radha", "sham" };
		int[] b = { 3, 45, 6, 7, 87, 8, 5 };
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println("Array int []a:" + Arrays.toString(a));
		System.out.println("Array string [] b:"+Arrays.toString(b));
	}

}
