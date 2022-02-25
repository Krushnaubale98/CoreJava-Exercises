package T3Accessmodifiresdefault;

import T3Accessmodifires.Addition;

//import T3Accessmodifires.*;
class using extends Addition{
	
	void method2() {
		
		// this is use for the subclass but different package. here we have public and protected access
		System.out.println(x);
		System.out.println(y);
		//System.out.println(a);
		//System.out.println(c)
		
		
	}
	
}


public class testAccessModifers {

	public static void main(String[] args) {
		System.out.println(" i am using the package");
		
		// this is use for the outside for world(class) here we can have only public access 
		Addition obj=new Addition();
		obj.method1();
		//System.out.println(obj.x);
		//System.out.println(obj.y);
		//System.out.println(obj.a);
		//System.out.println(obj.c)
		
		using obj2=new using();
		obj2.method2();

	}

}
