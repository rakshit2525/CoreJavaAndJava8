package coreJavaTopics.collection_framework.comparatorInterface;

//comparator interface cannot be implemented here because it takes multiple data member to compare
//also if we want to compare multiple data members it isn't possible if we implement Comparator here
//hence for every data member that we want to implement we create a separate class for it and implement Comparator interface to it
public class Transaction {

	long trans_id;
	String trans_desc;
	String trans_date;
	double trans_amount;
	
	public Transaction(long trans_id, String trans_desc, String trans_date, double trans_amount) {
		super();
		this.trans_id = trans_id;
		this.trans_desc = trans_desc;
		this.trans_date = trans_date;
		this.trans_amount = trans_amount;
	}

	@Override
	public String toString() {
		return "Transaction [trans_id=" + trans_id + ", trans_desc=" + trans_desc + ", trans_date=" + trans_date
				+ ", trans_amount=" + trans_amount + "]";
	}
	
}
