package java8Topics.lambdaExpressions.withoutParameter;

public class CreditCardDetails {

	public static void main(String[] args) {
		
		long cc_number = 69856325413l;
		String cc_holder_name = "Ramesh";
		String expiry_date = "29-10-2025";
		double cc_limit = 500000.0d;
		
		//using lambda expression
		ICreditCardService service = () -> {
			System.out.println("Credit Card Number: " + cc_number);
			System.out.println("Credit Card Holder Name: " + cc_holder_name);
			System.out.println("Expiry Date: " + expiry_date);
			System.out.println("Credit Card Limit: " + cc_limit);
		};
		
		service.getCCDetails();
	}

}
