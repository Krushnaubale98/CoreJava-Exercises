package T2practiceexercise3;

public class Student {
	String name;

	public Student() {
		this.name = "Unkonwn";
	}

	public Student(String Name) {
		this.name = Name;
		// TODO Auto-generated constructor stub
	}

	public String mainfun() {
		return name;
		// System.out.println(" the student name is:"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = { new Student(), new Student("Tom"), new Student("sam"), new Student() };

		for (Student student : students) {
			System.out.println("The students name is:" + student.mainfun());
		}
	}

}
