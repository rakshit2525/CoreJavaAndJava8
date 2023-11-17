package coreJavaTopics.collection_framework.setInterface.treeSet.realtimeExample;

/*
TreeSet class in Java implements the Set interface that uses a tree for storing elements which contain 
unique objects stored in the ascending order. You may come across an exception called java.lang.ClassCastException 
while working with TreeSet objects. Basically, TreeSet elements are ordered using natural ordering or by using the 
Comparator defined in the constructor. If both don’t happen i.e natural ordering not occurring and also did not provide 
any comparator then java throws an exception which is java.lang.ClassCastException.

We can resolve this exception in two ways:
i. By implementing the Comparable interface
ii. By defining custom Comparator class
*/

public class Account implements Comparable<Account>{

	long acc_num;
	String branch_name;
	String ifsc_num;
	String city;
	double balance;
	
	public Account(long acc_num, String branch_name, String ifsc_num, String city, double balance) {
		super();
		this.acc_num = acc_num;
		this.branch_name = branch_name;
		this.ifsc_num = ifsc_num;
		this.city = city;
		this.balance = balance;
	}
	
	public int compareTo(Account acc) {
		if(acc_num > acc.acc_num)
			return 1;
		else if(acc_num < acc.acc_num)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "Account [acc_num=" + acc_num + ", branch_name=" + branch_name + ", ifsc_num=" + ifsc_num + ", city="
				+ city + ", balance=" + balance + "]";
	}
}
