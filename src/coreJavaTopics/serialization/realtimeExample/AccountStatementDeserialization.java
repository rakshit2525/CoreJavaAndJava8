package coreJavaTopics.serialization.realtimeExample;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class AccountStatementDeserialization {

	public static void main(String[] args) {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\AccountStatement.txt"));
			AccountStatement statement = (AccountStatement) ois.readObject();
			System.out.println("Customer ID: " + statement.getCust_id());
			System.out.println("Account Number: " + statement.getAcc_num());
			System.out.println("Customer Name: " + statement.getHolder_name());
			System.out.println("Branch Name: " + statement.getBranch());
			System.out.println("City: " + statement.getCity());
			System.out.println("Mobile Number: " + statement.getCell_num());
			System.out.println("Pan Card: " + statement.getPan_card());
			System.out.println("Over Draft Limit: " + statement.getOver_draft_limit());
			System.out.println("Account Status: " + statement.getAcc_status());
			System.out.println("Branch Code: " + statement.getBranch_code());
			System.out.println("Available Balance: " + statement.getAcc_balance());
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
