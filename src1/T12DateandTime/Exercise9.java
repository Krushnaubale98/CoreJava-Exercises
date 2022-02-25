package T12DateandTime;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

// wap  to get a date after 2 date
public class Exercise9 {

	public static void main(String[] args) {
		// two weeks
		int noOfDays = 14;
		Calendar cal = Calendar.getInstance();
		Date cdate = cal.getTime();
		
		//get date after the 2 weeks
		cal.add(Calendar.DAY_OF_MONTH, noOfDays);
		Date date = cal.getTime();
		
		System.out.println("\ncurrent date:" + cdate + "\n");
		System.out.println("Day after two week: " + date + "\n");
	
		// get 10 before date 
		LocalDate today=LocalDate.now();
		System.out.println("10 days before date:"+ today.minusDays(-10));
		
		//get 10 days after date
		//LocalDate today=LocalDate.now();
		System.out.println("10 days after date:"+ today.plusDays(10));
		
	}  
	

}
