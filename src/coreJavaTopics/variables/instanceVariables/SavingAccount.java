package coreJavaTopics.variables.instanceVariables;

public class SavingAccount {
	
	private long acc_no;
	private String branch;
	private String acc_holder_name;
	private double avail_balance;
	
	//setters and getters methods to set the value of object/variables
	public long getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAcc_holder_name() {
		return acc_holder_name;
	}

	public void setAcc_holder_name(String acc_holder_name) {
		this.acc_holder_name = acc_holder_name;
	}

	public double getAvail_balance() {
		return avail_balance;
	}

	public void setAvail_balance(double avail_balance) {
		this.avail_balance = avail_balance;
	}

}
