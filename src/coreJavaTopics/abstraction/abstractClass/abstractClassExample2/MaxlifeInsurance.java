package coreJavaTopics.abstraction.abstractClass.abstractClassExample2;

public class MaxlifeInsurance extends PolicyBazaar{

	@Override
	public void getServiceProviderDetails() {
		System.out.println("Insurance Provider: Maxlife Insurance" );
		System.out.println("Life Cover: 1Cr");
		System.out.println("Cover Till Age: 60Yrs");
		System.out.println("Claim Settled: 99%");
		System.out.println("EMI Premium: 2375/-");
	}

}
