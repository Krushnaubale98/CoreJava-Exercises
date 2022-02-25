package T11Arrays;

import java.util.Arrays;

public class EvenOddNumInArray {

	public static void main(String[] args) {

		int arr[] = { 5, 6, 3, 7, 8, 8,  3, 249, 45 };
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {

			if(arr[i]%2==0) {
				System.out.println("even no is:"+arr[i]);
			}else {
				System.out.println("Odd numbers:"+arr[i]);
			}
		}
	}

}
