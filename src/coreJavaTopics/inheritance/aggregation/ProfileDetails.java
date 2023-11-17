package coreJavaTopics.inheritance.aggregation;

public class ProfileDetails {

	public static void main(String[] args) {
		
		ContactDetails contactDetails1 = new ContactDetails("Ramesh", "12-12-86/2b, Koramangala", "NJIOO5698P", "ramesh.r@gmail.com", "22-08-1965", 6658996574l, "Bengaluru", 560060);
		SavingAccount savingAccount1 = new SavingAccount(9985663247l, "HDFC Branch", "Ramesh", 50000.0d, contactDetails1);
		
		ContactDetails contactDetails2 = new ContactDetails("Rajesh", "55-6/88, Indiranagar", "HJUKK4585T", "rajesh.raju@gmail.com", "14-05-1989", 9952147586l, "Bengaluru", 560065);
		SavingAccount savingAccount2 = new SavingAccount(99648313541l, "Canara Branch", "Rajesh", 75000.0d, contactDetails2);
		
		savingAccount1.displayProfileDetails();
		System.out.println();
		savingAccount2.displayProfileDetails();
	}

}
