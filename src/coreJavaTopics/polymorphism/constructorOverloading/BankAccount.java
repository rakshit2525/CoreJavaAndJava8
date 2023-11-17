package coreJavaTopics.polymorphism.constructorOverloading;

public class BankAccount {
	
	long acc_num;
	String cust_name;
	String branch;
	String city;
	
	public BankAccount() {
		super();
		System.out.println("This is Default Constructor");
	}

	public BankAccount(long acc_num, String cust_name, String branch, String city) {
		super();
		this.acc_num = acc_num;
		this.cust_name = cust_name;
		this.branch = branch;
		this.city = city;
	}

	public void accountDetails() {
		System.out.println("Account Number: " + acc_num);
		System.out.println("Account Holder Name: " + cust_name);
		System.out.println("Branch: " + branch);
		System.out.println("City: " + city);
	}	
	
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		System.out.println("");

		BankAccount profile = new BankAccount(9965328745l, "Rohit", "EPIP Branch", "Bengaluru");
		profile.accountDetails();
	}
}
