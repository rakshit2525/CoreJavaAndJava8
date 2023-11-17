package coreJavaTopics.inheritance.multiLevelInheritance;

public class BankAccount extends Asset {

	private long acc_num;
	private String bank_name;
	private double balance;
	
	public long getAcc_num() {
		return acc_num;
	}
	public void setAcc_num(long acc_num) {
		this.acc_num = acc_num;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void displayBankInfo() {
		super.displayAsset();
		System.out.println("---------------- Bank Account -------------------");
		System.out.println("Account Number: " + acc_num);
		System.out.println("Bank Name: " + bank_name);
		System.out.println("Balance: " + balance);
	}
}
