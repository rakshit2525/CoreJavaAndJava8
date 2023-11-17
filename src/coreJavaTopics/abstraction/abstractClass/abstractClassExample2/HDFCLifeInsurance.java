package coreJavaTopics.abstraction.abstractClass.abstractClassExample2;

public class HDFCLifeInsurance extends PolicyBazaar{

	@Override
	public void getServiceProviderDetails() {
		System.out.println("Insurance Provider: HDFC Life Insurance" );
		System.out.println("Life Cover: 3Cr");
		System.out.println("Cover Till Age: 60Yrs");
		System.out.println("Claim Settled: 99.4%");
		System.out.println("EMI Premium: 2790/-");
	}

}
