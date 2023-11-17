package coreJavaTopics.collection_framework.listInterface.arrayList.actualAssignmentSolution;

import java.util.ArrayList;


public class TransactionViewDetail {
    
    public static void main(String[] args) {
    	
        ArrayList<TransactionStatements> statement = new ArrayList<>();

		statement.add(new TransactionStatements(6358415l, "Debited", "12-10-2023", 500.0d));
		statement.add(new TransactionStatements(2541589l, "Credited", "12-10-2023", 1500.0d));
		statement.add(new TransactionStatements(2569842l, "Debited", "12-10-2023", 605.0d));
		statement.add(new TransactionStatements(2159458l, "Debited", "12-10-2023", 55.0d));
		statement.add(new TransactionStatements(6358415l, "Credited", "12-10-2023", 5000.0d));
		
		 for(TransactionStatements details : statement) { 
			 System.out.println(details);
		 }
    }



}
