package coreJavaTopics.collection_framework.setInterface.hashSet.realtimeExample;

public class Account {

	long acc_num;
	String branch_name;
	String cust_name;
	String ifsc_code;
	double balance;
	
	public Account(long acc_num, String branch_name, String cust_name, String ifsc_code, double balance) {
		super();
		this.acc_num = acc_num;
		this.branch_name = branch_name;
		this.cust_name = cust_name;
		this.ifsc_code = ifsc_code;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [acc_num=" + acc_num + ", branch_name=" + branch_name + ", cust_name=" + cust_name
				+ ", ifsc_code=" + ifsc_code + ", balance=" + balance + "]";
	}
	
}
