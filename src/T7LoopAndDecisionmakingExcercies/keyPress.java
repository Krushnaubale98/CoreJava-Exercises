package T7LoopAndDecisionmakingExcercies;

import java.util.Scanner;

public class keyPress {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number");

			int num = sc.nextInt();
			//String a = sc.next();

			switch (num) {
			case 1:
				System.out.println("you presed " + num);
				break;
			case 2:
				System.out.println("you presed " + num);
				break;
			case 3:
				System.out.println("you presed " + num);
				break;

			case 4:
				System.out.println("you presed " + num);
				break;
			case 5:
				System.out.println("you pressed " + num);
				break;
			case 6:
				System.out.println("ypu pressed " + num);
				break;
			case 7:
				System.out.println("you pressed " + num);
				break;
			case 8:
				System.out.println("you pressed " + num);
				break;
			case 9:
				System.out.println("you pressed " + num);
				break;
			default:
				if (num >= 10 ) {
					System.out.println("not allwoed");

				}
				}
		}

		}
	}

