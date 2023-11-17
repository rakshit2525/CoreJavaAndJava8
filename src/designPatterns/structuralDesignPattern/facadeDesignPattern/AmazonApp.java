package designPatterns.structuralDesignPattern.facadeDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AmazonApp {
	
	private static int choice;

	public static void main(String[] args) {
		
		do {
			System.out.println("------------------------------- SmartPhones -------------------------------------");
			System.out.println("1. OnePlus \n");
			System.out.println("2. IPhone \n");
			System.out.println("3. Samsung \n");
			System.out.println("4. Exit");
			System.out.println("");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your choice: ");
			try {
				choice = Integer.parseInt(reader.readLine());
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
			
			AmazonProducts products = new AmazonProducts();
			switch(choice) {
				case 1: 
					products.getOnePlus();
					break;
				case 2:
					products.getIPhone();
					break;
				case 3: 
					products.getSamsung();
				default:
				{
					System.out.println("Can't buy the Phone since it is out of stock");
				}
			}
		} while (choice != 4);
	}
}
