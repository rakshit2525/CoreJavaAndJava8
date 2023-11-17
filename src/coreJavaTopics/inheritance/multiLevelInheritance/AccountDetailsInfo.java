package coreJavaTopics.inheritance.multiLevelInheritance;

public class AccountDetailsInfo {
	
	private SavingAccount savingAccount;
	private CheckingAccount checkingAccount;

	public static void main(String[] args) {
		AccountDetailsInfo details = new AccountDetailsInfo();
		details.createAsset();
		details.displayAsset();
	}
	
	public void createAsset() {
		
		savingAccount = new SavingAccount();
		savingAccount.setAsset_id(56463);
		savingAccount.setAsset_type("Account Type");
		savingAccount.setAcc_num(2235996841l);
		savingAccount.setBank_name("HDFC Bank");
		savingAccount.setBalance(50000.0d);
		savingAccount.setInterestRate(9.9d);
		
		checkingAccount = new CheckingAccount();
		checkingAccount.setAsset_id(78564);
		checkingAccount.setAsset_type("Acccount Type");
		checkingAccount.setAcc_num(2564897436l);
		checkingAccount.setBank_name("HDFC Bank");
		checkingAccount.setBalance(60000.0d);
		checkingAccount.setOverDraftLimit(30000.0d);
	}

	public void displayAsset() {
		savingAccount.displaySavingAccountInfo();
		checkingAccount.displayCAccountInfo();
	}
}
