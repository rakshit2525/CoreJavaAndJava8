package coreJavaTopics.collection_framework.comparatorInterface;

import java.util.ArrayList;
import java.util.Collections;

public class DetailsOfTransaction {

	public static void main(String[] args) {

		ArrayList<Transaction> transList = new ArrayList<Transaction>();
		transList.add(new Transaction(550033151l, "Credit", "2023-05-13", 500.0d));
		transList.add(new Transaction(550033159l, "Debit", "2023-08-22", 15000.0d));
		transList.add(new Transaction(550033156l, "Debit", "2022-08-09", 2000.0d));
		transList.add(new Transaction(550033152l, "Cedit", "2022-12-15", 2599.0d));
		transList.add(new Transaction(550033153l, "Debit", "2020-11-06", 5000.0d));
		transList.add(new Transaction(550033155l, "Debit", "2021-01-29", 50.0d));
		transList.add(new Transaction(550033158l, "Credit", "2023-09-13", 6000.0d));
		transList.add(new Transaction(550033154l, "Credit", "2022-03-02", 20000.d));
		transList.add(new Transaction(550033150l, "Debit", "2021-05-22", 9999.0d));
		transList.add(new Transaction(550033157l, "Credit", "2022-10-17", 2500.0d));
		
		/*
		System.out.println("---------------------- Sorting based Transaction ID ------------------------");
		Collections.sort(transList, new TransactionIdComparator());
		for (Transaction trans1 : transList) {
			System.out.println(trans1);
		}
		System.out.println("");
		
		System.out.println("---------------------- Sorting based Transaction Amount ------------------------");
		Collections.sort(transList, new TransactionAmountComparator());
		for (Transaction trans2 : transList) {
			System.out.println(trans2);
		}
		System.out.println("");
		*/
		
		//check for date 
		System.out.println("---------------------- Sorting based Transaction Date ------------------------");
		Collections.sort(transList, new TransactionDateComparator());
		for(Transaction trans3 : transList) {
			System.out.println(trans3);
		}
	}

}
