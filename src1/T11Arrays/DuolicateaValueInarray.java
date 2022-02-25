package T11Arrays;

import java.util.Arrays;

public class DuolicateaValueInarray {

	public static void main(String[] args) {
		String []arr= {"ram","sham","delhi","mumbai","ram","delhi"};
		//int[] arr = { 3, 5, 6, 4, 6, 45, 56, 67,67,  3, 4, 5, 45 };
		Arrays.sort(arr);
		String  dublicate;

		for (int i = 0; i <= arr.length; i++) {
			try {
				if (arr[i] == arr[i + 1]) {
					dublicate= arr[i];
					System.out.println(dublicate);

				}

			} catch (Exception e) {
				System.out.println("");
			}
		}
	}

}
