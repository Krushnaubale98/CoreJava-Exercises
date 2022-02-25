package T3Accessmodifires;

public class Addition {
	public int x = 5;
	protected int y = 4;
	int a = 7;
	private int c = 9;

	public void method1() {
		
		// this is the same package with public class. here we can access all of modifiers.
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(c);

	}


//public class Addition {
	/*
	 * since we didn't mention any access modifier here, it would be considered as
	 * default.
	 *
	 */

	public static void main(String[] args) {
		
		// this is the same package but different class here we access public, protected and default.

		Addition obj = new Addition();
		// obj.method1();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.a);
		// System.out.println(obj.c); // this is the private cos of we cant access to
		// different class .

	}

}