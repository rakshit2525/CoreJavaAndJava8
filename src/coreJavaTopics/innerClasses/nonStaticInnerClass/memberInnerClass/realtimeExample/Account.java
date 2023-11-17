package coreJavaTopics.innerClasses.nonStaticInnerClass.memberInnerClass.realtimeExample;

public class Account {

	private String bank_name = "Bank of America";
	
	class SavingAccount{
		private long sa_acc_num = 6352147896l;
		private String sa_acc_holder_name = "Suresh";
		private String address = "5-4-1/44, Indiranagar, Bengaluru";
		
		void displaySAInfo() {
			System.out.println("--------------- Saving Account Info ------------------");
			System.out.println("Account Number: " + sa_acc_num);
			System.out.println("Customer Name: " + sa_acc_holder_name);
			System.out.println("Address: " + address);
			System.out.println("Bank Name: " + bank_name);
		}
	}
	
	class ChekingAccount{
		private long ca_acc_num = 888596412l;
		private String ca_cust_name = "Mahesh";
		private String address = "3/11, Hootgalli, Mysore";
		
		void displaySAInfo() {
			System.out.println("--------------- Cheking Account Info ------------------");
			System.out.println("Account Number: " + ca_acc_num);
			System.out.println("Customer Name: " + ca_cust_name);
			System.out.println("Address: " + address);
			System.out.println("Bank Name: " + bank_name);
		}
	}
	
	public void accountInfo() {
		System.out.println("----------- This is outer class Account ----------------------");
		System.out.println("Bank Name: " + bank_name);
	}
	
	public static void main(String[] args) {
		Account account = new Account();
		
		Account.SavingAccount savingAccount = account.new SavingAccount();
		Account.ChekingAccount checkingAccount = account.new ChekingAccount();
		
		savingAccount.displaySAInfo();
		checkingAccount.displaySAInfo();
		account.accountInfo();
	}
}
