package coreJavaTopics.collection_framework.mapInterface.hashMap.realtimeExample.example1;

import java.util.HashMap;
import java.util.Map;

public class AmazonApp {

	public static void main(String[] args) {
		
		ProductDetails prod1 = new ProductDetails(1111l, "Samsung S21", "Good OS", 50000.0d);
		ProductDetails prod2 = new ProductDetails(2222l, "Samsung S22", "Good Resolution", 70000.0d);
		ProductDetails prod3 = new ProductDetails(3333l, "Samsung S23", "Good Camera", 90000.0d);
		
		Map<Long, ProductDetails> mapSamsung = new HashMap<Long, ProductDetails>();
		mapSamsung.put(101010l, prod1);
		mapSamsung.put(202020l, prod2);
		mapSamsung.put(303030l, prod3);
		
		
		ProductDetails prod4 = new ProductDetails(4444l, "iPhone 12", "Good OS", 70000.0d);
		ProductDetails prod5 = new ProductDetails(5555l, "iPhone 13", "Good Resolution", 90000.0d);
		ProductDetails prod6 = new ProductDetails(6666l, "iPhone 14", "Good Camera", 120000.0d);
		
		Map<Long, ProductDetails> mapApple = new HashMap<Long, ProductDetails>();
		mapApple.put(404040l, prod4);
		mapApple.put(505050l, prod5);
		mapApple.put(606060l, prod6);
		
		
		ProductDetails prod7 = new ProductDetails(4444l, "OnePlus 9", "Good OS", 30000.0d);
		ProductDetails prod8 = new ProductDetails(5555l, "OnePlus 10", "Good Resolution", 40000.0d);
		ProductDetails prod9 = new ProductDetails(6666l, "OnePlus 11", "Good Camera",50000.0d);
		
		Map<Long, ProductDetails> mapOnePlus = new HashMap<Long, ProductDetails>();
		mapOnePlus.put(707070l, prod7);
		mapOnePlus.put(808080l, prod8);
		mapOnePlus.put(909090l, prod9);
		
		Map<String, Map<Long, ProductDetails>> productMap = new HashMap<String, Map<Long, ProductDetails>>();
		productMap.put("Samsung", mapSamsung);
		productMap.put("Apple", mapApple);
		productMap.put("OnePlus", mapOnePlus);
		
		
		//displaying details
		for(Map.Entry<String, Map<Long, ProductDetails>> map : productMap.entrySet()) {
			System.out.println("Product Name: " + map.getKey() + " || Values: " + map.getValue());
		}
	}
}
