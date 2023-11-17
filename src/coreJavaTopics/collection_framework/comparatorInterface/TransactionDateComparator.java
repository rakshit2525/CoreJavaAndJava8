package coreJavaTopics.collection_framework.comparatorInterface;

import java.util.Comparator;

public class TransactionDateComparator implements Comparator<Transaction>{
	
	@Override
	public int compare(Transaction trans1, Transaction trans2) {
		return trans1.trans_date.compareTo(trans2.trans_date);
	}
	
}
