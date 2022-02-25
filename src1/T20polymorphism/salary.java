package T20polymorphism;

public class salary extends Employee {

	private double salary; // annual salary

	public salary(String name, String address, int number,double salary) {
		super(name, address, number);
		setsalary(salary);

	}
	public void mailCheck() {
		System.out.println("Within mailCheck of salary class");
		System.out.println("Mailing check to" + getName() + " with salary " + salary);
	}
	public double getSalary() {
		return salary;
	}
	public void setsalary(double newSalary) {
		if(newSalary>=0.0) {
			salary=newSalary;
		}
	}
	public double computePay() {
		System.out.println("Computing salary pay for " + getName());
		return salary/52;
	}
	public static void main(String[] args) {
		
		salary s=new salary("mohd mohrashim","ambehta,up ",3,3600.00);
		Employee e=new salary("john adams","boston ,MA ",2,2400.00);
		System.out.println("call mailcheck using salary reference --");
		s.mailCheck();
		System.out.println("\ncall mailcheck using employee reference..");
		e.mailCheck();
	}

}
