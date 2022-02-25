package practiceexercise4;
//import java.io.*;

public class Accountant {
	String name;
	String email;
	String contact;

	public Accountant(String Name,String Email,String contact) {
		//name = Name;
		System.out.println("Student name is:"+ Name);
		//System.out.println("Student Email is:"+ Email);
		//System.out.println("Student contact is:"+ contact);

		//email = Email;
		//contact = Contact;

	}

	public void contact(String Contact) {
		contact = Contact;
	}

	public String getcontact() {
		System.out.println("Student Mo.No is:" + contact);
		return contact;
	}

	public void email(String Email) {
		email = Email;
	}

	public String getemail() {
		System.out.println("Student Email is:" + email);
		return email;
	}

	public static void main(String[] args) {

		Accountant Ravi = new Accountant("Ravi","revi@gmail.com","464464464");

		//Ravi.("Ravi");
		Ravi.email("revi@gmail.com");
		Ravi.contact("4644644697");
		Ravi.getemail();
		Ravi.getcontact();
		
		Accountant Rutuja = new Accountant("Rutuja","Rutuja@gmail.com","654546454");

		Rutuja.email("Rutuja@gmail.com");
		Rutuja.contact("6545645464");
		Rutuja.getemail();
		Rutuja.getcontact();


	}

}
