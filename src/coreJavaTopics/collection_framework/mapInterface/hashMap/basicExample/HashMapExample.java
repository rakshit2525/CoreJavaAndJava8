package coreJavaTopics.collection_framework.mapInterface.hashMap.basicExample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		//create the object of HashMap
		HashMap<String, String> mapObject = new HashMap<String, String>();
		mapObject.put("name1", "Rohit");
		mapObject.put("name2", "Gill");
		mapObject.put("name3", "Kohli");
		mapObject.put("name4", "Shreyas");
		mapObject.put("name5", "Rahul");
		mapObject.put(null, "Hardik");
		mapObject.put("name6", null);
		mapObject.put("name7", null);
		mapObject.put("name4", "SKY");  //it overwrites the previous value
		mapObject.put(null, "Jadeja");	//it overwrites the previous value
		
		//cannot use Iterator directly on to the map
		//to retrieve the data from map object
		//since it contains key and value pair we need to use Entry
		for(Map.Entry<String, String> obj: mapObject.entrySet()) {
			System.out.println("Key: " + obj.getKey() + " || " + "Value: " + obj.getValue());
		}
		System.out.println("");
		
		System.out.println("Is the Key present: " + mapObject.containsKey("name5"));
		System.out.println("");
		
		System.out.println("Is the Value present: " + mapObject.containsValue("Kohli"));
		System.out.println("");
		
		System.out.println("The value of specified key is: " + mapObject.get("name3"));
		System.out.println("");
		
		HashMap<String, String> mapObject1 = new HashMap<String, String>();
		mapObject1.put("name8", "Siraj");
		mapObject1.put("name9", "Shami");
		mapObject1.put("name10", "Shardul");
		mapObject1.put("name11", "Kuldeep");
		
		mapObject.putAll(mapObject1);
		System.out.println("------------------------- Adding a new mapObject to already existing mapObject ------------------------");
		for(Map.Entry<String, String> obj: mapObject.entrySet()) {
			System.out.println("Key: " + obj.getKey() + " || " + "Value: " + obj.getValue());
		}
		System.out.println("");
	}
	
	
}
