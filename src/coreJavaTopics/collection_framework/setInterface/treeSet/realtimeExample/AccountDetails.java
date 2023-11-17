package coreJavaTopics.collection_framework.setInterface.treeSet.realtimeExample;

import java.util.Iterator;
import java.util.TreeSet;

public class AccountDetails {

	public static void main(String[] args) {
		
		TreeSet<Account> account = new TreeSet<Account>();
		account.add(new Account(900955951l, "Bengaluru Branch", "BNHYY3244K", "Bengaluru", 50000.0d));
		account.add(new Account(900955954l, "Kolar Branch", "POYTE4520F", "Kolar", 80000.0d));
		account.add(new Account(900955953l, "Udupi Branch", "CBGDR2140A", "Udupi", 15000.0d));
		account.add(new Account(900955951l, "Bengaluru Branch", "BNHYY3244K", "Bengaluru", 50000.0d));
		account.add(new Account(900955955l, "Karwar Branch", "HGDFR0217T", "Karwar", 45000.0d));
		account.add(new Account(900955952l, "Mysore Branch", "KHRFQ8597I", "Mysore", 25000.0d));
		
		Iterator<Account> itr = account.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
