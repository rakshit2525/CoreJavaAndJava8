package coreJavaTopics.polymorphism.superKeyword;

public class IMPSTransfer extends Pay{

	long imps_id = 55624l;
	String imps_description = "Made an IMPS transfer of 5000/-";
	String date_of_transfer = "25-09-2023";
	double transfer_amount = 5000.0d;
	int otp = 668594;
	int pin_number = 2259;
	
	
	public IMPSTransfer() {
		//the super() here invokes the constructor from immediate parent class
		super();
		System.out.println("This is a constructor from IMPSTransfer class");
		System.out.println("");
	}

	public void method1() {
		System.out.println("This is IMPSTransfer class method......");
	}
	
	public void displayTransfer() {
		System.out.println("IMPS ID: " + imps_id);
		System.out.println("IMPS Description: " + imps_description);
		System.out.println("Date of Transfer: " + date_of_transfer);
		System.out.println("Transfer Amount: " + transfer_amount);
		System.out.println("OTP Number: " + otp);
		System.out.println("");
		
		System.out.println("-------------- Calling Parent class instance variable using super keyword ---------------");
		
		//this below line is to invoke immediate parent class method using super keyword
		super.method1();
		//these below lines are to invoke immediate parent class instance variables using super keyword
		System.out.println("Payment ID: " + super.payment_ID);
		System.out.println("Remarks: " + super.remarks);
		System.out.println("Mode of Payment: " + super.mode_of_payment);
		System.out.println("Bill Amount: " + super.bill_amt);
		System.out.println("PIN Number: " + super.pin_number);
	}
	
	public static void main(String[] args) {
		
		IMPSTransfer transfer = new IMPSTransfer();
		transfer.displayTransfer();
	}
}
