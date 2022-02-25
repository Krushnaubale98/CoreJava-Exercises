package T22CoreJavaPracticeExample;

import java.util.Calendar;
import java.util.TimeZone;

public class E5CurrentTNewYork {

	public static void main(String[] args) {
		Calendar calNewYork = Calendar.getInstance();
		calNewYork.setTimeZone(TimeZone.getTimeZone("America/NewYork"));
		System.out.println();
		System.out
				.println("Time in new york:" + calNewYork.get(Calendar.MINUTE) + ":" + calNewYork.get(Calendar.SECOND));
		System.out.println();

		
	}

}
