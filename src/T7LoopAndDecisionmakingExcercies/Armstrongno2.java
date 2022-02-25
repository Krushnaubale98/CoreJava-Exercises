package T7LoopAndDecisionmakingExcercies;

public class Armstrongno2 {

	public static void main(String[] args) {
		int a, rem,  s = 0;
		for (int i = 1; i <= 1000; i++) {
			a = i;
			s = 0;
			while (a > 0)

			{
				rem = a % 10;
				s = s + rem * rem * rem;
				a = a / 10;
			}
			if (s == i)
			System.out.println(i);

		}
	}

}
