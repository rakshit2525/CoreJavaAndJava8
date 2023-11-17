package java8Topics.lambdaExpressions.singleParameter;

public class PaymentDetails {

	public static void main(String[] args) {
		
		//without lambda expression
		IPaymentService service = new IPaymentService() {
			@Override
			public void makePayment(double amount) {
				System.out.println("Transfer Account: 598632417858");
				System.out.println("Amount Transferred: " + amount);
			}
		};
		service.makePayment(10000.0d);
		System.out.println("");
		System.out.println("---------------------------------------------");
		System.out.println("");
		
		//with lambda expression
		IPaymentService service1 = (amount) -> {
			System.out.println("Transfer Account: 852369741258");
			System.out.println("Amount Transferred: " + amount);
		};
		service1.makePayment(15000.0d);
	}
}
