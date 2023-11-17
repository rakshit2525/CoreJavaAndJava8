package coreJavaTopics.serialization.externalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AccountDetails {

	public static void main(String[] args) {
		
		try {
			
			/*
			PremiumCurrentAccount account = new PremiumCurrentAccount(50558l, "Resident Individual", "Pranav", 29, "8-4/11, Hegde Colony, Hootgalli", "Mysore", "HYGVD8541O", 300000.0d, 6363548247l);
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\CurrentAccount.txt"));
			oout.writeObject(account);
			oout.flush();
			oout.close();
			System.out.println("Account Details externalized successfully.....");
			*/
			
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\CurrentAccount.txt")); 
			PremiumCurrentAccount account = (PremiumCurrentAccount) ois.readObject();
			System.out.println(account);
			ois.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
