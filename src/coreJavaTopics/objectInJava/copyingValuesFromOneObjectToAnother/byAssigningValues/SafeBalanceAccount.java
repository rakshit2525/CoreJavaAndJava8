package coreJavaTopics.objectInJava.copyingValuesFromOneObjectToAnother.byAssigningValues;

public class SafeBalanceAccount {

	long cust_id;
	long sba_acc_num;
	String sba_customer_name;
	String branch_name;
	String city;
	long ssn_num;
	double sba_available_balance;
	
	public SafeBalanceAccount() {}
	
	public SafeBalanceAccount(long cust_id, long sba_acc_num, String sba_customer_name, String branch_name, String city,
			long ssn_num, double sba_available_balance) {
		super();
		this.cust_id = cust_id;
		this.sba_acc_num = sba_acc_num;
		this.sba_customer_name = sba_customer_name;
		this.branch_name = branch_name;
		this.city = city;
		this.ssn_num = ssn_num;
		this.sba_available_balance = sba_available_balance;
	}
	
	public void displaySBAAccountDetails() { 
		System.out.println("--------------------------------- Account Details ------------------------------------------------");
		System.out.println("Customer ID: " + cust_id);
		System.out.println("Account Number: " + sba_acc_num);
		System.out.println("Customer Name: " + sba_customer_name);
		System.out.println("Branch: " + branch_name);
		System.out.println("City: " + city);
		System.out.println("SSN Number: " + ssn_num);
		System.out.println("Balance: " + sba_available_balance);
	}
	
	public static void main(String[] args) {
		
		SafeBalanceAccount account1 = new SafeBalanceAccount(225879, 996322548877l, "Hitesh", "HDFC Branch", "Mysore", 55986011, 50000.0d);
		SafeBalanceAccount account2 = new SafeBalanceAccount();
		
		//copying the values of one object to another object by assigning values 
		account2.sba_acc_num = account1.sba_acc_num;
		account2.cust_id = account1.cust_id;
		account2.sba_customer_name = account1.sba_customer_name;
		account2.branch_name = account1.branch_name;
		account2.city = account1.city;
		account2.ssn_num = account1.ssn_num;
		account2.sba_available_balance = account1.sba_available_balance;	
		
		
		account1.displaySBAAccountDetails();
		System.out.println("// After Copying //");
		account2.displaySBAAccountDetails();
		}
}
