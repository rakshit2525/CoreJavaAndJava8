package coreJavaTopics.objectInJava.objectInitialization.usingMethod;

public class BusinessAdvantagePlusAccountDetails {

	public static void main(String[] args) {
		
		BusinessAdvantagePlusAccount account1 = new BusinessAdvantagePlusAccount();
		BusinessAdvantagePlusAccount account2 = new BusinessAdvantagePlusAccount();
		
		account1.insertAccountDetails(596114767, "Ramesh", "SBI Branch", "Dharwad", "Kuvempu Colony", "MG Road", "India", 50000.0d);
		account2.insertAccountDetails(459861257, "Umesh", "Canara Branch", "Karwar", "Krishna Medows", "Bendre Road", "India", 75000.0d);
		
		account1.displayAccountDetailsInfo();
		account2.displayAccountDetailsInfo();
	}

}
