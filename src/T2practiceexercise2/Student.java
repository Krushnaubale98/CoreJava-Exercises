package T2practiceexercise2;

public class Student {
 String name;
 int rollno;
 String fathername;
 int contact;
 String address;
 
	public Student (String Name) {
		this.name=Name;
	}
	public void setrollno(int Rollno) {
		rollno=Rollno;
		
	}
	public void setfathername(String Fathername) {
		fathername=Fathername;
		
	}
	public void setcontact(int Contact) {
		contact=Contact;
		
	}
	public void setaddress(String Address) {
		address=Address;
	}
	public void showall() {
	 System.out.println( "Name:" +name);
	 System.out.println("Rollno:"+ rollno);
	System.out.println("Fathername:" +fathername);
	System.out.println("Contact:"+contact);
	System.out.println("Address:" +address);
	}
	
	public static void main(String[] args) {
		
		Student sham=new Student("Sham");
		
		sham.setrollno(1);
		sham.setfathername(" narayan");
		sham.setcontact(77449474);
		sham.setaddress("At Aurangabad , Maharastra");
		
		sham.showall();
	}
}

