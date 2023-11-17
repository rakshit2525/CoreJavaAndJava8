package coreJavaTopics.inheritance.hierarchicalInheritance;

public class InsuranceDetails {

	public static void main(String[] args) {
		HealthInsurance healthInsurance = new HealthInsurance();
		TermLifeInsurance termLifeInsurance = new TermLifeInsurance();
		
		healthInsurance.setInsurance_id(9965841);
		healthInsurance.setInsurance_holder_name("Rajesh");
		healthInsurance.setAge(55);
		healthInsurance.setPurchase_date("16-09-2023");
		healthInsurance.setProvider_name("Care Health insurance");
		healthInsurance.setCashless_hospitals(5);
		healthInsurance.setCover_amount(500000l);
		
		termLifeInsurance.setInsurance_id(8856471569l);
		termLifeInsurance.setInsurance_holder_name("Ramesh");
		termLifeInsurance.setAge(33);
		termLifeInsurance.setPurchase_date("22-09-2023");
		termLifeInsurance.setInsurer_name("ICICI Prudential");
		termLifeInsurance.setCover_till_age(60);
		termLifeInsurance.setClaim_settled(99.7d);
		termLifeInsurance.setLife_cover(5000000l);
		
		healthInsurance.displayHealthInsuranceDetails();
		termLifeInsurance.displayTLIInfo();
	}

}
