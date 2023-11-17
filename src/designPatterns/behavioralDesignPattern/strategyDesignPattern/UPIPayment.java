package designPatterns.behavioralDesignPattern.strategyDesignPattern;

public class UPIPayment implements PaymentMethod{

	private long upiNumber;
	
	public UPIPayment(long upiNumber) {
		super();
		this.upiNumber = upiNumber;
	}

	@Override
	public void makePayment(double amount) {
		System.out.println(amount + "/- successfully payed through UPI");
	}

	
}
