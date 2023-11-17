package coreJavaTopics.objectInJava.objectCreation.usingNewKeyWord;

public class BoAStudentAccount {
	
	//declare instance variables
	private long std_acc_num;
	private String std_acc_name;
	private String std_branch_name;
	private String city;
	private double std_acc_balance;
	private double std_min_acc_balance;
	
	//setter method is to set the value of an object
	//getter method is to get the value of an object
	public long getStd_acc_num() {
		return std_acc_num;
	}
	public void setStd_acc_num(long std_acc_num) {
		this.std_acc_num = std_acc_num;
	}
	public String getStd_acc_name() {
		return std_acc_name;
	}
	public void setStd_acc_name(String std_acc_name) {
		this.std_acc_name = std_acc_name;
	}
	public String getStd_branch_name() {
		return std_branch_name;
	}
	public void setStd_branch_name(String std_branch_name) {
		this.std_branch_name = std_branch_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getStd_acc_balance() {
		return std_acc_balance;
	}
	public void setStd_acc_balance(double std_acc_balance) {
		this.std_acc_balance = std_acc_balance;
	}
	public double getStd_min_acc_balance() {
		return std_min_acc_balance;
	}
	public void setStd_min_acc_balance(double std_min_acc_balance) {
		this.std_min_acc_balance = std_min_acc_balance;
	}
	
}
