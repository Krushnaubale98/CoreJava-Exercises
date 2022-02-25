package T8NumberClassExcercises;

import java.util.Random;
//import java.util.Scanner;

public class RandomInt {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// int a = sc.nextInt(50);
		// System.out.println(a);

		Random ra = new Random();
		int rand1 = ra.nextInt(900);
		System.out.println(rand1);

		int max = 200;
		int min = 100;
		System.out.println("The random value of type int between " +min +"to "+max +".");
		int a = (int) (Math.random() * (max - min + 1) + min);
		System.out.println(a);
		
	}

}
