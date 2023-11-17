package coreJavaTopics.polymorphism.superKeyword;

public class Pay {

	long payment_ID = 9965474135l;
	String remarks = "Paid 400 for petrol";
	String mode_of_payment = "Phonepe";
	double bill_amt = 400.0d;
	int pin_number = 6658;
	
	
	public Pay() {
		super();
		System.out.println("This is a constructor from Pay class");
		System.out.println("");
	}

	public void method1() {
		System.out.println("This is Pay class method......");
	}
}
