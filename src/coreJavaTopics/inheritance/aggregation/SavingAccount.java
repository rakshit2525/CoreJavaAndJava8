package coreJavaTopics.inheritance.aggregation;

public class SavingAccount {
	
	long acc_num;
	String branch;
	String name;
	double available_balance;
	
	ContactDetails contactDetails;

	public SavingAccount(long acc_num, String branch, String name, double available_balance,
			ContactDetails contactDetails) {
		super();
		this.acc_num = acc_num;
		this.branch = branch;
		this.name = name;
		this.available_balance = available_balance;
		this.contactDetails = contactDetails;
	}
	
	public void displayProfileDetails() {
		System.out.println("-------------------- Account details -------------------");
		System.out.println("Account number: " + acc_num);
		System.out.println("Branch: " + branch);
		System.out.println("Name: " + name);
		System.out.println("Available balance: " + available_balance);
		System.out.println("-------------- Profile details --------------------");
		System.out.println("Customer Name: " + contactDetails.getCustomer_name());
		System.out.println("Address: " + contactDetails.getAddress());
		System.out.println("Pan Card: " + contactDetails.getPanCard());
		System.out.println("Zip Code: " + contactDetails.getZipCode());
		System.out.println("Email: " + contactDetails.getEmail());
		System.out.println("Date of birth: " + contactDetails.getDate_of_birth());
		System.out.println("City: " + contactDetails.getCity());
		System.out.println("Contact Number: " + contactDetails.getContact_number());
		
	}
}
