package T11Arrays;

import java.util.Arrays;

public class reverseArray {
	public static void reverse(int a[], int n) {
		int[] b = new int[n];
		int j = n;
		for (int i = 0; i < n; i++) {
			b[j - 1] = a[i];
			j = j - 1;
		}
		// printing the reversed array
		System.out.print("Revesed array is:");
		for (int k = 0; k < n; k++) {
			System.out.print(b[k]+" ");
		}

		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		reverse(arr, arr.length);

		// this is other aarray example
		int[] array = { 1, 2, 3, 4,25,10, 5, 6 };
		reverse(array, array.length);

		// sort the array

		//int[] arry = { 2, 3, 4, 5, 6, 7, 7, 78, 8, };
		Arrays.sort(array);
		System.out.println("Array arry[]:" + Arrays.toString(array));

	}

}
