package T10StringClass;

public class CharIndex {
	public static void main(String[] args) {

		String s1 = "java exercises";

		int a=s1.indexOf("r");
		System.out.println(a);
		
		String ss=("PHP exercises and python exercises Specified sequence of char value");
		
		//sequence the string
		
		String ak=ss.replace("Specified sequence of char value", "contains string \'Python'");
		System.out.println(ak);
	}

}
