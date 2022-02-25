package T7LoopAndDecisionmakingExcercies;
import java.util .Scanner;
public class HoursParameter {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the hours between 0 to 23");
			int hour=sc.nextInt();
			
			
			if(hour<=7 || hour>=20 ) {
				System.out.println("true ,we are in truble");
			}		else {
				System.out.println("all ok");
			}
		}
	}

}
