package T18Overloading;

class calculation {

	void sum(int a, long b) {

		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

}

public class OloadingTypePromotion {

	public static void main(String[] args) {

		calculation cal = new calculation();
		cal.sum(12, 10);
		cal.sum(5, 50, 50);
	}

}
