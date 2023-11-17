package coreJavaTopics.collection_framework.listInterface.arrayList.realtimeExample;

import java.util.ArrayList;

public class TransactionViewDetails {

	public static void main(String[] args) {
	
		ArrayList<TransactionStatement> statement = new ArrayList<TransactionStatement>();
		statement.add(new TransactionStatement(6358415l, "Debited", "12-10-2023", 500.0d));
		statement.add(new TransactionStatement(2541589l, "Credited", "12-10-2023", 1500.0d));
		statement.add(new TransactionStatement(2569842l, "Debited", "12-10-2023", 605.0d));
		statement.add(new TransactionStatement(2159458l, "Debited", "12-10-2023", 55.0d));
		statement.add(new TransactionStatement(6358415l, "Credited", "12-10-2023", 5000.0d));
		
		 for(TransactionStatement details : statement) { 
			 System.out.println(details);
		 }
	}
}
