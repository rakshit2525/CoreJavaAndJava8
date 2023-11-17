package java8Topics.staticAndDefault.realtimeExample;

public class CitiBank implements IFederalReserveService{

	@Override
	public void getWithdrawlDetails() {
		System.out.println("This is Citi Bank withdrawl details");
	}
	
	public void linkSSN() {
		System.out.println("This is specific implementation of Link SSN method of Citi Bank");
		System.out.println("Credit Card Number: 85749632100");
		System.out.println("Account Holder Name: Jason Roy");
		System.out.println("City: California");
	}
	
}
