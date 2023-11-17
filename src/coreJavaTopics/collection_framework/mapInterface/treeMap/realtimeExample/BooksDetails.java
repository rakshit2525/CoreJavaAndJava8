package coreJavaTopics.collection_framework.mapInterface.treeMap.realtimeExample;

import java.util.Map;
import java.util.TreeMap;

public class BooksDetails {

	public static void main(String[] args) {
		
		Books book1 = new Books(9355325347l, "M Laxmikanth", "Indian Polity for UPSC", 669.0d);
		Books book2 = new Books(9841237814l, "PMF IAS", "PMF IAS Environment for UPSC", 449.0d);
		Books book3 = new Books(9355325924l, "Nitin Singhania", "Indian Art And Culture for UPSC", 659.0d);
		Books book4 = new Books(8119361229l, "Sanjiv Verma", "The Indian Economy", 349.0d);
		Books book5 = new Books(9391050840l, "Oxford University Press", "Oxford Student Atlas for India", 304.0d);
		
		//creating a TreeMap object and adding publisher_name as key and Books object as value
		TreeMap<String, Books> mapBooks = new TreeMap<String, Books>();
		mapBooks.put("McGraw Hill", book1);
		mapBooks.put("S. Chand Publishing", book2);
		mapBooks.put("McGraw Hill", book3); //this isn't displayed in the output as TreeMap doesn't allow duplicate keys
		mapBooks.put("Arihant Publication", book4);
		mapBooks.put("Random House India", book5);
		
		//this displays the books names based on the alphabetical order as TreeMap maintains ascending order
		for(Map.Entry<String, Books> obj: mapBooks.entrySet()) {
			String publication = obj.getKey();
			System.out.println("Name of the Publisher: " + publication);
			System.out.println(obj.getValue());
		}
		
	}

}
