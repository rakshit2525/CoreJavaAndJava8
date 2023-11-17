package coreJavaTopics.serialization.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class PremiumCurrentAccount implements Externalizable{
	
	private long application_number;
	private String application_type;
	private String applicant_name;
	private int age;
	private String address;
	private String city;
	private String panCard;
	private double deposit_amount;
	private long phone_number;
	
	
	public PremiumCurrentAccount() {}

	public PremiumCurrentAccount(long application_number, String application_type, String applicant_name, int age,
			String address, String city, String panCard, double deposit_amount, long phone_number) {
		super();
		this.application_number = application_number;
		this.application_type = application_type;
		this.applicant_name = applicant_name;
		this.age = age;
		this.address = address;
		this.city = city;
		this.panCard = panCard;
		this.deposit_amount = deposit_amount;
		this.phone_number = phone_number;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeLong(application_number);
		out.writeObject(application_type);
		out.writeObject(applicant_name);
		out.writeInt(age);
		out.writeObject(address);
		out.writeObject(city);
		out.writeObject(panCard);
		out.writeDouble(deposit_amount);
		out.writeLong(phone_number);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		application_number = in.readLong();
		application_type = (String) in.readObject();
		applicant_name = (String) in.readObject();
		age = in.readInt();
		address = (String) in.readObject();
		city = (String) in.readObject();
		panCard = (String) in.readObject();
		deposit_amount = in.readDouble();
		phone_number = in.readLong();
	}

	public long getApplication_number() {
		return application_number;
	}

	public void setApplication_number(long application_number) {
		this.application_number = application_number;
	}

	public String getApplication_type() {
		return application_type;
	}

	public void setApplication_type(String application_type) {
		this.application_type = application_type;
	}

	public String getApplicant_name() {
		return applicant_name;
	}

	public void setApplicant_name(String applicant_name) {
		this.applicant_name = applicant_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public double getDeposit_amount() {
		return deposit_amount;
	}

	public void setDeposit_amount(double deposit_amount) {
		this.deposit_amount = deposit_amount;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	@Override
	public String toString() {
		return "PremiumCurrentAccount [application_number=" + application_number + ", application_type="
				+ application_type + ", applicant_name=" + applicant_name + ", age=" + age + ", address=" + address
				+ ", city=" + city + ", panCard=" + panCard + ", deposit_amount=" + deposit_amount + ", phone_number="
				+ phone_number + "]";
	}
	
}
