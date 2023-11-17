package coreJavaTopics.collection_framework.mapInterface.hashMap.realtimeExample.example2;

public class CreditCardDetails {

	long cc_num;
	String card_name;
	String card_benefits;
	String eligibility;
	double limit;
	
	public CreditCardDetails(long cc_num, String card_name, String card_benefits, String eligibility, double limit) {
		super();
		this.cc_num = cc_num;
		this.card_name = card_name;
		this.card_benefits = card_benefits;
		this.eligibility = eligibility;
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "CreditCardDetails [cc_num=" + cc_num + ", card_name=" + card_name + ", card_benefits=" + card_benefits
				+ ", eligibility=" + eligibility + ", limit=" + limit + "]";
	}
	
}
