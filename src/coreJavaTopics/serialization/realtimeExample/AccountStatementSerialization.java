package coreJavaTopics.serialization.realtimeExample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AccountStatementSerialization {

	public static void main(String[] args) {
		
		try {
			AccountStatement statement = new AccountStatement(85647l, 996325874156l, "Ramesh", "SBI Branch", 001255l, "Bengaluru", 6600889658l, "FGHII5698K", 200000.0d, "active", 25000.0d);
			FileOutputStream fout = new FileOutputStream("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\AccountStatement.txt");
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			oout.writeObject(statement);
			oout.close();
			fout.close();
			System.out.println("Account object data is serialized successfully...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
