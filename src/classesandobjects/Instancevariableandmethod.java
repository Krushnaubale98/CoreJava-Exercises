package classesandobjects;

public class Instancevariableandmethod {
	String fruit;

	public Instancevariableandmethod(String name) {
		// this constructor has one parameter ,name.
		System.out.println("Name fruit is:" + name);

	}

	public void setvalue(String value) {
		fruit = value;
	}

	public String getvalue() {
		System.out.println("fruit value is:" + fruit);
		return fruit;
	}

	public void setColor(String color) {
		fruit = color;
	}

	public String getColor() {
		System.out.println("fruit color is:" + fruit);
		return fruit;
	}

	
	public static void main(String[] args) {
		// Object creation
		Instancevariableandmethod MyFruit = new Instancevariableandmethod("mango");
		// call class method to set fruit color
		
		MyFruit.setvalue("10 rs");

		// call another class method to get fruit
		MyFruit.getvalue();

		// call class method to set fruit color
		MyFruit.setColor("yellow");

		// call another class method to get fruit
		MyFruit.getColor();

		// you can access instance variable as follows as well
		//System.out.println("Variable value :" + MyFruit.fruit);

	}

}
