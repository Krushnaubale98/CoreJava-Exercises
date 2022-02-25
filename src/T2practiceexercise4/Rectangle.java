package T2practiceexercise4;

public class Rectangle {
	int length;
	int breadth;

	public Rectangle() {
		this.length = 0;
		this.breadth = 0;

	}

	public Rectangle(int Length, int Breadth) {
		this.length = Length;
		this.breadth = Breadth;
	}

	public Rectangle(int length) {
		this.length = length;
		breadth = length;
	}

	public void area() {
		System.out.println(length * breadth);
	}

	public static void main(String[] args) {
		Rectangle obj1=new Rectangle();
		obj1.area();
		
		Rectangle obj2=new Rectangle(3,5);
		obj2.area();
		
		Rectangle obj3=new Rectangle(4);
		obj3.area();

	}

}
