package coreJavaTopics.abstraction.interfaceExm.interfaceExample1;

public class HomeLoanInterestRates {

	public static void main(String[] args) {

		Banks allahabadBank = new AllahabadBank();
		Banks andhraBank = new AndhraBank();
		Banks bankOfIndia = new BankOfIndia();
		
		System.out.println("Home Loan Rate of Interest of Allahabad Bank: " + allahabadBank.getRateOfinterest() + "%");
		System.out.println("Home Loan Rate of Interest of Andhra Bank: " + andhraBank.getRateOfinterest() + "%");
		System.out.println("Home Loan Rate of Interest of Bank Of India: " + bankOfIndia.getRateOfinterest() + "%");
	}

}
