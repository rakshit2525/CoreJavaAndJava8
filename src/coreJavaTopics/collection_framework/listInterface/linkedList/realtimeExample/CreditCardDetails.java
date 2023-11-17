package coreJavaTopics.collection_framework.listInterface.linkedList.realtimeExample;

import java.util.LinkedList;

public class CreditCardDetails {

	public static void main(String[] args) {

		LinkedList<CreditCards> creditCards = new LinkedList<CreditCards>();
		creditCards.add(new CreditCards(9652345845l, "Ramesh", "ICICI Bank", 568, 4568, 50000.0d));
		creditCards.add(new CreditCards(4586645313l, "Umesh", "HDFC Bank", 635, 1254, 100000.0d));
		creditCards.add(new CreditCards(5468313835l, "Mahesh", "SBI Bank", 965, 7895, 500000.0d));
		creditCards.add(new CreditCards(4684321354l, "Santosh", "Syndicate Bank", 235, 1235, 25000.0d));
		creditCards.add(new CreditCards(4589813513l, "John", "Canara Bank", 489, 5687, 100000.0d));
		
		for (CreditCards cards: creditCards) {
			System.out.println(cards);
		}
	}

}
