package coreJavaTopics.collection_framework.mapInterface.linkedHashMap.basicExample;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Integer> mapObject = new LinkedHashMap<Integer, Integer>();
		mapObject.put(1, 10);
		mapObject.put(2, 20);
		mapObject.put(3, 30);
		mapObject.put(4, 40);
		mapObject.put(5, 50);
		mapObject.put(null, 60);
		mapObject.put(6, null);
		mapObject.put(7, null);
		mapObject.put(7, 70);
		
		for(Map.Entry<Integer, Integer> obj : mapObject.entrySet()) {
			System.out.println("Key: " + obj.getKey() + " || Value: " + obj.getValue());
		}
		
		LinkedHashMap<Integer, Integer> mapObject1 = new LinkedHashMap<Integer, Integer>();
		mapObject1.put(8, 80);
		mapObject1.put(9, 90);
		mapObject.put(10, 100);
		
		//adding the new mapObject1 to existing mapObject
		mapObject.putAll(mapObject1);
		System.out.println("------------------------ adding the new object --------------------------");
		for(Map.Entry<Integer, Integer> obj : mapObject.entrySet()) {
			System.out.println("Key: " + obj.getKey() + " || Value: " + obj.getValue());
		}
		
		System.out.println("Is the Key Present: " + mapObject.containsKey(7));
		System.out.println("Get the value based on Key: " + mapObject.get(9));
		
		//if the key is not present
		mapObject.putIfAbsent(11, 110);
		System.out.println("--------------------- if the key is not present --------------------------");
		for(Map.Entry<Integer, Integer> obj : mapObject.entrySet()) {
			System.out.println("Key: " + obj.getKey() + " || Value: " + obj.getValue());
		}
		
		System.out.println("Is the map object empty: " + mapObject.isEmpty());
		
		//removing the object from mapObject
		mapObject.remove(7);
		System.out.println("--------------------- after removing the key--------------------------");
		for(Map.Entry<Integer, Integer> obj : mapObject.entrySet()) {
			System.out.println("Key: " + obj.getKey() + " || Value: " + obj.getValue());
		}
		
	}
	
}
