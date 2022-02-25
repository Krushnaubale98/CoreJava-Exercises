package T19OverRiding;

class animal {

	public void move() {
		System.out.println("animal can move ");
	}

}

class dog extends animal {
	public void move() {
		super.move(); // invoke the super class method
		//System.out.println("Dogs can walk and run");
	}
}

public class useSuperKeyword {

	public static void main(String[] args) {
		
		animal b=new dog();
		b.move();
	}

}
