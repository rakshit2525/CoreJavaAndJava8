package coreJavaTopics.classInJava;

public class SafeBalanceAdvantageAccountDetails {

	public static void main(String[] args) {
		
		//create the object of SafeBalanceAdvantageAccount
		//syntax to create the object - 
		//class_name Object_name = new Class_name();
		
		SafeBalanceAdvantageAccount account1 = new SafeBalanceAdvantageAccount();
		SafeBalanceAdvantageAccount account2 = new SafeBalanceAdvantageAccount();
		SafeBalanceAdvantageAccount account3 = new SafeBalanceAdvantageAccount();
		
		//using setter methods to set the values to the object/variable
		account1.setSa_acc_num(12345);
		account1.setSa_account_holder("Rajesh");
		account1.setCity("Bengaluru");
		account1.setIfsc_code("BE001");
		account1.setSa_acc_balance(50000.0d);
		
		account2.setSa_acc_num(123456);
		account2.setSa_account_holder("Ramesh");
		account2.setSsn_num(456);
		account2.setCity("Mysore");
		account2.setIfsc_code("LA001");
		account2.setSa_acc_balance(70000.0d);
		
		account3.setSa_acc_num(1234567);
		account3.setSa_account_holder("Umesh");
		account3.setSsn_num(321);
		account3.setCity("Dharwad");
		account3.setIfsc_code("DH001");
		account3.setSa_acc_balance(35000.0d);
		
		//using getter method to get the object/variable values
		System.out.println("------------------ Account 1 Details-----------------------------");
		System.out.println("Account Number: " + account1.getSa_acc_num());
		System.out.println("Account Holder: " + account1.getSa_account_holder());
		System.out.println("City: " + account1.getCity());
		System.out.println("IFSC Code: " + account1.getIfsc_code());
		System.out.println("SSN Number: " + account1.getSsn_num());
		System.out.println("Available Balance: " + account1.getSa_acc_balance());
		
		System.out.println("------------------ Account 2 Details-----------------------------");
		System.out.println("Account Number: " + account2.getSa_acc_num());
		System.out.println("Account Holder: " + account2.getSa_account_holder());
		System.out.println("City: " + account2.getCity());
		System.out.println("IFSC Code: " + account2.getIfsc_code());
		System.out.println("SSN Number: " + account2.getSsn_num());
		System.out.println("Available Balance: " + account2.getSa_acc_balance());
		
		System.out.println("------------------ Account 3 Details-----------------------------");
		System.out.println("Account Number: " + account3.getSa_acc_num());
		System.out.println("Account Holder: " + account3.getSa_account_holder());
		System.out.println("City: " + account3.getCity());
		System.out.println("IFSC Code: " + account3.getIfsc_code());
		System.out.println("SSN Number: " + account3.getSsn_num());
		System.out.println("Available Balance: " + account3.getSa_acc_balance());
	}

}
