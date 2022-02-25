package practiceexercise1;

public class AccountHolderobject {

	public static void main(String[] args) {
	
		AccountHolder tom=   new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		
		tom.firstname="Tom";
		tom.lastname="smith";
		tom.age=21;
		tom.ACbal=10000;
		tom.testeligibleForCC();
		 
		System.out.println(" is tom eligible for CC:" + tom.testeligibleForCC);	
		
		henry.firstname="Henry";
		henry.lastname="Hill";
		henry.age=31;
		henry.ACbal=20000;
		henry.testeligibleForCC();
		 
		System.out.println(" is Henry eligible for CC:" + henry.testeligibleForCC);	
		
		sarah.firstname="Tom";
		sarah.lastname="smith";
		sarah.age=41;
		sarah.ACbal=30000;
		sarah.testeligibleForCC();
		 
		System.out.println(" is Sarah eligible for CC:" + sarah.testeligibleForCC);	
		
	}
	

}
