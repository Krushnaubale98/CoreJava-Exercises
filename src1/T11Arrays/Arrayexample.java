package T11Arrays;

public class Arrayexample {

	public static void main(String[] args) {
		double[] mylist = { 1.9, 2.4, 3.4, 4.8, 5.1 };

		// print all the array elements

		for (int i = 0; i < mylist.length; i++) {
			System.out.println(mylist[i] + " ");
		}
		// summing all elements

		double total = 0;
		for (int i = 0; i < mylist.length; i++) {
			total += mylist[i];
		}
		System.out.println("Total is " + total);

		// finding the largest elements
		double max = mylist[0];
		for (int i = 1; i < mylist.length; i++) {
			if (mylist[i] > max)
				max = mylist[i];
		}
		System.out.println("Max  is " + max);
	}
}
