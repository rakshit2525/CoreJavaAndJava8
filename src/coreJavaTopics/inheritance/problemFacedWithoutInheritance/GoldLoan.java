package coreJavaTopics.inheritance.problemFacedWithoutInheritance;

public class GoldLoan {

	private long loan_number;
	private String applicant_name;
	private String disbursal_date;
	private String mailing_address;
	private double loan_amount;
	private double rate_of_interest;
	private String gold_loan_feature;
	
	public long getLoan_number() {
		return loan_number;
	}
	public void setLoan_number(long loan_number) {
		this.loan_number = loan_number;
	}
	public String getApplicant_name() {
		return applicant_name;
	}
	public void setApplicant_name(String applicant_name) {
		this.applicant_name = applicant_name;
	}
	public String getDisbursal_date() {
		return disbursal_date;
	}
	public void setDisbursal_date(String disbursal_date) {
		this.disbursal_date = disbursal_date;
	}
	public String getMailing_address() {
		return mailing_address;
	}
	public void setMailing_address(String mailing_address) {
		this.mailing_address = mailing_address;
	}
	public double getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(double loan_amount) {
		this.loan_amount = loan_amount;
	}
	public double getRate_of_interest() {
		return rate_of_interest;
	}
	public void setRate_of_interest(double rate_of_interest) {
		this.rate_of_interest = rate_of_interest;
	}
	public String getGold_loan_feature() {
		return gold_loan_feature;
	}
	public void setGold_loan_feature(String gold_loan_feature) {
		this.gold_loan_feature = gold_loan_feature;
	}
	
}
