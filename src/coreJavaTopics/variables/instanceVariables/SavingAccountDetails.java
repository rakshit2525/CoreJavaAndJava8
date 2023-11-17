package coreJavaTopics.variables.instanceVariables;

public class SavingAccountDetails {

	public static void main(String[] args) {
		
		//create the object of Saving Account Class
		//Syntax to create the object using new keyword - 
		//Class_name object_name = new Class_name();
		
		SavingAccount account1 = new SavingAccount();
		SavingAccount account2 = new SavingAccount();
		SavingAccount account3 = new SavingAccount();
		
		//use setter method to initialize the object and variable
		account1.setAcc_no(12345);
		account1.setBranch("Bengaluru Branch");
		account1.setAcc_holder_name("Rajesh");
		account1.setAvail_balance(15000);
		
		account2.setAcc_no(123456);
		account2.setBranch("Mysore Branch");
		account2.setAcc_holder_name("Mahesh");
		account2.setAvail_balance(20000);
		
		account3.setAcc_no(1234567);
		account3.setBranch("Bellary Branch");
		account3.setAcc_holder_name("Umesh");
		account3.setAvail_balance(25000);
		
		
		//use getter methods to get the object/variable values
		System.out.println("------------------ Account 1 Details-----------------------------");
		System.out.println("Account Number: " + account1.getAcc_no());
		System.out.println("Branch Name: " + account1.getBranch());
		System.out.println("Customer Name: " + account1.getAcc_holder_name());
		System.out.println("Available Balance: " + account1.getAvail_balance());
		
		System.out.println("------------------ Account 2 Details-----------------------------");
		System.out.println("Account Number: " + account2.getAcc_no());
		System.out.println("Branch Name: " + account2.getBranch());
		System.out.println("Customer Name: " + account2.getAcc_holder_name());
		System.out.println("Available Balance: " + account2.getAvail_balance());
		
		System.out.println("------------------ Account 3 Details-----------------------------");
		System.out.println("Account Number: " + account3.getAcc_no());
		System.out.println("Branch Name: " + account3.getBranch());
		System.out.println("Customer Name: " + account3.getAcc_holder_name());
		System.out.println("Available Balance: " + account3.getAvail_balance());
	}

}
