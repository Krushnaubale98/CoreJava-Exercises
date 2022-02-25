package T17Inheritance;
// two class have a same member function and same variable than we can access to them using a super keyword
class B{
	int num = 10;

	// display method of the superclass
	public void display() {
		System.out.println("This is super clss method");

	}

}


public class classA extends B{
	int num = 20;

	public void display() {
		System.out.println("this is the display method of the base class");
	}

	public void mythod() {
		// instatiating subclas

		classA sub = new classA();

		// invoking the display() mehtod of subclass

		sub.display();
		// invoking hte display method of superclsss

		super.display();

		// printing hte value of the variable of the base class
		System.out.println("this is the value the variable of the base class" + sub.num);

		// printin the value of the variaable of hte super class

		System.out.println("this is the value of the super class variable" + super.num);
	}


	public static void main(String[] args) {
		classA obj= new classA();
		obj.mythod();

	}

}
