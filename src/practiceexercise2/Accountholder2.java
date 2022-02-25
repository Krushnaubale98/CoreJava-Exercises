package practiceexercise2;
public class Accountholder2 {
	
	public static void main(String[] args) {
		
		Accountholder tom=new Accountholder();
		Accountholder hanry=new Accountholder();
		Accountholder sarah=new Accountholder();
		
		tom.firstname="Tom";
		tom.lastname="smith";
		tom.age=21;
		tom.ACbal=10000;
		tom.testEligibleforCC();
		System.out.println(" is tom eligible for CC:" + tom.EligibleforCC);	
		
		hanry.firstname="hanry";
		hanry.lastname="hill";
		hanry.age=31;
		hanry.ACbal=20000;
		hanry.testEligibleforCC();
		System.out.println(" is tom eligible for CC:" + hanry.EligibleforCC);	
		
		sarah.firstname="sarha";
		sarah.lastname="miler";
		sarah.age=41;
		sarah.ACbal=30000;
		sarah.testEligibleforCC();
		System.out.println(" is tom eligible for CC:" + sarah.EligibleforCC);	
		
	
	}

}
