package coreJavaTopics.objectInJava.objectCreation.usingNewKeyWord;

public class BoAStudentAccountDetails {

	public static void main(String[] args) {

		//syntax to create object using new keyword
		//class_name object = new class_name();
		BoAStudentAccount account1 = new BoAStudentAccount();
		BoAStudentAccount account2 = new BoAStudentAccount();
		BoAStudentAccount account3 = new BoAStudentAccount();
		
		//using setter method to set the values of object/variables
		account1.setStd_acc_num(123456);
		account1.setStd_acc_name("Vinith");
		account1.setStd_branch_name("SBI Branch");
		account1.setCity("Bengaluru");
		account1.setStd_acc_balance(50000.0d);
		account1.setStd_min_acc_balance(5000.0d);
		
		account2.setStd_acc_num(1234567);
		account2.setStd_acc_name("Punith");
		account2.setStd_branch_name("Canara Branch");
		account2.setCity("Mysore");
		account2.setStd_acc_balance(70000.0d);
		account2.setStd_min_acc_balance(2000.0d);
		
		account3.setStd_acc_num(12345678);
		account3.setStd_acc_name("Rinith");
		account3.setStd_branch_name("HDFC Branch");
		account3.setCity("Udupi");
		account3.setStd_acc_balance(35000.0d);
		account3.setStd_min_acc_balance(10000.0d);
		
		System.out.println("------------------ Account 1 Details-----------------------------");
		System.out.println("Account Number: " + account1.getStd_acc_name());
		System.out.println("Student Name: " + account1.getStd_acc_name());
		System.out.println("Branch Name: " + account1.getStd_branch_name());
		System.out.println("City: " + account1.getCity());
		System.out.println("Minimum Balance: " + account1.getStd_min_acc_balance());
		System.out.println("Available Balance: " + account1.getStd_acc_balance());
		
		System.out.println("------------------ Account 2 Details-----------------------------");
		System.out.println("Account Number: " + account2.getStd_acc_name());
		System.out.println("Student Name: " + account2.getStd_acc_name());
		System.out.println("Branch Name: " + account2.getStd_branch_name());
		System.out.println("City: " + account2.getCity());
		System.out.println("Minimum Balance: " + account2.getStd_min_acc_balance());
		System.out.println("Available Balance: " + account2.getStd_acc_balance());
		
		System.out.println("------------------ Account 3 Details-----------------------------");
		System.out.println("Account Number: " + account3.getStd_acc_name());
		System.out.println("Student Name: " + account3.getStd_acc_name());
		System.out.println("Branch Name: " + account3.getStd_branch_name());
		System.out.println("City: " + account3.getCity());
		System.out.println("Minimum Balance: " + account3.getStd_min_acc_balance());
		System.out.println("Available Balance: " + account3.getStd_acc_balance());
	}

}
