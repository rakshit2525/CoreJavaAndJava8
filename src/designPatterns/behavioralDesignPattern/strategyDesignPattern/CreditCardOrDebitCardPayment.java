package designPatterns.behavioralDesignPattern.strategyDesignPattern;

public class CreditCardOrDebitCardPayment implements PaymentMethod{
	
	private long cc_number;
	private String cc_holder_name;
	private String expiry_date;
	private int cvv_num;
	
	public CreditCardOrDebitCardPayment(long cc_number, String cc_holder_name, String expiry_date, int cvv_num) {
		super();
		this.cc_number = cc_number;
		this.cc_holder_name = cc_holder_name;
		this.expiry_date = expiry_date;
		this.cvv_num = cvv_num;
	}

	@Override
	public void makePayment(double amount) {
		System.out.println(amount + "/- successfully debited from your credit card");
	}
}
