package T11Arrays;

import java.util.Arrays;

public class largestElement {

	public static void main(String[] args) {
		int arr[] = { 400, 6, 167, 7, 3, 85, 9 };
		String a[] = {"af","arurangabad", "pune", "mumbai" };
		Arrays.sort(arr);
		Arrays.sort(a);
		System.out.println("Largest element of array is:" + arr[arr.length - 1]);
	}

}
