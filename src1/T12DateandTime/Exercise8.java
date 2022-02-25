package T12DateandTime;


import java.util.Scanner;
//wapto check a year to leap year or not

public class Exercise8 {
	public static void main(String[] args) {
		System.out.println("Enter the 4 digit year");
		try (Scanner sc = new Scanner(System.in)) {
		
			int year = sc.nextInt();
			
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
				System.out.println("Year " + year + " is a leap year");
			else
				System.out.println("year " + year + " is not a leap year");
		}
	}
}