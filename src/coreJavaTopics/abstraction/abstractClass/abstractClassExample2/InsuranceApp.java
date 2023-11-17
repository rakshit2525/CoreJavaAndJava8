package coreJavaTopics.abstraction.abstractClass.abstractClassExample2;

public class InsuranceApp {
	
	public static void main(String[] args) {
		PolicyBazaar icici = new ICICIPrudential();
		PolicyBazaar hdfc = new HDFCLifeInsurance();
		PolicyBazaar max = new MaxlifeInsurance();
		
		icici.getServiceProviderDetails();
		System.out.println("---------------------------------------");
		hdfc.getServiceProviderDetails();
		System.out.println("---------------------------------------");
		max.getServiceProviderDetails();
	}
	
}
