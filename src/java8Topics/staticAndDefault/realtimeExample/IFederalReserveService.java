package java8Topics.staticAndDefault.realtimeExample;

public interface IFederalReserveService {

	public abstract void getWithdrawlDetails();
	
	default void linkSSN() {
		System.out.println("Please link your SSN to your account");
	}
	
	//new requirement for BofA
	default void linkPAN() {
		System.out.println("Please link your PAN to your account");
	}
	
	public static void getCCDetails() {
		System.out.println("Credit Card Number: 985632147");
		System.out.println("Account Holder Name: John Watson");
		System.out.println("Credit Card Limit: $10000");
	}
}
