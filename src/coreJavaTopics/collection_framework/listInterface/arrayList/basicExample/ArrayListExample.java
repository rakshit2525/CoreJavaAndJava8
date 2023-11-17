package coreJavaTopics.collection_framework.listInterface.arrayList.basicExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//creating an object of ArrayList
		ArrayList<String> listOfNames = new ArrayList<String>(); 
		listOfNames.add("Kohli");
		listOfNames.add("Rohit");
		listOfNames.add("Ishan");
		listOfNames.add("Shreyas");
		listOfNames.add("Siraj");
		listOfNames.add("Jadeja");
		listOfNames.add("Shardul");
		listOfNames.add(null);
		
		//iterator to get the elements from the listOfNames object
		System.out.println("-------------------------- Fetching the string values listOfNames object using iterator() method ---------------------");
		Iterator<String> itr = listOfNames.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("");
		
		//creating an object of ArrayList with Double as Generic Type
		ArrayList<Double> doubleValues = new ArrayList<Double>(); 
		doubleValues.add(5.5d);
		doubleValues.add(3.1d);
		doubleValues.add(7.4d);
		doubleValues.add(8.08d);
		doubleValues.add(10.11d);
		
		//fetching the values using for-each loop
		System.out.println("------------------ Fetching the values from doubleValues object -----------------");
		for(Double numbers: doubleValues) {
			System.out.println(numbers);
		}
		System.out.println("");
		
		//adding the element to specific index
		listOfNames.add(2, "Rahul");
		System.out.println("------------------ Adding elements at the specific index -----------------");
		for(String names: listOfNames) {
			System.out.println(names);
		}
		System.out.println("");
		
		//creating new list object of string to add it to the existing object 
		ArrayList<String> listOfNewNames = new ArrayList<String>();
		listOfNewNames.add("Chahal");
		listOfNewNames.add("Ruturaj");
		listOfNewNames.add("Kuldeep");
		listOfNewNames.add("Shami");
		
		//adding the collection of new names to already existing list object and displaying it 
		listOfNames.addAll(listOfNewNames);
		System.out.println("------------------- Adding new Collection objects to already existing listOfNames ----------------");
		Iterator<String> itr1 = listOfNames.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("");
		
		//creating new list object of string
		ArrayList<String> listNames = new ArrayList<String>();
		listNames.add("Sanju");
		listNames.add("Hardik");
		listNames.add("Rishabh");
		listNames.add("Ashwin");
		listNames.add("Suryakumar");
		listNames.add("Suyash");
		System.out.println("----------------- Adding new Collection at specific index --------------------");
		//adding new collection object at specific index using addAll(int index, Collection c)
		listOfNames.addAll(8, listNames);
		for (String names: listOfNames) { 
			System.out.println(names);
		}
		System.out.println("");
		
		//to get the specific index value using get(int index) method
		System.out.println("Getting the values of index - 2: " + listOfNames.get(2));
		System.out.println("");
		
		//to remove an element of specific index
		System.out.println("------------------- Removing element of specific index using remove(int index) ---------------------");
		listOfNames.remove(2);
		for(String names: listOfNames) {
			System.out.println(names);
		}
		System.out.println("");
		
		//to remove an element from the list using remove(Object obj)
		listOfNames.remove("Hardik");
		System.out.println("---------------------- After using remove(Object obj) method to remove specific element ------------------------");
		Iterator<String> itr2 = listOfNames.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("");
		
		//to get the size of the list
		System.out.println("The size of the list is : " + listOfNames.size());
		System.out.println("");
		
		//to remove the complete object
		//listOfNames.clear();
		//System.out.println("The size of the list after using clear() method is : " + listOfNames.size());
		
		//to replace the old value with the new value
		listOfNames.set(7, "Shaw");
		System.out.println("------------------------- After replacing old value with new value using set(int index, Element e -----------------------");
		for(String names: listOfNames) {
			System.out.println(names);
		}
		System.out.println("");
		
		//to remove specific collection object from the listOfNames
		listOfNames.removeAll(listNames);
		System.out.println("-------------------------- After removing the specified collection object from the list ------------------------");
		for (String names: listOfNames) {
			System.out.println(names);
		}
		System.out.println("");
		
		//contains() method find whether the element is present in the list or not and returns boolean value
		System.out.println("Is the mentioned name present in the list - " + listOfNames.contains("Jadeja"));
	}
}
