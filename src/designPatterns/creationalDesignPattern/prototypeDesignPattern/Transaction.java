package designPatterns.creationalDesignPattern.prototypeDesignPattern;

public class Transaction implements Prototype{
	
	private long transaction_id;
	private String transaction_type;
	private double transaction_amount;
	private String transaction_date;
	
	public Transaction(long transaction_id, String transaction_type, double transaction_amount,
			String transaction_date) {
		super();
		this.transaction_id = transaction_id;
		this.transaction_type = transaction_type;
		this.transaction_amount = transaction_amount;
		this.transaction_date = transaction_date;
	}

	@Override
	public String toString() {
		return "Transaction [transaction_id=" + transaction_id + ", transaction_type=" + transaction_type
				+ ", transaction_amount=" + transaction_amount + ", transaction_date=" + transaction_date + "]";
	}
	
	public Prototype clone() {
		return new Transaction(transaction_id, transaction_type, transaction_amount, transaction_date);
	}
}
