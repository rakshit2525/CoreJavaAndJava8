package coreJavaTopics.collection_framework.setInterface.linkedHashSet.basicExample;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<String> hashObject = new LinkedHashSet<String>();
		hashObject.add("India");
		hashObject.add("Australia");
		hashObject.add("England");
		hashObject.add("New Zealand");
		hashObject.add("South Africa");
		hashObject.add("New Zealand");
		hashObject.add(null);
		
		System.out.println("--------------------- Iterating over LinkedHashSet object --------------------------");
		for (String country: hashObject) {
			System.out.println(country);
		}
		System.out.println("");
		
		System.out.println("--------------- adding new LinkedHashSet object to already existing object ---------------");
		LinkedHashSet<String> hashObject1 = new LinkedHashSet<String>();
		hashObject.addAll(hashObject1);
		hashObject1.add("Pakistan");
		hashObject1.add("Sri Lanka");
		hashObject1.add("Netherlands");
		Iterator<String> itr = hashObject.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("");
		
		
		
	}
}
