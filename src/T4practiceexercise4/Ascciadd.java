package T4practiceexercise4;

// Add the number in Ascii value and print the datatypes.
public class Ascciadd {
	public static void main(String[] args) {
		// print 'd' ascii value
		char chard = 'd';
		int Asciivalue = chard;
		System.out.println(3 + Asciivalue);

		// String datatype
		String charA = "dfg";
		System.out.println(charA.getClass().getSimpleName());

		//Int datatype
		int one = 10;
		System.out.println(((Object) one).getClass().getSimpleName());
		
		char a='e';
		System.out.println(((Object)a).getClass().getSimpleName());
		
		float b=1.0f;
		System.out.println(((Object)b).getClass().getSimpleName());
		
		boolean d=true;
		System.out.println(((Object)d).getClass().getSimpleName());


	}
}

