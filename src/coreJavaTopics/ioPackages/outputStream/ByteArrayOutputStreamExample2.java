package coreJavaTopics.ioPackages.outputStream;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamExample2 {
	
	String bank_name;
	String customer_name;
	long acc_num;
	String city;
	double available_balance;

	public ByteArrayOutputStreamExample2(String bank_name, String customer_name, long acc_num, String city,
			double available_balance) {
		super();
		this.bank_name = bank_name;
		this.customer_name = customer_name;
		this.acc_num = acc_num;
		this.city = city;
		this.available_balance = available_balance;
	}

	//method to download the bank account statement creates two files with customer name as file name.
	/* 
	 * byte array output stream has a writeBytes method different from write method of other output stream.
	 * byte array output stream holds all the common data that is to be printed to multiple output stream.
	 * writeTo() method is used to write the data contained in the byte array output stream object.
	 */
	/*
	 * write() method of ByteArrayOutputStream class is used to write only single ASCII value 
	 * to add string to it we need to call the method writeBytes() method that takes the byte array as input
	 */
	
	public void downloadStatement() {
		try {
			File file1 = new File("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\"+customer_name+"21.txt");
			File file2 = new File("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\"+customer_name+"22.txt");
			
			FileOutputStream fout1 = new FileOutputStream(file1);
			FileOutputStream fout2 = new FileOutputStream(file2);
			
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			String myStr = "Bank Name: " + bank_name +
					       "\nCustomer Name: " + customer_name + 
					       "\naccount Number: " + acc_num + 
					       "\nCity: " + city + 
					       "\nAvailable Balance: " + available_balance;
			byte[] b = myStr.getBytes();
			bout.writeBytes(b);
			bout.writeTo(fout1);
			bout.writeTo(fout2);
			System.out.println("Data Written Successfully.........");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		ByteArrayOutputStreamExample2 account1 = new ByteArrayOutputStreamExample2("HDFC Bank", "Ramesh", 996587456247l, "Bengaluru", 50000.0d);
		
		account1.downloadStatement();
	}

}
