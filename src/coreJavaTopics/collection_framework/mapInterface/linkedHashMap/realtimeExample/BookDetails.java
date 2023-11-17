package coreJavaTopics.collection_framework.mapInterface.linkedHashMap.realtimeExample;

import java.util.LinkedHashMap;
import java.util.Map;

public class BookDetails {

	public static void main(String[] args) {
		
		Books book1 = new Books(958541257l, "Programming With Java", "This is 6th Edition", 599.0d);
		Books book2 = new Books(665247832l, "Java for Web Development", "Learn Web development with Java", 782.0d);
		Books book3 = new Books(458796651l, "Head First Java", "A Brain friendly Guide", 450.0d);
		Books book4 = new Books(963258741l, "Java from Zero", "From Beginners to Professionals", 750.0d);
		
		LinkedHashMap<Long, Books> mapObject = new LinkedHashMap<Long, Books>();
		mapObject.put(958541257l, book1);
		mapObject.put(665247832l, book2);
		mapObject.put(458796651l, book3);
		mapObject.put(963258741l, book4);
		
		//traversing key and value from the mapObject
		for(Map.Entry<Long, Books> obj : mapObject.entrySet()) {
			long isbn_number = obj.getKey();
			Books book = obj.getValue();
			System.out.println("ISBN Number: " + isbn_number);
			System.out.println("Isbn Number: " + book.getIsbn_number() + " Book Name: " + book.getBook_name() + 
					" Description: " + book.getBook_description() + " Price: " + book.getBook_price());
		}
		
	}
}
