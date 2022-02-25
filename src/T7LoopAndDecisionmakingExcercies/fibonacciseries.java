package T7LoopAndDecisionmakingExcercies;

import java.util.Scanner;

public class fibonacciseries {

	public static void main(String[] args) {
		int terms, a=0, b = 1, c;
		System.out.println("Enter the terms");
		try (Scanner obj = new Scanner(System.in)) {
			terms = obj.nextInt();
		}
		for(int i=1;i<=terms;i++){
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}

}
