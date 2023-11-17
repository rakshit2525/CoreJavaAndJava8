package coreJavaTopics.collection_framework.mapInterface.treeMap.basicExample;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> mapObject = new TreeMap<Integer, String>();
		mapObject.put(1, "Rohit");
		mapObject.put(4, "Shreyas");
		mapObject.put(5, "Hardik");
		mapObject.put(2, "Ishan");
		mapObject.put(3, "Kohli");
		//mapObject.put(null, "Shardul"); //gives NullPointerException
		mapObject.put(7, null);
		mapObject.put(6, "Jadeja");
		mapObject.put(8, null);
		
		for(Map.Entry<Integer, String> obj: mapObject.entrySet()) {
			System.out.println("Key: " + obj.getKey() + " || Value: " + obj.getValue());
		}
		
		System.out.println("The First key is: " + mapObject.firstKey());
	}
}
