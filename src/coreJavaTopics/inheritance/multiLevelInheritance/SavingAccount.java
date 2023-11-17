package coreJavaTopics.inheritance.multiLevelInheritance;

public class SavingAccount extends BankAccount{
	
	private double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void displaySavingAccountInfo() {
		super.displayBankInfo();
		System.out.println("--------------- Saving account -------------------");
		System.out.println("Interest Rate: " + interestRate);
	}
}
