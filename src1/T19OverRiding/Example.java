package T19OverRiding;

class main1 {
	public void move() {
		System.out.println("Animals can move");
	}

}

public class Example extends main1 {
	public void move() {
		System.out.println("dogs can walk and run");
	}
	
	public void bark() {
		System.out.println("dogs can bark");
	}

	public static void main(String[] args) {
		main1 obj = new main1(); // main1 reference and object
		main1 obj1 = new Example(); // main1 reference but Example object

		obj.move();
		obj1.move();
	//	obj1.bark(); // we can no

	}

}
