package coreJavaTopics.exceptionHandling.customException.atmProject;

import java.util.Scanner;

public class BankOperations {

	public static void main(String[] args) {
		
		int option = 0;
		String nextOption = null;
		double deptAmount = 0.0d;
		double withdrawAmount = 0.0d;
		String debitCard = null;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Please insert your debit card");
			debitCard = sc.next();
			
			try {
				IATMService dCard = new SBIDebitCard();
				start :
					while (true) {
						System.out.println("Please select the option you want to perform: ");
						System.out.println("1. Deposit");
						System.out.println("2. Withdraw");
						System.out.println("3. Check Balance");
						System.out.println("4. Exit");
						option = sc.nextInt();
						
						try {
							switch(option) {
								case 1:
									System.out.println("Please enter the amount to deposit");
									deptAmount = sc.nextDouble();
									dCard.depositAmount(deptAmount);
									System.out.println("Amount of " + deptAmount + "/- has been credited into your account");
									break;
								case 2:
									System.out.println("Please enter the amount to withdraw");
									withdrawAmount = sc.nextDouble();
									dCard.withdrawAmount(withdrawAmount);
									System.out.println("Amount of " + withdrawAmount + "/- has been debited from your account");
									break;
								case 3:
									System.out.println("Available balance is: " + dCard.checkBalance() + "/-");
								case 4: 
									break start;
								default:
									System.out.println("Invalid Operation");
							}
							System.out.println("Do you want to continue?");
							System.out.println("Press 'Y' for Yes or Press 'N' for No");
							nextOption = sc.next();
							if ("N".equalsIgnoreCase(nextOption)) {
								break start;
							}
						} catch (InvalidAmountException iae) {
							System.out.println(iae.getMessage());
						} catch (InsufficientAmountException ise) {
							System.out.println(ise.getMessage());
						}
					}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("-------------------- Thanks for visiting HDFC ATM -----------------------");
			System.out.println("-------------------------------------------------------------------------");
		}
	}

}
