package T2practiceexercise6;

public class named {
	String name;

	public named() {
		this.name="I love programming language";

	}
	public named(String Name) {
		this.name=Name;
	}
	public String getname() {
		return name;
	}

	public static void main(String[] args) {
		
		named bydefault=new named();
		named halfname=new named("I love..");
		named fullname=new named("java");
		
		System.out.println(bydefault.name);
		System.out.println(halfname.name);
		System.out.println(fullname.name);

	}

}
