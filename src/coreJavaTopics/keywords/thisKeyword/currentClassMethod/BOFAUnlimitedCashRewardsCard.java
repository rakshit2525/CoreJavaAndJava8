package coreJavaTopics.keywords.thisKeyword.currentClassMethod;

public class BOFAUnlimitedCashRewardsCard {
	
	long crc_num;
	String crc_holder_name;
	String expiry_date;
	int cvv_num;
	double crc_limit;

	public BOFAUnlimitedCashRewardsCard(long crc_num, String crc_holder_name, String expiry_date, int cvv_num,
			double crc_limit) {
		super();
		this.crc_num = crc_num;
		this.crc_holder_name = crc_holder_name;
		this.expiry_date = expiry_date;
		this.cvv_num = cvv_num;
		this.crc_limit = crc_limit;
	}

	public void method() {
		this.displayCRCDetails();
		System.out.println("----------------- This is a dummy method -------------------");
	}
	
	public void displayCRCDetails() {
		System.out.println("------------------ Credit Card details -----------------------------");
		System.out.println("Credit Card Number: " + crc_num);
		System.out.println("Holder Name: " + crc_holder_name);
		System.out.println("Expiry Date: " + expiry_date);
		System.out.println("CVV Number: " + cvv_num);
		System.out.println("Credit Card Limit: " + crc_limit);
	}

	public static void main(String[] args) {
		BOFAUnlimitedCashRewardsCard card1 = new BOFAUnlimitedCashRewardsCard(968541231456l, "Rajesh", "12-09-2035", 568, 50000.0d);
		BOFAUnlimitedCashRewardsCard card2 = new BOFAUnlimitedCashRewardsCard(995688741125l, "Ramesh", "12-09-2036", 589, 60000.0d);
		BOFAUnlimitedCashRewardsCard card3 = new BOFAUnlimitedCashRewardsCard(968541231456l, "Umesh", "12-09-2037", 658, 70000.0d);
		BOFAUnlimitedCashRewardsCard card4 = new BOFAUnlimitedCashRewardsCard(968541231456l, "Rupesh", "12-09-2038", 235, 80000.0d);
		
		card1.displayCRCDetails();
		card2.displayCRCDetails();
		card3.displayCRCDetails();
		card4.displayCRCDetails();
	}

}
