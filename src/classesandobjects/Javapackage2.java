package classesandobjects;

//@SuppressWarnings("unused")
public class Javapackage2 {

		public static void main(String args[]) {
			Javapackage empone=new Javapackage("harry sharma");
			Javapackage emptwo=new Javapackage("wani sharma");
			
			// invoking method for each object created 
			empone.empage(36);
			empone.empdesination("senior software engineer");
		    empone.empsalary(10000);
		    empone.printemployee();
		    
		    
		    emptwo.empage(45);
		    emptwo.empdesination("software engineeer");
		    emptwo.empsalary(74969);
			emptwo.printemployee();

		

	}

}
