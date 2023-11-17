package coreJavaTopics.objectInJava.objectCreation.usingCloneMethodOfObjectClass;

public class BusinessAdvantageRelationshipAccount implements Cloneable{

	private long bara_acc_num;
	private String bara_cust_name;
	private double business_loan_amount;
	private double rate_of_interest;
	private int tenure;
	private String disbursal_date;
	private double emi_amount;
	
	
	public long getBara_acc_num() {
		return bara_acc_num;
	}
	public void setBara_acc_num(long bara_acc_num) {
		this.bara_acc_num = bara_acc_num;
	}
	public String getBara_cust_name() {
		return bara_cust_name;
	}
	public void setBara_cust_name(String bara_cust_name) {
		this.bara_cust_name = bara_cust_name;
	}
	public double getBusiness_loan_amount() {
		return business_loan_amount;
	}
	public void setBusiness_loan_amount(double business_loan_amount) {
		this.business_loan_amount = business_loan_amount;
	}
	public double getRate_of_interest() {
		return rate_of_interest;
	}
	public void setRate_of_interest(double rate_of_interest) {
		this.rate_of_interest = rate_of_interest;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public String getDisbursal_date() {
		return disbursal_date;
	}
	public void setDisbursal_date(String disbursal_date) {
		this.disbursal_date = disbursal_date;
	}
	public double getEmi_amount() {
		return emi_amount;
	}
	public void setEmi_amount(double emi_amount) {
		this.emi_amount = emi_amount;
	}
	
	//overriding clone method
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
