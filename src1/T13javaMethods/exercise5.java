package T13javaMethods;

// Print valid password
import java.util.Scanner;

public class exercise5 {
	public static final int PsswordLength = 8;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print(

					"1. A password must have at least eight Characters.\n"
							+ "2. A password consist of on;y letters and digits. \n"
							+ "3. A password must contain at least two digits \n"
							+ "Iput a password(You are agreeing to the above terms and conditions.):");
			String str = sc.nextLine();

			if (IsValidPassword(str)) {
				System.out.println("Password is valid: " + str);

			} else {
				System.out.println("Not a valid password: " + str);
			}
		}

	}

	private static boolean IsValidPassword(String password) {
		if (password.length() < PsswordLength)
			return false;
		int CharCount = 0;
		int NumCount = 0;
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
		if(is_Numeric(ch)) NumCount++;
		else if(is_Latter(ch))CharCount++;
		else return false;
		}
		return (CharCount>=2 && NumCount>=2);
	}
	private static boolean is_Numeric(char ch) {
		
		return (ch>='0' && ch<= '9');
	}
	
	

	public static boolean is_Latter(char ch) {
		ch=Character.toUpperCase(ch);
		return(ch>='A' && ch <='Z');
	}

}
