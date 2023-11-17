package java8Topics.predefinedFunctionalInterfaces.predicateInterface;

public class SavingAccount {

	long acc_num;
	String acc_holder;
	double acc_balance;
	
	public SavingAccount(long acc_num, String acc_holder, double acc_balance) {
		super();
		this.acc_num = acc_num;
		this.acc_holder = acc_holder;
		this.acc_balance = acc_balance;
	}

	public long getAcc_num() {
		return acc_num;
	}

	public void setAcc_num(long acc_num) {
		this.acc_num = acc_num;
	}

	public String getAcc_holder() {
		return acc_holder;
	}

	public void setAcc_holder(String acc_holder) {
		this.acc_holder = acc_holder;
	}

	public double getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	
}
