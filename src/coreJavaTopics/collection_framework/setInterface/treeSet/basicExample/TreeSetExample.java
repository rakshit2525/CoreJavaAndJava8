package coreJavaTopics.collection_framework.setInterface.treeSet.basicExample;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> cities = new TreeSet<String>();
		cities.add("Raichur");
		cities.add("Bellary");
		cities.add("Hassan");
		cities.add("Belagavi");
		cities.add("Hubli");
		cities.add("Gokarna");
		//cities.add(null); //TreeSet doesn't allow null values and if present gives null pointer exception
		cities.add("Bellary"); //this value doesn't get printed as TreeSet doesn't allow duplicate values
		
		//displaying the objects in the list, doesn't follow insertion order instead 
		System.out.println("---------------------------- Elements in the TreeSet are: ---------------------------");
		Iterator<String> itr = cities.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("");
		
		//creating another TreeSet object
		TreeSet<String> cities1 = new TreeSet<String>();
		cities1.add("Udupi");
		cities1.add("Mangalore");
		cities1.add("Karwar");
		cities1.add("Madikeri");
		
		//adding one TreeSet object to already existing one
		cities.addAll(cities1);
		System.out.println("-------------------------- Adding one TreeSet object to an already existing TreeSet object ------------------");
		for (String city: cities) {
			System.out.println(city);
		}
	}
}
