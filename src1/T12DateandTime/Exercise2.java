package T12DateandTime;
// wap to java prg to get a display ifo(year,month,hour minute)of a calender

import java.util.Calendar;

public class Exercise2 {

	public static void main(String[] args) {
		// create a default calendar
		Calendar cal = Calendar.getInstance();
		System.out.println();
		System.out.println("Year: " +cal.get(Calendar.YEAR));
		System.out.println("Month " +cal.get(Calendar.MONTH));
		System.out.println("Hour: "+cal.get(Calendar.HOUR));
		System.out.println("Minute "+cal.get(Calendar.MINUTE) );
		//System.out.println();
	}

}
