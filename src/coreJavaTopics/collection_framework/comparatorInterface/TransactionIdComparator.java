package coreJavaTopics.collection_framework.comparatorInterface;

import java.util.Comparator;

public class TransactionIdComparator implements Comparator<Transaction>{
	
	@Override
	public int compare(Transaction trans1, Transaction trans2) {
		if (trans1.trans_id > trans2.trans_id)
			return 1;
		else if (trans1.trans_id < trans2.trans_id)
			return -1;
		else
			return 0;
	}

	
}
