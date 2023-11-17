package coreJavaTopics.inheritance.problemFacedWithoutInheritance;

public class LoanDetails {

	public static void main(String[] args) {

		AutomobileLoan auto = new AutomobileLoan();
		ConsumerLoan consumer = new ConsumerLoan();
		GoldLoan gold = new GoldLoan();
		
		auto.setLoan_number(5598765);
		auto.setApplicant_name("Ramesh");
		auto.setMailing_address("5-89-4, Bengaluru");
		auto.setLoan_amount(400000.0d);
		auto.setDisbursal_date("15-09-2023");
		auto.setRate_of_interest(7.8d);
		
		consumer.setLoan_number(4489756);
		consumer.setApplicant_name("Umesh");
		consumer.setMailing_address("13/9, Mysore");
		consumer.setLoan_amount(500000.0d);
		consumer.setDisbursal_date("20-09-2023");
		consumer.setRate_of_interest(9.8d);
		consumer.setProcessing_fee(6000.0d);
		
		gold.setLoan_number(6659846);
		gold.setApplicant_name("Rajesh");
		gold.setMailing_address("13/9, Mysore");
		gold.setLoan_amount(300000.0d);
		gold.setDisbursal_date("22-09-2023");
		gold.setRate_of_interest(6.8d);
		gold.setGold_loan_feature("Best rate of interest");
		
		System.out.println("----------------- Automobile Loan details -----------------------");
		System.out.println("Loan Number: " + auto.getLoan_number());
		System.out.println("Applicant Name: " + auto.getApplicant_name());
		System.out.println("Mailing Address: " + auto.getMailing_address());
		System.out.println("Loan Amount: " + auto.getLoan_amount());
		System.out.println("Disbursal Date: " + auto.getDisbursal_date());
		System.out.println("Rate of Interest: " + auto.getRate_of_interest());
		
		System.out.println("----------------- Consumer Loan details -----------------------");
		System.out.println("Loan Number: " + consumer.getLoan_number());
		System.out.println("Applicant Name: " + consumer.getApplicant_name());
		System.out.println("Mailing Address: " + consumer.getMailing_address());
		System.out.println("Loan Amount: " + consumer.getLoan_amount());
		System.out.println("Disbursal Date: " + consumer.getDisbursal_date());
		System.out.println("Rate of Interest: " + consumer.getRate_of_interest());
		System.out.println("Processing Fee: " + consumer.getProcessing_fee());
		
		System.out.println("----------------- Gold Loan details -----------------------");
		System.out.println("Loan Number: " + gold.getLoan_number());
		System.out.println("Applicant Name: " + gold.getApplicant_name());
		System.out.println("Mailing Address: " + gold.getMailing_address());
		System.out.println("Loan Amount: " + gold.getLoan_amount());
		System.out.println("Disbursal Date: " + gold.getDisbursal_date());
		System.out.println("Rate of Interest: " + gold.getRate_of_interest());
		System.out.println("Gold Loan Feature: " + gold.getGold_loan_feature());
	}

}
