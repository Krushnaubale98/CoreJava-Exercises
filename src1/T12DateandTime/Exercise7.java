package T12DateandTime;

import java.time.LocalDateTime;

// wap to display the date time info before the 2 hour and 26 minutes from current time
public class Exercise7 {

	public static void main(String[] args) {
		
		// before 2 hour and 26 minutes
		
		LocalDateTime datetime=LocalDateTime.now( ). minusHours( 2).minusMinutes(26 );
		System.out.println("\n Current time and date: "+ LocalDateTime.now());
		System.out.println("\n 2 hous and 26 minutes before: " + datetime);

	}
}
