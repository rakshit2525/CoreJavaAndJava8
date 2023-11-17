package coreJavaTopics.methodsInJava.userDefinedMethods;

public class InvestmentSavingAccountDetails {

	public static void main(String[] args) {
		InvestmentSavingAccount account1 = new InvestmentSavingAccount();
		InvestmentSavingAccount account2 = new InvestmentSavingAccount();
		
		account1.setIsa_acc_num(225489);
		account1.setIsa_customer_name("Rajesh");
		account1.setBranch_name("SBI Branch");
		account1.setIfsc_code("KA0012BE");
		account1.setIsa_acc_balance(60000.0d);
		account1.setInvestment_amount(1000000.0d);
		account1.setTenure(5);
		account1.setRate_of_interest(9.75d);
		
		account2.setIsa_acc_num(225455);
		account2.setIsa_customer_name("Umesh");
		account2.setBranch_name("HDFC Branch");
		account2.setIfsc_code("KA0021MY");
		account2.setIsa_acc_balance(75000.0d);
		account2.setInvestment_amount(800000.0d);
		account2.setTenure(10);
		account2.setRate_of_interest(7.75d);
		
		System.out.println("------------------ Account 1 Details-----------------------------");
		System.out.println("Account Number: " + account1.getIsa_acc_num());
		System.out.println("Customer Name: " + account1.getIsa_customer_name());
		System.out.println("Branch Name: " + account1.getBranch_name());
		System.out.println("IFSC Code: " + account1.getIfsc_code());
		System.out.println("Available balance: " + account1.getIsa_acc_balance());
		System.out.println("Investment amount: " + account1.getInvestment_amount());
		System.out.println("Rate of Interst: " + account1.getRate_of_interest());
		System.out.println("Tenure: " + account1.getTenure());
		System.out.println("------------------ Statement Generation-----------------------------");
		account1.genereateLastTenTransaction(225489);
		
		System.out.println("");
		
		System.out.println("------------------ Account 2 Details-----------------------------");
		System.out.println("Account Number: " + account2.getIsa_acc_num());
		System.out.println("Customer Name: " + account2.getIsa_customer_name());
		System.out.println("Branch Name: " + account2.getBranch_name());
		System.out.println("IFSC Code: " + account2.getIfsc_code());
		System.out.println("Available balance: " + account2.getIsa_acc_balance());
		System.out.println("Investment amount: " + account2.getInvestment_amount());
		System.out.println("Rate of Interst: " + account2.getRate_of_interest());
		System.out.println("Tenure: " + account2.getTenure());
		System.out.println("------------------ Change PIN Number -----------------------------");
		account2.changePIN(1234);
	}

}
