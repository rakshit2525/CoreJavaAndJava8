package coreJavaTopics.objectInJava.objectInitialization.usingReferenceVariable;

public class TaxSavingFDAccount {
	
	long tfd_acc_num;
	String tfd_cust_name;
	String ifsc_code;
	String branch_name;
	String city;
	double tfd_amount;
	double roi;
	int tenure;
	
	public static void main(String[] args) {
		
		//here account1 & account2 are the reference variables
		TaxSavingFDAccount account1 = new TaxSavingFDAccount();
		TaxSavingFDAccount account2 = new TaxSavingFDAccount();
		
		account1.tfd_acc_num = 789522123;
		account1.tfd_cust_name = "Ramesh";
		account1.ifsc_code = "KA0012BE";
		account1.branch_name = "HDFC Branch";
		account1.city = "Bengaluru";
		account1.tfd_amount = 500000.0d;
		account1.roi = 6.8d;
		account1.tenure = 5;
		
		account2.tfd_acc_num = 954866124;
		account2.tfd_cust_name = "Umesh";
		account2.ifsc_code = "KA0012MY";
		account2.branch_name = "Canara Branch";
		account2.city = "Mysore";
		account2.tfd_amount = 400000.0d;
		account2.roi = 8.8d;
		account2.tenure = 3;
		
		System.out.println("------------------ Account 1 Details-----------------------------");
		System.out.println("Account Number: " + account1.tfd_acc_num);
		System.out.println("Customer Name: " + account1.tfd_cust_name);
		System.out.println("IFSC Code: " + account1.ifsc_code);
		System.out.println("Branch Name: " + account1.branch_name);
		System.out.println("City: " + account1.city);
		System.out.println("FD Amount: " + account1.tfd_amount);
		System.out.println("Rate of Interest: " + account1.roi);
		System.out.println("Tenure: " + account1.tenure);
		
		System.out.println("------------------ Account 2 Details-----------------------------");
		System.out.println("Account Number: " + account2.tfd_acc_num);
		System.out.println("Customer Name: " + account2.tfd_cust_name);
		System.out.println("IFSC Code: " + account2.ifsc_code);
		System.out.println("Branch Name: " + account2.branch_name);
		System.out.println("City: " + account2.city);
		System.out.println("FD Amount: " + account2.tfd_amount);
		System.out.println("Rate of Interest: " + account2.roi);
		System.out.println("Tenure: " + account2.tenure);
	}
}
