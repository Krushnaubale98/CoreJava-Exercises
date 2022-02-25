package T11Arrays;

import java.util.Arrays;

public class ReturnDoubleLengh {

	public static void main(String[] args) {
		//int arr[]= {9,8};
		int arr[] = { 3, 4, 6, 78, 6, 7, 89, 6, 8 };
		System.out.println( "before the swapping array"+Arrays.toString(arr));
		int first = arr[0];
		int last = arr[arr.length - 1];
		arr[0]=last;
		arr[arr.length-1]=first;
		System.out.println("after swapping the last element"+Arrays.toString(arr));
	}
}
