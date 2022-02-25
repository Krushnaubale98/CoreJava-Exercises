package T7LoopAndDecisionmakingExcercies;

import java.util.Scanner;

class ClaculateRevenue {

	public static void main(String[] args) {
		Calculatesale();
	}

	static void Calculatesale() {
		float unitprise = 0f;
		int quantity = 0;
		float revenue = 0f;
		float DiscountRate = 0f;
		float DiscountAmount = 0f;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the unit prise");
			unitprise=sc.nextFloat();
			
			System.out.println("Enter Quantity");
			quantity=sc.nextInt();
		}
		if(quantity>100) { 
			revenue=unitprise*quantity;
		}		else if(quantity>=100 && quantity<=120) {
			DiscountRate=(float)10/100;
			revenue=unitprise*quantity;
			DiscountAmount=revenue*DiscountRate;
			revenue -= DiscountAmount;
		}else if(quantity>120) {
			DiscountRate=(float)15/100;
			revenue=quantity*unitprise;
			DiscountAmount=revenue*DiscountRate;
			revenue-=DiscountAmount;
		}
		System.out.println("The revenue from sale:" +revenue+"$");
		System.out.println("After the discount :"+ DiscountAmount +"$("+DiscountRate*100+"%" );
		
	}

}
