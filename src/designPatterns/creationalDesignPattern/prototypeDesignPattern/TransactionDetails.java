package designPatterns.creationalDesignPattern.prototypeDesignPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TransactionDetails {

	public static void main(String[] args) {
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Transaction ID: ");
			long trans_id = Long.parseLong(reader.readLine());
			System.out.println("Enter the Transaction Type: ");
			String trans_type = reader.readLine();
			System.out.println("Enter the Transaction Amount: ");
			double trans_amt = Double.parseDouble(reader.readLine());
			System.out.println("Enter the Transaction Date: " );
			String trans_date = reader.readLine();
			
			Transaction trans = new Transaction(trans_id, trans_type, trans_amt, trans_date);
			System.out.println(trans);
			
			System.out.println("----------------------- Creating the clone of already existing object -------------------------");
			Transaction trans1 = (Transaction) trans.clone();
			System.out.println(trans1);
			
			System.out.println("----------------------- Creating another clone of already existing object -------------------------");
			Transaction trans2 = (Transaction) trans.clone();
			System.out.println(trans2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
