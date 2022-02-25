package T16Interface;

interface intrface2 {

	void eat();

	void travel();

}
interface interface1{
	void shy();
	void drink();
}

class animal22 implements intrface2 ,interface1{

	public void eat() {
		System.out.println("Aimal eats");
	}

	public void travel() {

		System.out.println("animal travel");
	}
	 public void shy() {
		System.out.println("he is a shy persom");
	}
	public void drink() {
		System.out.println("they are drinking water");
	}
}

public class from1 {

	public static void main(String[] args) {
		animal22 obj = new animal22();
		obj.eat();
		obj.travel();
		obj.shy();
		obj.drink();
	}

}
