package coreJavaTopics.objectInJava.objectCreation.usingNewInstanceofConstructorClass;

public class BusinessAdvantageFundamentalAccount {

	//declare instance variables
	private long bfa_acc_num;
	private String bfa_customer_name;
	private String branch_name;
	private String city;
	private double bfa_acc_bal;
	private long ssn_number;
	
	//setter method is to set the value of an object
	//getter method is to get the value of an object
	public long getSsn_number() {
		return ssn_number;
	}
	public void setSsn_number(long ssn_number) {
		this.ssn_number = ssn_number;
	}
	public long getBfa_acc_num() {
		return bfa_acc_num;
	}
	public void setBfa_acc_num(long bfa_acc_num) {
		this.bfa_acc_num = bfa_acc_num;
	}
	public String getBfa_customer_name() {
		return bfa_customer_name;
	}
	public void setBfa_customer_name(String bfa_customer_name) {
		this.bfa_customer_name = bfa_customer_name;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getBfa_acc_bal() {
		return bfa_acc_bal;
	}
	public void setBfa_acc_bal(double bfa_acc_bal) {
		this.bfa_acc_bal = bfa_acc_bal;
	}
}
