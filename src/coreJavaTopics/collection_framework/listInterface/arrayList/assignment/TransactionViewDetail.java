package coreJavaTopics.collection_framework.listInterface.arrayList.assignment;

import java.util.ArrayList;

public class TransactionViewDetail {
    
    public static void main(String[] args) {
    	
        ArrayList<TransactionStatements> statement = new ArrayList<>();

        // the below line calls the method addTransaction 
        addTransaction(statement, new TransactionStatements(6358415l, "Debited", "12-10-2023", 500.0d));
        addTransaction(statement, new TransactionStatements(2541589l, "Credited", "12-10-2023", 1500.0d));
        addTransaction(statement, new TransactionStatements(2569842l, "Debited", "12-10-2023", 605.0d));
        addTransaction(statement, new TransactionStatements(2159458l, "Debited", "12-10-2023", 55.0d));
        addTransaction(statement, new TransactionStatements(6358415l, "Credited", "12-10-2023", 5000.0d));

        // for each loop is used to display the ArrayList contents
        System.out.println("--------------------------------------- Transaction Details -----------------------------------------");
        for (TransactionStatements details : statement) {
            System.out.println(details);
        }
    }
    
    
    /*
    the below method is used to check if there are any duplicate transaction_id being added into the ArrayList,
    when this method encounters a duplicate transaction_id it doesn't add that object into the ArrayList  
    and also displays the error message with the complete object with values
    */
    
    /*
     * here ArrayList<TransactionStatements> statement - statement is the ArrayList which stores the object and 
     * it is of type ArrayList<TransactionStatements>
     * 
     * TransactionStatements transaction - it is the object that we want to add in the statement ArrayList
     */
    private static void addTransaction(ArrayList<TransactionStatements> statement, TransactionStatements transaction) {
        //this variable checks for uniqueness and stores the boolean value which later will be used to add the object into ArrayList
        boolean isTransactionIdUnique = true;
        for (TransactionStatements details : statement) {
            if (details.getTransactionId().equals(transaction.getTransactionId())) {
            	isTransactionIdUnique = false;
                System.out.println("Transaction ID " + transaction.getTransactionId() + " already exists and cannot be printed");
                System.out.println("Transaction details which is not printed is: " + transaction);
            }
        }

        // if the isUnique variable is true from the above for loop, then the transaction 
        //object gets added into the statement ArrayList
        if (isTransactionIdUnique) {
            statement.add(transaction);
        }
    }


}
