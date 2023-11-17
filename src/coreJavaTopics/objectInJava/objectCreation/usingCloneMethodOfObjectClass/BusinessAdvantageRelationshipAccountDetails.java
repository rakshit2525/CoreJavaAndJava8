package coreJavaTopics.objectInJava.objectCreation.usingCloneMethodOfObjectClass;

public class BusinessAdvantageRelationshipAccountDetails {
	
	public static void main(String[] args) {
		
		try {
			BusinessAdvantageRelationshipAccount account1 = new BusinessAdvantageRelationshipAccount();
			
			account1.setBara_acc_num(4567);
			account1.setBara_cust_name("Ramesh");
			account1.setBusiness_loan_amount(400000.0d);
			account1.setDisbursal_date("06-09-2023");
			account1.setEmi_amount(14000.0d);
			account1.setRate_of_interest(10.75d);
			account1.setTenure(3);
			
			System.out.println("------------------ Before cloning the object -----------------------------");
			System.out.println("Account Number: " + account1.getBara_acc_num());
			System.out.println("Customer Name: " + account1.getBara_cust_name());
			System.out.println("Loan Amount: " + account1.getBusiness_loan_amount());
			System.out.println("Disbursal Date: " + account1.getDisbursal_date());
			System.out.println("EMI Amount: " + account1.getEmi_amount());
			System.out.println("Rate Of interest: " + account1.getRate_of_interest());
			System.out.println("Tenure: " + account1.getTenure());
			
			//cloning the object 
			BusinessAdvantageRelationshipAccount account2 = (BusinessAdvantageRelationshipAccount) account1.clone();
			
			account2.setBara_acc_num(45678);
			account2.setBara_cust_name("Umesh");
			account2.setBusiness_loan_amount(500000.0d);
			account2.setDisbursal_date("15-08-2023");
			account2.setEmi_amount(10000.0d);
			account2.setRate_of_interest(10.75d);
			account2.setTenure(5);
			
			System.out.println("------------------ After cloning the object -----------------------------");
			System.out.println("Account Number: " + account2.getBara_acc_num());
			System.out.println("Customer Name: " + account2.getBara_cust_name());
			System.out.println("Loan Amount: " + account2.getBusiness_loan_amount());
			System.out.println("Disbursal Date: " + account2.getDisbursal_date());
			System.out.println("EMI Amount: " + account2.getEmi_amount());
			System.out.println("Rate Of interest: " + account2.getRate_of_interest());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
