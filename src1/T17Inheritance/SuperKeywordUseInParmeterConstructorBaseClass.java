package T17Inheritance;

class SuperClass {
	int age;
	int dob;
	String name;

	SuperClass(int age) {
		this.age = age;

	}

	SuperClass(String Name, int DOB) {

		name = Name;
		dob = DOB;

	}

	public void getAge() {
		System.out.println("this value of the variable named age in super class is:" + age);
		System.out.println(name);
		System.out.println(dob);

	}

	public void name(String Name) {
		name = Name;

		// System.out.println("name is " + name);
	}
}

public class SuperKeywordUseInParmeterConstructorBaseClass extends SuperClass {
	SuperKeywordUseInParmeterConstructorBaseClass(int age) {
		super(age);
		// super(Name);
		// super(dob);
	}
	public static void main(String[] args) {
		SuperKeywordUseInParmeterConstructorBaseClass obj = new SuperKeywordUseInParmeterConstructorBaseClass(25);
		obj.getAge();
		obj.name("radhta");
		obj.dob();

	}

	private void dob() {
		// TODO Auto-generated method stub

	}

}
