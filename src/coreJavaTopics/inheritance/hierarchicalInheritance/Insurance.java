package coreJavaTopics.inheritance.hierarchicalInheritance;

public class Insurance {

	private long insurance_id;
	private String insurance_holder_name;
	private String purchase_date;
	private int age;
	
	public long getInsurance_id() {
		return insurance_id;
	}
	public void setInsurance_id(long insurance_id) {
		this.insurance_id = insurance_id;
	}
	public String getInsurance_holder_name() {
		return insurance_holder_name;
	}
	public void setInsurance_holder_name(String insurance_holder_name) {
		this.insurance_holder_name = insurance_holder_name;
	}
	public String getPurchase_date() {
		return purchase_date;
	}
	public void setPurchase_date(String purchase_date) {
		this.purchase_date = purchase_date;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void displayInsuranceInfo() {
		System.out.println("--------------- Insurance Details --------------------");
		System.out.println("Insurance ID: " + insurance_id);
		System.out.println("Insurance Holder Name: " + insurance_holder_name);
		System.out.println("Purchase Date: " + purchase_date);
		System.out.println("Age: " + age);
	}
}
