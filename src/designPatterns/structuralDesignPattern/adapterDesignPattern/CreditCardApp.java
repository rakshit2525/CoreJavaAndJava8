package designPatterns.structuralDesignPattern.adapterDesignPattern;

public class CreditCardApp {

	public static void main(String[] args) {
		
		AxisBankCreditCard creditCard = new Customer();
		creditCard.provideCustomerDetails();
		System.out.println(creditCard.issueCreditCard());
	}
}
