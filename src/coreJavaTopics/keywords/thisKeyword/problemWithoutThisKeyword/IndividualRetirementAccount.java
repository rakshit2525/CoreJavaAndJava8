package coreJavaTopics.keywords.thisKeyword.problemWithoutThisKeyword;

//problem without this keyword is that the names of parameters must not be same as the instance variables
//more explanation in notes

public class IndividualRetirementAccount {
	
	long ira_acc_num;
	String ira_holder_name;
	String branch_name;
	String city;
	double roi;
	double account_balance;

	public IndividualRetirementAccount(long acc_num, String holder_name, String branch, String ira_city,
			double rateOfInterest, double balance) {
		ira_acc_num = acc_num;
		ira_holder_name = holder_name;
		branch_name = branch;
		city = ira_city;
		roi = rateOfInterest;
		account_balance = balance;
	}

	public void displayAccInfo() {
		System.out.println("Account Number: " + ira_acc_num + " | Customer Name: " + ira_holder_name + " | Branch Name: " + branch_name + 
				" | City: " + city + " | Rate of Interest: " + roi + " | Balance: " + account_balance);
	}

	public static void main(String[] args) {
		IndividualRetirementAccount account1 = new IndividualRetirementAccount(8556424, "Rajesh", "SBI Branch", "Bengaluru", 8.9d, 300000.0d);
		IndividualRetirementAccount account2 = new IndividualRetirementAccount(8556425, "Ramesh", "Canara Branch", "Mysore", 9.9d, 00000.0d);
		IndividualRetirementAccount account3 = new IndividualRetirementAccount(8556426, "Umesh", "Union Branch", "Udupi", 7.9d, 450000.0d);
		IndividualRetirementAccount account4 = new IndividualRetirementAccount(8556427, "Rupesh", "HDFC Branch", "Hassan", 6.9d, 350000.0d);
		
		account1.displayAccInfo();
		account2.displayAccInfo();
		account3.displayAccInfo();
		account4.displayAccInfo();
	}

}
