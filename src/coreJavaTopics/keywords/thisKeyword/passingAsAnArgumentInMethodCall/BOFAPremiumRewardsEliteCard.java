package coreJavaTopics.keywords.thisKeyword.passingAsAnArgumentInMethodCall;

public class BOFAPremiumRewardsEliteCard {
	
	long customer_id;
	long card_number;
	String cust_name;
	String expiry_date;
	int cvv_num;
	double cc_limit; 
	
	static String BANK_NAME = "HDFC Bank";
	
	public BOFAPremiumRewardsEliteCard() {	
	}
	
	public BOFAPremiumRewardsEliteCard(long customer_id, long card_number, String cust_name, String expiry_date,
			int cvv_num, double cc_limit) {
		super();
		this.customer_id = customer_id;
		this.card_number = card_number;
		this.cust_name = cust_name;
		this.expiry_date = expiry_date;
		this.cvv_num = cvv_num;
		this.cc_limit = cc_limit;
	}
	
	/*
	 * static void changeBankName(BOFAPremiumRewardsEliteCard card) { 
	 * BANK_NAME = "Bank Of America"; 
	 * }
	 */

	//method which takes this key word as a parameter from the method call
	public void displayEliteCardDetails(BOFAPremiumRewardsEliteCard card) {
		System.out.println("------------------ Premium Elite Card details -----------------------------");
		System.out.println("Customer ID: " + customer_id);
		System.out.println("Credit Card Number: " + card_number);
		System.out.println("Holder Name: " + cust_name);
		System.out.println("Expiry Date: " + expiry_date);
		System.out.println("CVV Number: " + cvv_num);
		System.out.println("Credit Card limit: " + cc_limit);
		System.out.println("Bank Name: " + BANK_NAME);
	}
	
	//method in which we pass this keyword as an argument in the method call
	public void changeBankNameAndDisplayInfo() { 
		 BANK_NAME = "Bank Of America"; 
		 displayEliteCardDetails(this);
	}


	public static void main(String[] args) {
		
		BOFAPremiumRewardsEliteCard card = new BOFAPremiumRewardsEliteCard();
		BOFAPremiumRewardsEliteCard card1 = new BOFAPremiumRewardsEliteCard(6635241, 998655241145l, "Rajesh", "12-09-2029", 965, 50000.0d);
		
		//displaying card details without changing bank name
		card1.displayEliteCardDetails(card);
		
		//displaying card details after changing bank name
		card1.changeBankNameAndDisplayInfo();
	}

}
