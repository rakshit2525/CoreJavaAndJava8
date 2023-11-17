package coreJavaTopics.abstraction.abstractClass.abstractClassExample2;

public class ICICIPrudential extends PolicyBazaar{

	@Override
	public void getServiceProviderDetails() {
		System.out.println("Insurance Provider: ICICI Prudential" );
		System.out.println("Life Cover: 1Cr");
		System.out.println("Cover Till Age: 60Yrs");
		System.out.println("Claim Settled: 97.8%");
		System.out.println("EMI Premium: 2230/-");
	}	
}
