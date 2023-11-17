package coreJavaTopics.serialization.serializationWithAggregation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CreditCardDetails {

	public static void main(String[] args) {
		
		try {
			
			//Serialization
			/*
			CustomerAddress address = new CustomerAddress("Ramesh", "7-11/14, Bank Colony", "Near ShankarNag Circle, Kathriguppe", "Bengaluru", "Karnataka", 560060l, "FIHPP6587J", "rameshraj@gmail.com");
			CreditCard card = new CreditCard(663585474125l, "Ramesh", "12-12-2028", 336, 2598, 500000.0d, address);
			
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\CreditCard.txt"));
			oout.writeObject(card);
			oout.flush();
			oout.close();
			
			System.out.println("Credit Card Details successfully serialized......");
			*/
			
			
			//Deserialization
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\CreditCard.txt"));
			CreditCard card = (CreditCard) ois.readObject();
			System.out.println(card);
			ois.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
