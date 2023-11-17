package java8Topics.predefinedFunctionalInterfaces.supplierInterface;

public class Transaction {

	private long trans_id;
	private String trans_type;
	private String trans_desc;
	private double trans_amount;
	
	public Transaction(long trans_id, String trans_type, String trans_desc, double trans_amount) {
		super();
		this.trans_id = trans_id;
		this.trans_type = trans_type;
		this.trans_desc = trans_desc;
		this.trans_amount = trans_amount;
	}

	public long getTrans_id() {
		return trans_id;
	}

	public void setTrans_id(long trans_id) {
		this.trans_id = trans_id;
	}

	public String getTrans_type() {
		return trans_type;
	}

	public void setTrans_type(String trans_type) {
		this.trans_type = trans_type;
	}

	public String getTrans_desc() {
		return trans_desc;
	}

	public void setTrans_desc(String trans_desc) {
		this.trans_desc = trans_desc;
	}

	public double getTrans_amount() {
		return trans_amount;
	}

	public void setTrans_amount(double trans_amount) {
		this.trans_amount = trans_amount;
	}

	@Override
	public String toString() {
		return "Transaction [trans_id=" + trans_id + ", trans_type=" + trans_type + ", trans_desc=" + trans_desc
				+ ", trans_amount=" + trans_amount + "]";
	}
	
}
