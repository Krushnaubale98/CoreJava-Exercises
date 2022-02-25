package T18Overloading;
// in this example , we creating static methods so that we don't need to create a instance for calling method. 

class Adder{
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b ,int c) {
		return a+b+c;
	}
}

public class ChangingNoOfArgs {

	public static void main(String[] args) {
		
		System.out.println(Adder.add(10, 20));
		System.out.println(Adder.add(10, 20,30));

	}

}
