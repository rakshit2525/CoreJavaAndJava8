package coreJavaTopics.inheritance.hierarchicalInheritance;

public class HealthInsurance extends Insurance{

	private String provider_name;
	private long cover_amount;
	private int cashless_hospitals;
	
	public String getProvider_name() {
		return provider_name;
	}
	public void setProvider_name(String provider_name) {
		this.provider_name = provider_name;
	}
	public long getCover_amount() {
		return cover_amount;
	}
	public void setCover_amount(long cover_amount) {
		this.cover_amount = cover_amount;
	}
	public int getCashless_hospitals() {
		return cashless_hospitals;
	}
	public void setCashless_hospitals(int cashless_hospitals) {
		this.cashless_hospitals = cashless_hospitals;
	}
	
	public void displayHealthInsuranceDetails() {
		super.displayInsuranceInfo();
		System.out.println("--------------- Health Insurance ------------------");
		System.out.println("Provider Name: " + provider_name);
		System.out.println("Cover Amount: " + cover_amount);
		System.out.println("Casshless Hospitals: " + cashless_hospitals);
	}
}
