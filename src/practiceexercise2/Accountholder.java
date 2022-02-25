package practiceexercise2;

public class Accountholder {

	String firstname;
	String lastname;
	int age;
	float ACbal;
	boolean EligibleforCC;

	public void testEligibleforCC() {
		if (age > 22 && ACbal >= 25000) {
			EligibleforCC = true;
		}
	}
}
