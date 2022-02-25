
package practiceexercise3;

public class Student {
	String name;
	String CourceEnrolled;

	public void getCourceEnrolled() {

	}

	static void xyz() {
		Student ram = new Student();
		Student vicky = new Student();
		Student reena = new Student();
		// Student CourceEnrolled = new Student();

		ram.name = "Ram";
		ram.CourceEnrolled = "JAVA";
		// ram.getCourceEnrolled();

		System.out.println(" Student name is :" + ram.name);
		System.out.println(" Ram enrolled course is:" + ram.CourceEnrolled);

		vicky.name = "Vicky";
		vicky.CourceEnrolled = "HTML";
		// vicky.getCourceEnrolled();
		System.out.println(" Student name is :" + vicky.name);
		System.out.println(" vicky enrolled course is:" + vicky.CourceEnrolled);

		reena.name = "Reena";
		reena.CourceEnrolled = "Spring";
		// reena.getCourceEnrolled();
		System.out.println(" Student name is :" + reena.name);
		System.out.println(" reena enrolled course is:" + reena.CourceEnrolled);

	}

	public static void main(String[] args) {
		// getCourceEnrolled();
		// call asper static method

		xyz();

		// call asper the public method

		Student ram = new Student();
		Student vicky = new Student();
		Student reena = new Student();
		// Student CourceEnrolled = new Student();

		ram.name = "Ram";
		ram.CourceEnrolled = "JAVA";
		ram.getCourceEnrolled();
		
		System.out.println("Starts from second method");

		System.out.println(" Student name is :" + ram.name);
		System.out.println(" Ram enrolled course is:" + ram.CourceEnrolled);

		vicky.name = "Vicky";
		vicky.CourceEnrolled = "HTML";
		vicky.getCourceEnrolled();
		System.out.println(" Student name is :" + vicky.name);
		System.out.println(" vicky enrolled course is:" + vicky.CourceEnrolled);

		reena.name = "Reena";
		reena.CourceEnrolled = "Spring";
		reena.getCourceEnrolled();
		System.out.println(" Student name is :" + reena.name);
		System.out.println(" reena enrolled course is:" + reena.CourceEnrolled);

	}

}
