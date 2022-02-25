package T12DateandTime;

import java.util.Calendar;

// WAP to get a the last day of the current month
public class Exercise3 {

	public static void main(String[] args) {

		// get a calendar using the default time zone and locale.

		Calendar cal = Calendar.getInstance();
		System.out.println();
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println();
	}

}
