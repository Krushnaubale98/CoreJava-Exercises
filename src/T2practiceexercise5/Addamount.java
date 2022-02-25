package T2practiceexercise5;

public class Addamount {

	float amount=50;

	public Addamount() {
		this.amount = 0;

	}

	public Addamount(float Amount) {
		this.amount = Amount+amount;
	}

	public void Add() {
		System.out.println("Total balance is:" + amount);
	}

	public static void main(String[] args) {
		Addamount intialbal = new Addamount(12);

		Addamount totalbal = new Addamount(50);
		
		intialbal.Add();
		totalbal.Add();

	}

}
