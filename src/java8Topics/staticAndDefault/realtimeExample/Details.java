package java8Topics.staticAndDefault.realtimeExample;

public class Details {

	public static void main(String[] args) {
		
		IFederalReserveService bofa = new BankOfAmerica();
		IFederalReserveService citi = new CitiBank();
		
		bofa.getWithdrawlDetails();
		bofa.linkSSN();
		bofa.linkPAN();
		
		System.out.println("\n ----------------------------------------------------------- \n");
		
		citi.getWithdrawlDetails();
		citi.linkSSN();
		
		System.out.println("\n ----------------------------------------------------------- \n");
		
		IFederalReserveService.getCCDetails();
	}
}
