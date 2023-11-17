package coreJavaTopics.collection_framework.mapInterface.hashMap.realtimeExample.example2;

import java.util.Map;

public class Bank {

	String bank_name;
	Map<Long, CreditCardDetails> creditCardMap;
	
	public Bank(String bank_name, Map<Long, CreditCardDetails> creditCardMap) {
		super();
		this.bank_name = bank_name;
		this.creditCardMap = creditCardMap;
	}

	@Override
	public String toString() {
		return "Bank [bank_name=" + bank_name + ", creditCardMap=" + creditCardMap + "]";
	}
	
}
