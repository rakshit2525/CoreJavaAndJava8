package coreJavaTopics.collection_framework.setInterface.hashSet.basicExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		//create the object of HashSet
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Rohit");
		hashSet.add("Gill");
		hashSet.add("Kohli");
		hashSet.add("Shreyas");
		hashSet.add("Rahul");
		hashSet.add("Kohli");
		hashSet.add(null);
		
		System.out.println("------------------------ Iterating over the HashSet object -------------------------");
		Iterator<String> itr =  hashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("");
		System.out.println("------------------------ HashSet doesn't allow duplicate values ------------------------");
		for(String name: hashSet) {
			System.out.println(name);
		}
		System.out.println("");
		
		
		HashSet<String> hashSet1 = new HashSet<String>();
		hashSet1.add("Hardik");
		hashSet1.add("Jadeja");
		hashSet1.add("Kuldeep");
		hashSet1.add("Siraj");
		hashSet.addAll(hashSet1);
		System.out.println("---------------------- Adding new HashSet object to already existing HashSet object ----------------------");
		Iterator<String> itr1 =  hashSet.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("");
		
		
		System.out.println("Is the given value present in the set: " + hashSet.contains("Shami"));
		System.out.println("");
		
		System.out.println("Is the given HashSet object empty: " + hashSet.isEmpty());
		System.out.println("");
		
		hashSet.remove("Hardik");
		System.out.println("---------------------- After removing an element from the HashSet ------------------");
		Iterator<String> itr2 =  hashSet.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("");
		
		hashSet.removeAll(hashSet1);
		System.out.println("------------------- Removing the hashSet1 object from using removeall() ----------------------");
		Iterator<String> itr3 =  hashSet.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		System.out.println("");
		
	}
}
