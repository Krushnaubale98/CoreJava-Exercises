package T22CoreJavaPracticeExample;

//import java.io.IOException;
import java.util.Scanner;

public class E3ReverseNumUseForloop {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Number =>");
			int num=sc.nextInt();
			int reversed=0;
			for(;num!=0;num/=10) {
				int digit=num%10;
				reversed=reversed*10+digit;
			}
			System.out.println("Reversed number =>"+reversed);
		}catch(Exception es) {
			System.out.println("invalid input");
		}

	}

}
