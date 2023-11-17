package java8Topics.lambdaExpressions.userDefinedObjectReturn;

public class AccountDetails {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.setAcc_num(985632147l);
		account.setAcc_holder_name("Ramesh");
		account.setCity("Karwar");
		account.setIfsc_code("SBIN0012885");
		account.setState("Karnataka");
		account.setAcc_balance(50000.0d);
		
		//with lambda expression
		IAccountService service = (acc_number) -> {
			System.out.println("Account Number: " + account.getAcc_num());
			System.out.println("Account Holder Name: " + account.getAcc_holder_name());
			System.out.println("IFSC Code: " + account.getIfsc_code());
			System.out.println("City: " + account.getCity());
			System.out.println("State: " + account.getState());
			System.out.println("Balance: " + account.getAcc_balance());
			return account;
		};
		
		service.getAccountDetails(985632147l);
	}
}
