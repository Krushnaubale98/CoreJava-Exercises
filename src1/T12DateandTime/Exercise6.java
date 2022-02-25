package T12DateandTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

//wap to get the next and previous friday.

public class Exercise6 {
	public static void main(String[] args) {
		LocalDate dt = LocalDate.now();
		System.out.println("\n Next friday:" +dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
		System.out.println("\n Privious Friday:" +dt.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));
	}
}
