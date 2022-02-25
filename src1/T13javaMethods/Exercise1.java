package T13javaMethods;

import java.util.Scanner;

//write a java method to find the smallest number among three number

public class Exercise1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// this is first logic
			System.out.println("Input the first number");
			double x = sc.nextDouble();
			
			System.out.println("Input the second number");
			double y = sc.nextDouble();

			System.out.println("Input the third number");
			double z = sc.nextDouble();
			
			
			//this second logic
			double smallest;
			if(x<y) {
				if(z<x) {
					smallest=z;
				}else {
					smallest =x;
				}
				
			}else {
				if(y<z) {
					smallest=y;
					
				}else {
					smallest=z;
				}
			}
System.out.println("smallest elements is "+smallest);
			//System.out.println("The Smallest value is " + smallest(x, y, z) + "\n");
		}

	}

public static double smallest (double x,double y,double z) {
	return Math.min(Math.min(x, y), z);
}
}
