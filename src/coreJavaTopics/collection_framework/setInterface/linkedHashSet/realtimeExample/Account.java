package coreJavaTopics.collection_framework.setInterface.linkedHashSet.realtimeExample;

import java.util.Objects;

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
	public int hashCode() {
		return Objects.hash(acc_num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return acc_num == other.acc_num;
	}

	@Override
	public String toString() {
		return "Account [acc_num=" + acc_num + ", branch_name=" + branch_name + ", cust_name=" + cust_name
				+ ", ifsc_code=" + ifsc_code + ", balance=" + balance + "]";
	}
	
}
