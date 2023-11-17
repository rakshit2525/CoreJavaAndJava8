package designPatterns.structuralDesignPattern.adapterDesignPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Customer extends HDFCBankCustomerDetails implements AxisBankCreditCard{

	@Override
	public void provideCustomerDetails() {
		try {
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Account Number: " );
			long acc_num = Long.parseLong(reader.readLine());
			System.out.println("Enter Bank Name: ");
			String bankName = reader.readLine();
			System.out.println("Enter Customer Name: ");
			String cust_name = reader.readLine();
			System.out.println("Enter Account Balance");
			double balance = Double.parseDouble(reader.readLine());
			
			setAcc_number(acc_num);
			setBank_name(bankName);
			setAcc_holder_name(cust_name);
			setAcc_balance(balance);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String issueCreditCard() {
		long accNumber = getAcc_number();
		String bName = getBank_name();
		String holderName = getAcc_holder_name();
		return ("The Account Number: " + accNumber + " of " + holderName +
				" having an account in " + bName + " is verifed and authenticated for issuing the credit card");
	}

	
}
