package T7LoopAndDecisionmakingExcercies;
import java.util .Scanner;
public class ELigibelForvote {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter you r age");
			int num=sc.nextInt();
			if(num>=18) {
				System.out.println(" congress.. u r eligible for the vote");
			}else {
				System.out.println("Sry u r not eligible for the vote");
			}
		}

	}

}
