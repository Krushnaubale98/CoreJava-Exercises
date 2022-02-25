package T12DateandTime;

import java.util.Date;
import java.text.*;

public class CurrentDate {

	public static void main(String[] args) {
		// Instantiate a date object
		Date date = new Date();
		
		//long dat=date.getTime();
		//int dat=date.getDay()
		//System.out.println(dat);
		

		// Display time and date using toString()

		System.out.println(date.toString());

		SimpleDateFormat DF = new SimpleDateFormat("E yyyy.MM.dd 'at' hh.mm.ss a zzz");
		System.out.println("Current date: " + DF.format(date));
	}

}
