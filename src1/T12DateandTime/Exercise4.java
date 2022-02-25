package T12DateandTime;

import java.util.Calendar;

// wap to get a day of the week of a specific date.
public class Exercise4 {
	public static void main(String[] args) {
		// Create a default Calendar
		
		Calendar cal=Calendar.getInstance();
		
		// set your date :cal.setTime(yourDate);
		
		System.out.println();
		int dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("Day of the week :" + dayOfWeek);
		System.out.println();
		
	}
}
