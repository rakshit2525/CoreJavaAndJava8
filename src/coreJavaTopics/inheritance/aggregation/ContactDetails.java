package coreJavaTopics.inheritance.aggregation;

public class ContactDetails {
	
	String customer_name;
	String address;
	String panCard;
	String email;
	String date_of_birth;
	long contact_number;
	String city;
	long zipCode;
	
	public ContactDetails(String customer_name, String address, String panCard, String email, String date_of_birth,
			long contact_number, String city, long zipCode) {
		super();
		this.customer_name = customer_name;
		this.address = address;
		this.panCard = panCard;
		this.email = email;
		this.date_of_birth = date_of_birth;
		this.contact_number = contact_number;
		this.city = city;
		this.zipCode = zipCode;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public long getContact_number() {
		return contact_number;
	}

	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	
	
}
