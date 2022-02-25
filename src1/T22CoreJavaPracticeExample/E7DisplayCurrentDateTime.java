package T22CoreJavaPracticeExample;
//Exercise 7: Write a Java method to display the current date and time.


import java.time.LocalDateTime;

public class E7DisplayCurrentDateTime {

	public static void main(String[] args) {
		LocalDateTime DT=LocalDateTime.now();
		
		System.out.println("Current Date-Time: "+ DT);
		
		
		

	}

}
