package coreJavaTopics.keywords.staticKeyword.withMethod;

public class BOFAPremiumRewardsEliteCard {
	
	long cust_id;
	long card_number;
	String customer_name;
	String expiry_date;
	int cvv_number;
	double creditCard_limit;
	
	static String BANK_NAME = "HDFC Bank";

	public BOFAPremiumRewardsEliteCard(long cust_id, long card_number, String customer_name, String expiry_date,
			int cvv_number, double creditCard_limit) {
		super();
		this.cust_id = cust_id;
		this.card_number = card_number;
		this.customer_name = customer_name;
		this.expiry_date = expiry_date;
		this.cvv_number = cvv_number;
		this.creditCard_limit = creditCard_limit;
	}

	static void changeBankName() {
		BANK_NAME = "Bank Of America";
	}
	
	public void displayPremiumCardDetails() {
		System.out.println("------------------ Premium Card details -----------------------------");
		System.out.println("Customer ID: " + cust_id);
		System.out.println("Credit Card Number: " + card_number);
		System.out.println("Holder Name: " + customer_name);
		System.out.println("Expiry Date: " + expiry_date);
		System.out.println("CVV Number: " + cvv_number);
		System.out.println("Credit Card limit: " + creditCard_limit);
		System.out.println("Bank Name: " + BANK_NAME);
	}

	public static void main(String[] args) {
		
		BOFAPremiumRewardsEliteCard card1 = new BOFAPremiumRewardsEliteCard(121240, 998566321145l, "Rajesh", "24-09-2036", 465, 100000.0d);
		BOFAPremiumRewardsEliteCard card2 = new BOFAPremiumRewardsEliteCard(121241, 665988457752l, "Umesh", "29-09-2037", 908, 150000.0d);
		BOFAPremiumRewardsEliteCard card3 = new BOFAPremiumRewardsEliteCard(121242, 332544518896l, "Rupesh", "30-09-2039", 783, 200000.0d);
		BOFAPremiumRewardsEliteCard card4 = new BOFAPremiumRewardsEliteCard(121242, 458896332458l, "Ramesh", "07-09-2038", 453, 300000.0d);
		
		card1.displayPremiumCardDetails();
		BOFAPremiumRewardsEliteCard.changeBankName();
		card2.displayPremiumCardDetails();
		card3.displayPremiumCardDetails();
		card4.displayPremiumCardDetails();
	}

}
