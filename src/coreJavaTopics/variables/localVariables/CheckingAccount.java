package coreJavaTopics.variables.localVariables;

public class CheckingAccount {
	
	private long ca_acc_number;
	private String ca_acc_holder_name;
	private long ssn_number;
	private String brnach_name;
	private String street_name;
	private String City;
	private double ca_acc_balance;
	
	public long getCa_acc_number() {
		return ca_acc_number;
	}
	public void setCa_acc_number(long ca_acc_number) {
		this.ca_acc_number = ca_acc_number;
	}
	public String getCa_acc_holder_name() {
		return ca_acc_holder_name;
	}
	public void setCa_acc_holder_name(String ca_acc_holder_name) {
		this.ca_acc_holder_name = ca_acc_holder_name;
	}
	public long getSsn_number() {
		return ssn_number;
	}
	public void setSsn_number(long ssn_number) {
		this.ssn_number = ssn_number;
	}
	public String getBrnach_name() {
		return brnach_name;
	}
	public void setBrnach_name(String brnach_name) {
		this.brnach_name = brnach_name;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public double getCa_acc_balance() {
		return ca_acc_balance;
	}
	public void setCa_acc_balance(double ca_acc_balance) {
		this.ca_acc_balance = ca_acc_balance;
	}
	
	//declaring local variables
	public void depositAmount (double deptAmt) {
		double afterDeposit = ca_acc_balance + deptAmt;
		System.out.println("Your Available balance after deposit: " + afterDeposit);
	}
	
	//declaring local variable
	public void withdrawAmount(double withdrawAmt) {
		double afterWithdraw = ca_acc_balance - withdrawAmt;
		System.out.println("Your Available balance after withdraw: " + afterWithdraw);
	}
	
}
