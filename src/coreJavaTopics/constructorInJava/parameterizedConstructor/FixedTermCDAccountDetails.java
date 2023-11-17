package coreJavaTopics.constructorInJava.parameterizedConstructor;

public class FixedTermCDAccountDetails {

	public static void main(String[] args) {
		FixedTermCDAccount account = new FixedTermCDAccount();
		
		FixedTermCDAccount account1 = new FixedTermCDAccount(569974513, "Rajesh", "SBI Branch", 9967211, "13-4-4 Nitya Nilaya", "opp. MR Building",
				"Race Course Road", "Majestic", "Bengaluru", "Karnataka", 5, 7.5d, 50000.0d);
		
		FixedTermCDAccount account2 = new FixedTermCDAccount(569974515, "Umesh", "Canara Branch", 8891156, "22-5/08b Samruddhi Nilaya", "opp. Colombia Hospital",
				"Palace Road", "Hootgalli", "Mysore", "Karnataka", 10, 5.8d, 200000.0d);
		
		//display account details by calling user-defined method
		account1.displayFTAInfo();
		account2.displayFTAInfo();
		System.out.println("------------------ Credit Card details -----------------------------");
		account2.getCreditCardDetails();
	}

}
