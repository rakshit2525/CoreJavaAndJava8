package coreJavaTopics.variables.staticVariables;

public class IndividualRetirementAccount {
	private long ira_acc_num;
	private String ira_acc_holder_name;
	private String street_name;
	private String city;
	private int zipCode;
	private double ira_acc_balance;
	
	//static variable
	public static String BANK_NAME = "Bank Of America";
	
	
	public long getIra_acc_num() {
		return ira_acc_num;
	}
	public void setIra_acc_num(long ira_acc_num) {
		this.ira_acc_num = ira_acc_num;
	}
	public String getIra_acc_holder_name() {
		return ira_acc_holder_name;
	}
	public void setIra_acc_holder_name(String ira_acc_holder_name) {
		this.ira_acc_holder_name = ira_acc_holder_name;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public double getIra_acc_balance() {
		return ira_acc_balance;
	}
	public void setIra_acc_balance(double ira_acc_balance) {
		this.ira_acc_balance = ira_acc_balance;
	}
	
	
}