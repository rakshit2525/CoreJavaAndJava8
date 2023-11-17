package coreJavaTopics.collection_framework.listInterface.linkedList.realtimeExample;

public class CreditCards {

	private long cc_num;
	private String card_holder_name;
	private String bank_name;
	private int cvv_num;
	private int pin_num;
	private double cc_limit;
	
	public CreditCards(long cc_num, String card_holder_name, String bank_name, int cvv_num, int pin_num,
			double cc_limit) {
		super();
		this.cc_num = cc_num;
		this.card_holder_name = card_holder_name;
		this.bank_name = bank_name;
		this.cvv_num = cvv_num;
		this.pin_num = pin_num;
		this.cc_limit = cc_limit;
	}

	@Override
	public String toString() {
		return "CreditCards [cc_num=" + cc_num + ", card_holder_name=" + card_holder_name + ", bank_name=" + bank_name
				+ ", cvv_num=" + cvv_num + ", pin_num=" + pin_num + ", cc_limit=" + cc_limit + "]";
	}
	
}
