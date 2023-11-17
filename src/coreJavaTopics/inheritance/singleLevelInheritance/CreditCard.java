package coreJavaTopics.inheritance.singleLevelInheritance;

public class CreditCard {

	private long cc_num;
	private String cc_holder_name;
	private String expiry_date;
	private double cc_limit;
	private int cvv_num;
	private int pin_num;
	
	public long getCc_num() {
		return cc_num;
	}
	public void setCc_num(long cc_num) {
		this.cc_num = cc_num;
	}
	public String getCc_holder_name() {
		return cc_holder_name;
	}
	public void setCc_holder_name(String cc_holder_name) {
		this.cc_holder_name = cc_holder_name;
	}
	public String getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}
	public double getCc_limit() {
		return cc_limit;
	}
	public void setCc_limit(double cc_limit) {
		this.cc_limit = cc_limit;
	}
	public int getCvv_num() {
		return cvv_num;
	}
	public void setCvv_num(int cvv_num) {
		this.cvv_num = cvv_num;
	}
	public int getPin_num() {
		return pin_num;
	}
	public void setPin_num(int pin_num) {
		this.pin_num = pin_num;
	}
	
}
