package classesandobjects;
//@SuppressWarnings("unused")
public class Javapackage {
	String name;
	int age;
	String designation;
	double salary;
	
	// This is the constructor of the class Employee
	
	public Javapackage(String name) {
		this.name=name;
	}
	// Assign the age of the employee to the variable age.
	public void empage( int empage){
		age=empage;
	}
	// assign the designation to the variable designation.
	public void empdesination(String empdesig) {
		designation=empdesig;
	}
	// assign the salary to the variable Salary.
	public void empsalary(double empsalary) {
		salary=empsalary;
	}
	public  void printemployee() {
		 System.out.println("Name:" +name);
		 System.out.println("Age:" + age);
		 System.out.println("Designation:" +designation);
		 System.out.println("Salary:" +salary);
		 
	 }
	public static void main(String args[]) {
		Javapackage details=new Javapackage("ram");
        
		details.age=21;
		details.designation=("Engineer");
		details.salary=123465;
		
		details.empage(1);
		details.empdesination("c");
		details.empsalary(1);
		
		details.printemployee();
		
	}
}
