package coreJavaTopics.collection_framework.listInterface.linkedList.basicExample;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		//creating the object of LinkedList class
		LinkedList<String> cityNames = new LinkedList<String>();
		cityNames.add("Bengaluru");
		cityNames.add("Mysuru");
		cityNames.add("Shivamogga");
		cityNames.add("Sakleshpura");
		cityNames.add("Udupi");
		cityNames.add("Mysuru");
		cityNames.add(null);
		
		Iterator<String> itr = cityNames.iterator();
		System.out.println("--------------------- Adding an element to LinedList object --------------------------");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//adding an element at start
		cityNames.addFirst("Beluru");
		Iterator<String> itr1 = cityNames.iterator();
		System.out.println("--------------------- Adding an element to LinedList object at first using addFirst() --------------------------");
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		//adding an element at last
		cityNames.addLast("Mangaluru");
		System.out.println("--------------------- Adding an element to LinedList object at last using addLast() --------------------------");
		for (String city: cityNames) {
			System.out.println(city);
		}
		
		//fetching the first element
		System.out.println("First city in the list is: " + cityNames.getFirst());
		
		//fetching the last element
		System.out.println("Last city in the list is: " + cityNames.getLast());
		
		//fetching an element of particular index
		System.out.println("Element of particular index: " + cityNames.get(3));
		
		//removing an element
		cityNames.remove("Beluru");
		System.out.println("--------------------- Removing an element to LinedList object  --------------------------");
		for (String city: cityNames) {
			System.out.println(city);
		}
	}
}
