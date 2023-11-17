//---- this is for PROTECTED access modifier ----

package coreJavaTopics.encapsulation.package1;

public class Protected_RetailCustomerCreditLimit {
	
	protected long cust_serial_num = 5542468l;
	protected int limit_grp_num = 5462;
	protected String limit_type = "Credit Type";
	protected double limit_amt = 100000.0d;
	protected String start_date = "20/09/23";
	protected String cust_name = "Ramesh";
	
	protected void displayCreditLimit() {
		System.out.println("Serial Number: " + cust_serial_num);
		System.out.println("Customer Name: " + cust_name);
		System.out.println("Limit GRP Number: " + limit_grp_num);
		System.out.println("Limit Type: " + limit_type);
		System.out.println("Limit Amount: " + limit_amt);
		System.out.println("Start Date: " + start_date);	
	}
	
	public static void main(String[] args) {
		Protected_RetailCustomerCreditLimit limit = new Protected_RetailCustomerCreditLimit();
		//since the below method is declared protected it can be accessed only in it's class
		limit.displayCreditLimit();
	}
}
