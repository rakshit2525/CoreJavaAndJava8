package coreJavaTopics.serialization.serializationWithInheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class InheritanceSerialization {

	public static void main(String[] args) {
		
		try {
			
			//Serialization
			/*
			HomeLoan homeLoan = new HomeLoan(22547l, "Home Loan", "HDFC Bank", 96325874158l, "Santosh", "7-9-15, Hegde Colony", "Columbia Hospital Road", 560050l, "NJUOO6985P", 2000000.0d, 8.5d, "08-10-2024", 20000.0d);
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\HomeLoan.txt"));
			oout.writeObject(homeLoan);
			oout.flush();
			oout.close();
			System.out.println("Loan Statement Object is serialized.....");
			*/
			
			//Deserialization
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\HomeLoan.txt"));
			HomeLoan loan = (HomeLoan) ois.readObject();
			System.out.println("Loan ID: " + loan.getLoan_id());
			System.out.println("Loan Type: " + loan.getLoan_type());
			System.out.println("Bank Name: " + loan.getBank_name());
			System.out.println("Loan Number: " + loan.getLoan_number());
			System.out.println("Applicant Name: " + loan.getApplicant_name());
			System.out.println("Address Line 1: " + loan.getAddress_line1());
			System.out.println("Address Line 2: " + loan.getAddress_line2());
			System.out.println("Zip Code: " + loan.getZipCode());
			System.out.println("Pan Card: " + loan.getPanCard());
			System.out.println("Loan Amount: " + loan.getLoan_amount());
			System.out.println("Rate of Interest: " + loan.getRate_of_interest());
			System.out.println("Disbursal Date: " + loan.getDisbursal_date());
			System.out.println("EMI: " + loan.getEmi());
			ois.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
