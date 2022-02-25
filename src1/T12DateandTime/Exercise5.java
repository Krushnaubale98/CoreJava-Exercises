package T12DateandTime;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// wap to convert a String to date
public class Exercise5 {
	public static void main(String[] args) throws IOException {

		String str ="13-02-2022";
		// DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMMM
		// d,yyyy",Locale.ENGLISH);

		LocalDate date = LocalDate.parse(str, DateTimeFormatter.ISO_DATE);
		System.out.println();
		System.out.println(date);
		System.out.println();
	}
}
