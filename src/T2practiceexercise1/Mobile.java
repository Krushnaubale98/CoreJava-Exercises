package T2practiceexercise1;

public class Mobile {
	String name;
	String mobiletype;
	String mobilecolor;
	String Camera;
   
	public Mobile(String Name) {
    	this.name=Name;
    }
    public void mobiletype(String mobilename) {
    	mobiletype=mobilename;
    	
    }
    public void mobilecolor(String color) {
    	mobilecolor=color;
    }
    public void camerasize(String camerasize) {
    	Camera=camerasize;
    }
    public void mainfun() {
    	System.out.println("Name:"+name +" own" + mobiletype + mobilecolor + " color " + "smartphone having "+ Camera + " camera");
    }
    public static void main(String[] args) {
    	
    	Mobile abhishek=new Mobile("Abhishek");
    	Mobile rahul=new Mobile("Rahul");
    	Mobile ravi=new Mobile("Ravi");
		 
    	
    	abhishek.mobiletype(" Iphone");
    	abhishek.mobilecolor(" Gold");
    	abhishek.camerasize(" 8Mp");
    	abhishek.mainfun( );
    	
    	rahul.mobiletype(" Samsung");
    	rahul.mobilecolor(" black");
    	rahul.camerasize(" 12MP");
    	rahul.mainfun( );
    	
    	ravi.mobiletype(" jio");
    	ravi.mobilecolor(" white");
    	ravi.camerasize(" 6MP");    	
    	ravi.mainfun( );
    	
	}
}
