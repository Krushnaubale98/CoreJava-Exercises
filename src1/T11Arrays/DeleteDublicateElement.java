package T11Arrays;

import java.util.Arrays;

public class DeleteDublicateElement {

	public static void main(String[] args) {
		int[] arr = { 88,8,4, 56,7, 3,99,88, 7, 37, 7, 9 ,12};
		Arrays.sort(arr);
		int j = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j++;

			}
		}
		arr[j] = arr[arr.length-1 ];
		for (int i = 0; i <j+1; i++) {
			System.out.print(arr [i] + " ");
		}

	}
}
