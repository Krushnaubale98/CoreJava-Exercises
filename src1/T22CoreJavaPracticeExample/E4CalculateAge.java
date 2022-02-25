package T22CoreJavaPracticeExample;
// wap to calculate the age using DObirth.

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class E4CalculateAge {

	public static void main(String[] args) {
		
		LocalDate today=LocalDate.now();
		
		LocalDate Birthday=LocalDate.of(1998,Month.AUGUST,10);// birth date 
		Period p=Period.between(Birthday, today);
		
		//new access the values as below

		System.out.println("Years=> "+p.getYears());
		System.out.println("Months=>"+p.getMonths());
		System.out.println("Days=>  "  +p.getDays());
		
	}

}
