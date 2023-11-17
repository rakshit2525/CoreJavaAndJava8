package coreJavaTopics.collection_framework.setInterface.linkedHashSet.realtimeExample;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class AccountDetails {

	public static void main(String[] args) {
		
		LinkedHashSet<Account> hashObject = new LinkedHashSet<Account>();
		hashObject.add(new Account(10201151l, "Mysore Branch", "Ramesh", "MYS1001021", 25000.0d));
		hashObject.add(new Account(10301161l, "Bengaluru Branch", "Santosh", "BEN1002031", 50000.0d));
		hashObject.add(new Account(10401171l, "Udupi Branch", "Ronit", "SBI1003041", 75000.0d));
		hashObject.add(new Account(10501181l, "Hassan Branch", "Umesh", "HAS1004051", 50000.0d));
		hashObject.add(new Account(10601191l, "Mangalore Branch", "Srihari", "MAN1005061", 35000.0d));
		hashObject.add(new Account(10701101l, "Kolar Branch", "Rahul", "KOL1006071", 100000.0d));
		hashObject.add(new Account(10201151l, "Mysore Branch", "Ramesh", "MYS1001021", 25000.0d));
		
		//iterate over the hashSet object
		System.out.println("-------------------- Retrieving data using Iterator interface ---------------------");
		Iterator<Account> itr = hashObject.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("");
		
		//displaying with for each loop
		System.out.println("-------------------- Retrieving data using for each loop interface ---------------------");
		for(Account acc: hashObject) {
			System.out.println(acc);
		}
		System.out.println();
		
		//displaying with for loop
		/*
		 * System.out.
		 * println("-------------------- Retrieving data using for loop interface ---------------------"
		 * ); for (int i = 0; i < hashObject.size(); i++) { System.out.println(); }
		 */
	}
}
