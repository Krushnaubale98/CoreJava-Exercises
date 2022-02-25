package T17Inheritance;

interface X {

	char c = 'A';

	char methodX();

}

class Y implements X {
	{
		System.out.println(c);
	}

	public char methodX() {

		@SuppressWarnings("static-access")
		char c = this.c;
		return ++c;
	}
}

public class Exercise2 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Y y = new Y();
		System.out.println(y.methodX());
		System.out.println(y.c);
		System.out.println(X.c);
	}

}
