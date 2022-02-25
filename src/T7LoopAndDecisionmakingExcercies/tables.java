package T7LoopAndDecisionmakingExcercies;

import java.util .Scanner;

public class tables {

	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			System.out.println("Enter the number");
			int number=obj.nextInt();
     
			for(int i=1;i<=10;i++) {
			    System.out.println(number+"*"+i +"=" + number*i);

				
			}
		}
	}

}
