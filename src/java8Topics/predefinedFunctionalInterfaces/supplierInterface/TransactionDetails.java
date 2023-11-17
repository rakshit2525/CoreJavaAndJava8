package java8Topics.predefinedFunctionalInterfaces.supplierInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class TransactionDetails {

	public static void main(String[] args) {
		
		//System.out.println(transactionSupplier().get());
		
		//displaying using for each loop
		List<Transaction> listOfTransactions = transactionSupplier().get();
		for(Transaction trans : listOfTransactions) {
			System.out.println(trans);
		}
		
		//using stream API
		//listOfTransactions.stream().forEach(System.out::println);
	}
	
	private static Supplier<List<Transaction>> transactionSupplier() {
		Supplier<List<Transaction>> transactionSupplier = () -> {
			List<Transaction> listOfTransactions = new ArrayList<Transaction>();
			listOfTransactions.add(new Transaction(968574123l, "Credit", "Credited into the account", 5000.0d));
			listOfTransactions.add(new Transaction(745896321l, "Debit", "Debited into the account", 1000.0d));
			listOfTransactions.add(new Transaction(145236987l, "Credit", "Credited into the account", 15000.0d));
			listOfTransactions.add(new Transaction(365214789l, "Credit", "Credited into the account", 250.0d));
			listOfTransactions.add(new Transaction(178293654l, "Debit", "Debited into the account", 3999.0d));
			return listOfTransactions;
		};
		return transactionSupplier;
	}
}