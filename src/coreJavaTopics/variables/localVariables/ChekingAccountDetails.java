package coreJavaTopics.variables.localVariables;

public class ChekingAccountDetails {

	public static void main(String[] args) {

		//creating the object of class CheckingAccount
		//Syntax to create the object using new keyword - 
		//Class_name object_name = new Class_name();
		
		CheckingAccount account1 = new CheckingAccount();
		CheckingAccount account2 = new CheckingAccount();
		CheckingAccount account3 = new CheckingAccount();
		
		account1.setCa_acc_number(1234);
		account1.setCa_acc_holder_name("Rajesh");
		account1.setSsn_number(001);
		account1.setBrnach_name("SBI Branch");
		account1.setStreet_name("Kormangala");
		account1.setCity("Bengaluru");
		account1.setCa_acc_balance(30000.0d);
		
		account2.setCa_acc_number(12345);
		account2.setCa_acc_holder_name("Mahesh");
		account2.setSsn_number(002);
		account2.setBrnach_name("HDFC Branch");
		account2.setStreet_name("Hootgalli");
		account2.setCity("Mysore");
		account2.setCa_acc_balance(50000.0d);
		
		account3.setCa_acc_number(123456);
		account3.setCa_acc_holder_name("Umesh");
		account3.setSsn_number(003);
		account3.setBrnach_name("naralary Branch");
		account3.setStreet_name("SP Road");
		account3.setCity("Bellary");
		account3.setCa_acc_balance(70000.0d);
		
		System.out.println("------------------ Account 1 Details-----------------------------");
		System.out.println("Account Number: " + account1.getCa_acc_number());
		System.out.println("SSN Number: " + account1.getSsn_number());
		System.out.println("Customer Name: " + account1.getCa_acc_holder_name());
		System.out.println("Branch Name: " + account1.getBrnach_name());
		System.out.println("City: " + account1.getCity());
		System.out.println("Street Name: " + account1.getStreet_name());
		System.out.println("Current Balance before deposit: " + account1.getCa_acc_balance());
		//calling the depositAmount method using account1 object
		account1.depositAmount(5000.0d);
		
		System.out.println("------------------ Account 2 Details-----------------------------");
		System.out.println("Account Number: " + account2.getCa_acc_number());
		System.out.println("SSN Number: " + account2.getSsn_number());
		System.out.println("Customer Name: " + account2.getCa_acc_holder_name());
		System.out.println("Branch Name: " + account2.getBrnach_name());
		System.out.println("City: " + account2.getCity());
		System.out.println("Street Name: " + account2.getStreet_name());
		System.out.println("Current Balance before deposit: " + account2.getCa_acc_balance());
		//calling the withdrawAmount method using account1 object
		account2.withdrawAmount(15000.0d);
		
		System.out.println("------------------ Account 3 Details-----------------------------");
		System.out.println("Account Number: " + account3.getCa_acc_number());
		System.out.println("SSN Number: " + account3.getSsn_number());
		System.out.println("Customer Name: " + account3.getCa_acc_holder_name());
		System.out.println("Branch Name: " + account3.getBrnach_name());
		System.out.println("City: " + account3.getCity());
		System.out.println("Street Name: " + account3.getStreet_name());
		System.out.println("Current Balance before deposit: " + account3.getCa_acc_balance());
		//calling the depositAmount method using account1 object
		account3.depositAmount(10000.0d);
	}

}
