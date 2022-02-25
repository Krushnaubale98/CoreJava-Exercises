package T10StringClass;

public class MValueOf {
	// this method converts different types of value  into a string.
	public static void main(String[] args) {
		int value=20;
		String s1=String.valueOf(value);
		System.out.println(s1+17);
		
		//convert into a String 
		
		int a=30;
		char b='e';
		float c=4.5f;
		byte d=5;
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(d));
		
	}

}
