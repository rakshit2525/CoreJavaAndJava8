package coreJavaTopics.inheritance.singleLevelInheritance;

public class CreditCardApp {

	public static void main(String[] args) {
		
		AxisBankVistaraInfiniteCreditCard creditCard = new AxisBankVistaraInfiniteCreditCard();
		
		creditCard.setCc_num(998566452231l);
		creditCard.setCc_holder_name("Ramesh");
		creditCard.setCc_limit(50000.0d);
		creditCard.setExpiry_date("15-09-2036");
		creditCard.setCvv_num(556);
		creditCard.setPin_num(5587);
		creditCard.setClub_vistara_point("100 Points");
		creditCard.setSpecial_service("No Service or annual charge");
		creditCard.setTop_features("You can use in lounge");
		
		System.out.println("--------------------- Credit Card Details ------------------");
		System.out.println("Credit Card Number: " + creditCard.getCc_num());
		System.out.println("Credit Card Holder Name: "  + creditCard.getCc_holder_name());
		System.out.println("Credit Card Limit: " + creditCard.getCc_limit());
		System.out.println("Credit Card Expiry Date: " + creditCard.getExpiry_date());
		System.out.println("Credit Card CVV Number: " + creditCard.getCvv_num());
		System.out.println("Credit Card PIN Number: " + creditCard.getPin_num());
		System.out.println("Club Vistara points: " + creditCard.getClub_vistara_point());
		System.out.println("Special Services: " + creditCard.getSpecial_service());
		System.out.println("Top Features: " + creditCard.getTop_features());
	}
}
