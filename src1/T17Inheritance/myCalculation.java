package T17Inheritance;

class claculation {
	int c;

	public void addition(int a, int b) {
		c = a + b;
		System.out.println("The addition is:" + c);
	}

	public void substraction(int a, int b) {
		c = a - b;
		System.out.println("the substraction is " + c);
	}

}

public class myCalculation extends claculation {

	public void multipication(int a, int b) {

		c = a * b;
		System.out.println("multiplition is " + c);

	}

	public static void main(String[] args) {
		int a = 10, b = 5;
		myCalculation sc = new myCalculation();
		sc.addition(a, b);
		sc.substraction(a, b);
		sc.multipication(a, b);
	}
}
