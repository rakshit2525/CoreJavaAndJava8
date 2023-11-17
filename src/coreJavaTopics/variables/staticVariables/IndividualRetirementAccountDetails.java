package coreJavaTopics.variables.staticVariables;

public class IndividualRetirementAccountDetails {

	public static void main(String[] args) {
		
		//create objects of IndividualRetirementclass
		//class_name object_name = new Class_name();
		
		IndividualRetirementAccount account1 = new IndividualRetirementAccount();
		IndividualRetirementAccount account2 = new IndividualRetirementAccount();
		IndividualRetirementAccount account3 = new IndividualRetirementAccount();
		
		account1.setCity("Bengaluru");
		account1.setIra_acc_balance(40000.0d);
		account1.setIra_acc_holder_name("Rajesh");
		account1.setIra_acc_num(12345);
		account1.setStreet_name("Koramangala");
		account1.setZipCode(584100);
		
		account2.setCity("Mysore");
		account2.setIra_acc_balance(55000.0d);
		account2.setIra_acc_holder_name("Mahesh");
		account2.setIra_acc_num(123456);
		account2.setStreet_name("Hootgalli");
		account2.setZipCode(584101);
		
		account3.setCity("Hubballi");
		account3.setIra_acc_balance(80000.0d);
		account3.setIra_acc_holder_name("Umesh");
		account3.setIra_acc_num(1234567);
		account3.setStreet_name("Kittur Road");
		account3.setZipCode(584103);
		
		
		System.out.println("------------------ Account 1 Details-----------------------------");
		System.out.println("Account Number: " + account1.getIra_acc_num());
		System.out.println("Account Holder: " + account1.getIra_acc_holder_name());
		System.out.println("City: " + account1.getCity());
		System.out.println("Street Name: " + account1.getStreet_name());
		System.out.println("Zip Code: " + account1.getZipCode());
		System.out.println("Account Balance: " + account1.getIra_acc_balance());
		System.out.println("Bank Name: " + IndividualRetirementAccount.BANK_NAME);
		
		System.out.println("------------------ Account 2 Details-----------------------------");
		System.out.println("Account Number: " + account2.getIra_acc_num());
		System.out.println("Account Holder: " + account2.getIra_acc_holder_name());
		System.out.println("City: " + account2.getCity());
		System.out.println("Street Name: " + account2.getStreet_name());
		System.out.println("Zip Code: " + account2.getZipCode());
		System.out.println("Account Balance: " + account2.getIra_acc_balance());
		System.out.println("Bank Name: " + IndividualRetirementAccount.BANK_NAME);
		
		System.out.println("------------------ Account 3 Details-----------------------------");
		System.out.println("Account Number: " + account3.getIra_acc_num());
		System.out.println("Account Holder: " + account3.getIra_acc_holder_name());
		System.out.println("City: " + account3.getCity());
		System.out.println("Street Name: " + account3.getStreet_name());
		System.out.println("Zip Code: " + account3.getZipCode());
		System.out.println("Account Balance: " + account3.getIra_acc_balance());
		System.out.println("Bank Name: " + IndividualRetirementAccount.BANK_NAME);
	}

}
