package coreJavaTopics.collection_framework.listInterface.arrayList.serializationOfArrayListObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TransactionDetails {

	public static void main(String[] args) {
		
		ArrayList<TransactionStatement> statement = new ArrayList<TransactionStatement>();
		statement.add(new TransactionStatement("13-10-2023", "Transfer to Rohit", 6358741156l, "13-10-2023", 5000.0d));
		statement.add(new TransactionStatement("13-10-2023", "Transfer to Big Bazar", 9685321475l, "13-10-2023", 10000.0d));
		statement.add(new TransactionStatement("13-10-2023", "Transfer to Mohan", 5523669874l, "13-10-2023", 50.0d));
		statement.add(new TransactionStatement("13-10-2023", "Transfer to Chetty's Corner", 1125369874l, "13-10-2023", 300.0d));
		statement.add(new TransactionStatement("13-10-2023", "Transfer to Ramesh", 44589657412l, "13-10-2023", 150.0d));
		
		try {
			
			//Serialization of ArrayList object
			/*
			FileOutputStream fout = new FileOutputStream("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\TransactionStatement.txt");
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			oout.writeObject(statement);
			oout.close();
			fout.close();
			System.out.println("List Object is serialized successfully");
			*/
			
			
			FileInputStream fis = new FileInputStream("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\TransactionStatement.txt"); 
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<TransactionStatement> statement1 =(ArrayList<TransactionStatement>) ois.readObject(); 
			for (TransactionStatement obj : statement1) { 
				System.out.println(obj); 
			} 
			ois.close(); 
			fis.close();
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
