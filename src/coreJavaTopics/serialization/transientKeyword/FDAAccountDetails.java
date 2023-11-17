package coreJavaTopics.serialization.transientKeyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FDAAccountDetails {

	public static void main(String[] args) {

		try {
			
			//Serialization
			/*
			FixedTermDepositAccount account = new FixedTermDepositAccount(632598567415l, "Basavaraj", "SBi Branch", 6632548l, "7-7/14, Doctor's colony", "Opp UB City", "BDA 3rd Stage", "Banashankari", "Bengaluru", "Karnataka", 10, 100000.0d, 7.5d);
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\FDAAccount.txt"));
			oout.writeObject(account);
			oout.flush();
			oout.close();
			System.out.println("Account Details serialized successfully....");
			*/
			
			
			
			//Deserialization
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\FDAAccount.txt"));
			FixedTermDepositAccount account = (FixedTermDepositAccount) ois.readObject();
			System.out.println(account);
			ois.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
