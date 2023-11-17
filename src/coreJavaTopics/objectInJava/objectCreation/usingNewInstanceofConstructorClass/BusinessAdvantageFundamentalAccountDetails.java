package coreJavaTopics.objectInJava.objectCreation.usingNewInstanceofConstructorClass;

import java.lang.reflect.Constructor;

public class BusinessAdvantageFundamentalAccountDetails {

	public static void main(String[] args) {
		
		try {
			Constructor<BusinessAdvantageFundamentalAccount> object = BusinessAdvantageFundamentalAccount.class.getConstructor();
			BusinessAdvantageFundamentalAccount account1 = object.newInstance();
			BusinessAdvantageFundamentalAccount account2 = object.newInstance();
			
			account1.setBfa_acc_num(4567);
			account1.setBfa_customer_name("Punith");
			account1.setBranch_name("SBI Branch");
			account1.setSsn_number(01121);
			account1.setCity("Mangalore");
			account1.setBfa_acc_bal(50000.0d);
			
			account2.setBfa_acc_num(45678);
			account2.setBfa_customer_name("Vinith");
			account2.setBranch_name("HDFC Branch");
			account2.setSsn_number(01122);
			account2.setCity("Bengaluru");
			account2.setBfa_acc_bal(75000.0d);
			
			System.out.println("------------------ Account 1 Details-----------------------------");
			System.out.println("Account Number: " + account1.getBfa_acc_num());
			System.out.println("Customer Name: " + account1.getBfa_customer_name());
			System.out.println("Branch Name: " + account1.getBranch_name());
			System.out.println("SSN Number: " + account1.getSsn_number());
			System.out.println("City: " + account1.getCity());
			System.out.println("Available Balance: " + account1.getBfa_acc_bal());
			
			System.out.println("------------------ Account 2 Details-----------------------------");
			System.out.println("Account Number: " + account2.getBfa_acc_num());
			System.out.println("Customer Name: " + account2.getBfa_customer_name());
			System.out.println("Branch Name: " + account2.getBranch_name());
			System.out.println("SSN Number: " + account2.getSsn_number());
			System.out.println("City: " + account2.getCity());
			System.out.println("Available Balance: " + account2.getBfa_acc_bal());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
