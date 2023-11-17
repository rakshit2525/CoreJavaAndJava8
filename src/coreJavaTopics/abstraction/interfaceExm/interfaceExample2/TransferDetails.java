package coreJavaTopics.abstraction.interfaceExm.interfaceExample2;

public class TransferDetails implements IVisaCardPay{

	@Override
	public void transferWithinBank() {
		System.out.println("This is Transfer within Bank");
	}

	@Override
	public void impsTransfer() {
		System.out.println("This is IMPS Transfer");
	}

	@Override
	public void neftTransfer() {
		System.out.println("This is NEFT Transfer");
	}

	@Override
	public void cardPay() {
		System.out.println("This is Visa Card Pay");
	}
	
	public static void main(String[] args) {
		TransferDetails details = new TransferDetails();
		
		details.transferWithinBank();
		details.impsTransfer();
		details.neftTransfer();
		details.cardPay();
	}
}
