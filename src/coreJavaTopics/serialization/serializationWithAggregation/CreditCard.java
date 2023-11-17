package coreJavaTopics.serialization.serializationWithAggregation;

import java.io.Serializable;

public class CreditCard implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long cc_number;
	private String cc_holder_name;
	private String expiry_date;
	private int cvv_number;
	private int pin_number;
	private double creditCard_limit;
	
	private CustomerAddress customerAddress;

	public CreditCard(long cc_number, String cc_holder_name, String expiry_date, int cvv_number, int pin_number,
			double creditCard_limit, CustomerAddress customerAddress) {
		super();
		this.cc_number = cc_number;
		this.cc_holder_name = cc_holder_name;
		this.expiry_date = expiry_date;
		this.cvv_number = cvv_number;
		this.pin_number = pin_number;
		this.creditCard_limit = creditCard_limit;
		this.customerAddress = customerAddress;
	}

	public long getCc_number() {
		return cc_number;
	}

	public void setCc_number(long cc_number) {
		this.cc_number = cc_number;
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

	public int getCvv_number() {
		return cvv_number;
	}

	public void setCvv_number(int cvv_number) {
		this.cvv_number = cvv_number;
	}

	public int getPin_number() {
		return pin_number;
	}

	public void setPin_number(int pin_number) {
		this.pin_number = pin_number;
	}

	public double getCreditCard_limit() {
		return creditCard_limit;
	}

	public void setCreditCard_limit(double creditCard_limit) {
		this.creditCard_limit = creditCard_limit;
	}

	public CustomerAddress getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(CustomerAddress customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "CreditCard [cc_number=" + cc_number + ", cc_holder_name=" + cc_holder_name + ", expiry_date="
				+ expiry_date + ", cvv_number=" + cvv_number + ", pin_number=" + pin_number + ", creditCard_limit="
				+ creditCard_limit + ", customerAddress=" + customerAddress + "]";
	}
	
	
}
