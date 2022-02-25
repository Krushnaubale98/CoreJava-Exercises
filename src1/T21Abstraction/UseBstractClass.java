package T21Abstraction;

abstract public class UseBstractClass {

	private String name;
	private String address;
	private int number;

	public UseBstractClass(String name, String address, int number) {
		System.out.println("Constructing an UseBstractClass");
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public double computePay() {
		System.out.println("Inside UseBstractClass  computepay");
		return 0.0;
	}
	public void mailCheck() {
		System.out.println("Mailling a check to" +(this.name)+ " " + this.address);
	}
	public String toString() {
		return  name +" "+ address+" "+number;
	}
	public String getName() {
		return name;
	}
	public void setAddress(String newAddress) {
		address =newAddress;
	}
	public int getnumber() {
		return number;
	}
	
}