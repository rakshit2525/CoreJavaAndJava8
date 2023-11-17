package coreJavaTopics.collection_framework.listInterface.arrayList.serializationOfArrayListObject;

import java.io.Serializable;

public class TransactionStatement implements Serializable{

	private static final long serialVersionUID = 1L;
	private String date;
	private String narration;
	private long reference_num;
	private String value_date;
	private double deposit_amount;
	
	public TransactionStatement(String date, String narration, long reference_num, String value_date,
			double deposit_amount) {
		super();
		this.date = date;
		this.narration = narration;
		this.reference_num = reference_num;
		this.value_date = value_date;
		this.deposit_amount = deposit_amount;
	}

	@Override
	public String toString() {
		return "TransactionStatement [date=" + date + ", narration=" + narration + ", reference_num=" + reference_num
				+ ", value_date=" + value_date + ", deposit_amount=" + deposit_amount + "]";
	}
	
	
}
