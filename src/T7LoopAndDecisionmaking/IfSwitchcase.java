package T7LoopAndDecisionmaking;

public class IfSwitchcase {

	public static void main(String[] args) {
//char grade=args[0].charAt(0);
		char grade='A';
		
		switch(grade) {
		case'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("well done");
			break;
		case 'C':
			System.out.println("you passed");
		default:
			System.out.println("invalid grade");
		}
		System.out.println("Your grade is " + grade);
	}

}
