package coreJavaTopics.polymorphism.runtimePolymorphism.methodOverriding.realtimeExample;

public class CreditCardDetails {

	public static void main(String[] args) {
		
		BOFATravelRewardsForStudentsCreditCard travel = new BOFATravelRewardsForStudentsCreditCard();
		TravelMoreWorldEliteMasterCard master = new TravelMoreWorldEliteMasterCard();
		
		travel.getCCDetails();
		System.out.println("");
		master.getCCDetails();
	}
}
