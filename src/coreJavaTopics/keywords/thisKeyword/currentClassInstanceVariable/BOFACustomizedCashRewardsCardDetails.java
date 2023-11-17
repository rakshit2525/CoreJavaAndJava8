package coreJavaTopics.keywords.thisKeyword.currentClassInstanceVariable;

public class BOFACustomizedCashRewardsCardDetails {

	public static void main(String[] args) {
		
		BOFACustomizedCashRewardsCard card1 = new BOFACustomizedCashRewardsCard(998633521145l, "Rajesh", "12-09-2035", 656, 6587, 50000.0d, 25000.0d);
		BOFACustomizedCashRewardsCard card2 = new BOFACustomizedCashRewardsCard(885611425587l, "Ramesh", "12-09-2037", 584, 8547, 75000.0d, 75000.0d);
		BOFACustomizedCashRewardsCard card3 = new BOFACustomizedCashRewardsCard(775899653321l, "Umesh", "12-09-2038", 968, 4521, 100000.0d, 75000.0d);
		BOFACustomizedCashRewardsCard card4 = new BOFACustomizedCashRewardsCard(445899658874l, "Rudresh", "12-09-2033", 354, 6398, 75000.0d, 33000.0d);
		
		card1.displayCCDetails();
		card2.displayCCDetails();
		card3.displayCCDetails();
		card4.displayCCDetails();
	}
}
