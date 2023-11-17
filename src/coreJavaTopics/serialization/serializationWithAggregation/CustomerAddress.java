package coreJavaTopics.serialization.serializationWithAggregation;

import java.io.Serializable;

//public class CustomerAddress {
public class CustomerAddress implements Serializable{

	private String customer_name;
	private String address_line1;
	private String address_line2;
	private String city;
	private String state;
	private long zipCode;
	private String panCard;
	private String email_address;
	
	public CustomerAddress(String customer_name, String address_line1, String address_line2, String city, String state,
			long zipCode, String panCard, String email_address) {
		super();
		this.customer_name = customer_name;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.panCard = panCard;
		this.email_address = email_address;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
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

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	@Override
	public String toString() {
		return "CustomerAddress [customer_name=" + customer_name + ", address_line1=" + address_line1
				+ ", address_line2=" + address_line2 + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode
				+ ", panCard=" + panCard + ", email_address=" + email_address + "]";
	}
	
	
}
