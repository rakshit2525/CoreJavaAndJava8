package coreJavaTopics.serialization.transientKeyword;

import java.io.Serializable;

public class FixedTermDepositAccount implements Serializable{

	private static final long serialVersionUID = 1L;

	private long fda_acc_num;
	private String cust_name;
	private String branch_name;
	private transient long ssn_num;
	private String mailing_address;
	private String landmark;
	private String address_line1;
	private String address_line2;
	private transient String city;
	private String state;
	private int fda_tenure;
	private double fda_amount;
	private transient double rate_of_interest;
	
	
	public FixedTermDepositAccount(long fda_acc_num, String cust_name, String branch_name, long ssn_num,
			String mailing_address, String landmark, String address_line1, String address_line2, String city,
			String state, int fda_tenure, double fda_amount, double rate_of_interest) {
		super();
		this.fda_acc_num = fda_acc_num;
		this.cust_name = cust_name;
		this.branch_name = branch_name;
		this.ssn_num = ssn_num;
		this.mailing_address = mailing_address;
		this.landmark = landmark;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.city = city;
		this.state = state;
		this.fda_tenure = fda_tenure;
		this.fda_amount = fda_amount;
		this.rate_of_interest = rate_of_interest;
	}


	public long getFda_acc_num() {
		return fda_acc_num;
	}


	public void setFda_acc_num(long fda_acc_num) {
		this.fda_acc_num = fda_acc_num;
	}


	public String getCust_name() {
		return cust_name;
	}


	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}


	public String getBranch_name() {
		return branch_name;
	}


	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}


	public long getSsn_num() {
		return ssn_num;
	}


	public void setSsn_num(long ssn_num) {
		this.ssn_num = ssn_num;
	}


	public String getMailing_address() {
		return mailing_address;
	}


	public void setMailing_address(String mailing_address) {
		this.mailing_address = mailing_address;
	}


	public String getLandmark() {
		return landmark;
	}


	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}


	public String getAddress_line1() {
		return address_line1;
	}


	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}


	public String getAddress_line2() {
		return address_line2;
	}


	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getFda_tenure() {
		return fda_tenure;
	}


	public void setFda_tenure(int fda_tenure) {
		this.fda_tenure = fda_tenure;
	}


	public double getFda_amount() {
		return fda_amount;
	}


	public void setFda_amount(double fda_amount) {
		this.fda_amount = fda_amount;
	}


	public double getRate_of_interest() {
		return rate_of_interest;
	}


	public void setRate_of_interest(double rate_of_interest) {
		this.rate_of_interest = rate_of_interest;
	}


	@Override
	public String toString() {
		return "FixedTermDepositAccount [fda_acc_num=" + fda_acc_num + ", cust_name=" + cust_name + ", branch_name="
				+ branch_name + ", ssn_num=" + ssn_num + ", mailing_address=" + mailing_address + ", landmark="
				+ landmark + ", address_line1=" + address_line1 + ", address_line2=" + address_line2 + ", city=" + city
				+ ", state=" + state + ", fda_tenure=" + fda_tenure + ", fda_amount=" + fda_amount
				+ ", rate_of_interest=" + rate_of_interest + "]";
	}
	
	
	
}
