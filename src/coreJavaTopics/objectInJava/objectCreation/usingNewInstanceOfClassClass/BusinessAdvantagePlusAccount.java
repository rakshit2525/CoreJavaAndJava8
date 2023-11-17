package coreJavaTopics.objectInJava.objectCreation.usingNewInstanceOfClassClass;

public class BusinessAdvantagePlusAccount {
	
	long bapa_acc_num = 456789;
	String bapa_cust_name = "Ramanathan";
	String bapa_branch_name = "HDFC Branch";
	String city = "Bengaluru";
	String ifsc_code = "KA0520BA";
	double bapa_acc_balance = 50000.0d;
	
	public static void main(String[] args) {
		
		try {
			BusinessAdvantagePlusAccount account = BusinessAdvantagePlusAccount.class.newInstance();
			System.out.println("Account Number: " + account.bapa_acc_num);
			System.out.println("Customer Name: " + account.bapa_cust_name);;
			System.out.println("Branch Name: " + account.bapa_branch_name);
			System.out.println("City: " + account.city);
			System.out.println("IFSC Code: " + account.ifsc_code);
			System.out.println("Available Balance: " + account.bapa_acc_balance);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
