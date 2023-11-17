package coreJavaTopics.keywords.staticKeyword.withVariable;

public class BOAFAPremiumRewardsCard {
	
	long cust_id;
	long cc_number;
	String cc_holder_name;
	String cc_expiry_date;
	int cvv_num;
	double cc_limit;
	
	static String BANK_NAME = "Bank of America";

	public BOAFAPremiumRewardsCard(long cust_id, long cc_number, String cc_holder_name, String cc_expiry_date,
			int cvv_num, double cc_limit) {
		super();
		this.cust_id = cust_id;
		this.cc_number = cc_number;
		this.cc_holder_name = cc_holder_name;
		this.cc_expiry_date = cc_expiry_date;
		this.cvv_num = cvv_num;
		this.cc_limit = cc_limit;
	}
	
	public void displayCCInfo() {
		System.out.println("------------------ Credit Card details -----------------------------");
		System.out.println("Customer ID: " + cust_id);
		System.out.println("Credit Card Number: " + cc_number);
		System.out.println("Holder Name: " + cc_holder_name);
		System.out.println("Expiry Date: " + cc_expiry_date);
		System.out.println("CVV Number: " + cvv_num);
		System.out.println("Credit Card limit: " + cc_limit);
		System.out.println("Bank Name: " + BANK_NAME);
	}
	
	public static void main(String[] args) {
		
		BOAFAPremiumRewardsCard card1 = new BOAFAPremiumRewardsCard(225579, 986652441255L, "Rajesh", "15-09-2035", 524, 50000.0d);
		BOAFAPremiumRewardsCard card2 = new BOAFAPremiumRewardsCard(985472, 986478483178L, "Ramesh", "19-09-2036", 854, 60000.0d);
		
		//call the instance method
		card1.displayCCInfo();
		card2.displayCCInfo();
	}
}
