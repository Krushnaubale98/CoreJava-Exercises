package T18Overloading;

public class MatchingTypePromotion {

	void sum(int a, int b) {
		System.out.println("int arg method invoked");
	}

	void sum(char a, char b) {
		System.out.println("char arg method invoked");
	}

	void sum(long a, long b) {
		System.out.println("char arg method invoked");
	}

	public static void main(String[] args) {
		MatchingTypePromotion cal = new MatchingTypePromotion();
		cal.sum(5, 10);// now int arg sum() method gets invoked
		
		// cal.sum('a', 'b');

	}

}
