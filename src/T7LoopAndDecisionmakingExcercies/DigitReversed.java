package T7LoopAndDecisionmakingExcercies;

public class DigitReversed {

	public static void main(String[] args) {
		int number = 12345;
		int rev = 0, rem = 0;
		while (number != 0) {
			rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10;

		}
		System.out.println("reverse of " + rev);
	}

}
