package coreJavaTopics.constructorInJava.defaultConstructor;

public class CertificateOfDepositAccount {
	
	long cda_acc_num;
	String cda_cust_name;
	String branch_name;
	String city;
	double cda_balance;
	
	public void displayCDAInfo() {
		System.out.println("Account Number: " + cda_acc_num);
		System.out.println("Customer Name: " + cda_cust_name);
		System.out.println("Branch Name: " + branch_name);
		System.out.println("City: " + city);
		System.out.println("Available Balance: " + cda_balance);
	}
	
	public static void main(String[] args) {
		CertificateOfDepositAccount account1 = new CertificateOfDepositAccount();
		account1.displayCDAInfo();
	}

}
