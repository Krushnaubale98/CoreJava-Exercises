package T5vehicalpracticeexercise1;

public class car {
	public String color;
	public String model;
	protected String enginetype;
	
	public void carcolor(String Color) {
		 color = Color;
		
	}
	public void carmodel(String Model) {
		model=Model;
	}
	public void cartype(String Enginetype) {
		enginetype=Enginetype;
	}
	public void printdata() {
		System.out.println(" the car color:" + color);
		System.out.println(" the car carmodel:" + model);
		System.out.println(" the car cartype:" + enginetype);

	}


	
	}


