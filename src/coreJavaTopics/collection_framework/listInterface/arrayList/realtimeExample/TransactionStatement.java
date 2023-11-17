package coreJavaTopics.collection_framework.listInterface.arrayList.realtimeExample;

public class TransactionStatement {

	private Long transaction_id;
	private String transaction_type;
	private String transaction_date;
	private double transaction_amount;
	
	
	public TransactionStatement(Long transaction_id, String transaction_type, String transaction_date,
			double transaction_amount) {
		super();
		this.transaction_id = transaction_id;
		this.transaction_type = transaction_type;
		this.transaction_date = transaction_date;
		this.transaction_amount = transaction_amount;
	}

	public Long getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(Long transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}

	public String getTransaction_date() {
		return transaction_date;
	}

	public void setTransaction_date(String transaction_date) {
		this.transaction_date = transaction_date;
	}

	public double getTransaction_amount() {
		return transaction_amount;
	}

	public void setTransaction_amount(double transaction_amount) {
		this.transaction_amount = transaction_amount;
	}

	@Override
	public String toString() {
		return "TransactionStatement [transaction_id=" + transaction_id + ", transaction_type=" + transaction_type
				+ ", transaction_date=" + transaction_date + ", transaction_amount=" + transaction_amount + "]";
	}

}
