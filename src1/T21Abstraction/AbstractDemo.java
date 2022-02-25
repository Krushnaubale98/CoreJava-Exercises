package T21Abstraction;

public class AbstractDemo extends UseBstractClass {

	// we can inherit the properties of UseBstractClass class like concrete class
	// the following way...

	private double salary;

	public AbstractDemo(String name, String address, int number, double salary) {
		super(name, address, number);

		setSalary(salary);
	}

	public void mailCheck() {
		System.out.println("within mailcheck of salary class");
		System.out.println("Mailing check to " + getName() + "with salary" + salary);
	}

	public double getsalary() {
		return salary;
	}

	public void setSalary(double newSalary) {
		if (newSalary >= 0.0) {
			salary = newSalary;
		}
	}

	public double computePay() {
		System.out.println("computing salary for" + getName());
		return salary / 52;
	}

	public static void main(String[] args) {
		// UseBstractClass is not allowed would you error
		// we can not create the object of the abstaract class
		// * UseBstractClass ab=new UseBstractClass( "krushna ubale ", "aurangabad",
		// 43);
		// * System.out.println("\n call the mailcheck using UseBstractClass
		// reference....");

		// call the inherit class
// create the inherit(child class) class object

		AbstractDemo child=new AbstractDemo("krushna ubale","aurangazbad",1,50000); // refrence and object of child class
		System.out.println("call the mailcheck using AbstractDemo (child class) reference");
		child.mailCheck();;
		
		System.out.println();
		UseBstractClass parent=new AbstractDemo("ram patil","aurangabad",2,45000); // refrence by parent class
		System.out.println("call the mailcheck using UseBstractClass(parent class) reference"); 
		parent.mailCheck();
		
		 
		
	}

}
