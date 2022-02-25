package T18Overloading;

class Adder1{
	static int add(int a,int b) {
		return a+b;
		
	}
	static double add(double a,double b) {
		return a+b;
	}
}
public class ChangingDatatype {

	public static void main(String[] args) {
		System.out.println(Adder1.add(10, 10));
		System.out.println(Adder1.add(55.5, 4.5));
	

	}

}
