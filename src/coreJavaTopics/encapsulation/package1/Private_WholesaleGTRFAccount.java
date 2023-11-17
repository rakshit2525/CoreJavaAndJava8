// ---- this is for PRIVATE access modifier -----

package coreJavaTopics.encapsulation.package1;

public class Private_WholesaleGTRFAccount {
	
	private long gtrf_acc_num = 9986524564l;
	private String branch = "HDFC branch";
	private String gtrf_acc_holder_name = "Rajesh";
	private String city = "Mysore";
	private String state = "Karnataka";
	private double gtrf_balance = 50000.0d;
	
	private void displayGTRFInfo() {
		System.out.println("GTRF Account Number: " + gtrf_acc_num);
		System.out.println("Customer Name: " + gtrf_acc_holder_name);
		System.out.println("Branch: " + branch);
		System.out.println("City: " + city);
		System.out.println("State: " + state);
		System.out.println("GTRF Balance: " + gtrf_balance);
	}
	
	
	
	public static void main(String[] args) {
		Private_WholesaleGTRFAccount account = new Private_WholesaleGTRFAccount();
		//since the below method is declared private it can be accessed only in it's class
		account.displayGTRFInfo();
	}
}
	
