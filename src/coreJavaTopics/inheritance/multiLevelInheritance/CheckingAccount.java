package coreJavaTopics.inheritance.multiLevelInheritance;

public class CheckingAccount extends BankAccount{
	
	private double overDraftLimit;

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	
	public void displayCAccountInfo() {
		super.displayBankInfo();
		System.out.println("-------------- Checking Account -------------------");
		System.out.println("Over Draft Limit: " + overDraftLimit);
	}
}
