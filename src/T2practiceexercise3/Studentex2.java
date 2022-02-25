package T2practiceexercise3;

public class Studentex2 {
	String name;
	
	public Studentex2() {
		name="Unknown";
	}
	public Studentex2(String Name) {
		this.name=Name;
	}
	public String getname() {
		return name;
	}
	


	public static void main(String[] args) {
		Studentex2 ram=new Studentex2();
		Studentex2 sham=new Studentex2("Sham");

		 
		//ram.getname();
		//sham.getname();
		System.out.println(ram.name);
		System.out.println(sham.name);
	}
}

