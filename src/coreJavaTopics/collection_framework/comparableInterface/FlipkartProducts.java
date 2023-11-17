package coreJavaTopics.collection_framework.comparableInterface;

import java.util.ArrayList;
import java.util.Collections;

public class FlipkartProducts {

	public static void main(String[] args) {
		
		ArrayList<Products> prodList = new ArrayList<Products>();
		prodList.add(new Products(603022551l, "SAMSUNG Galaxy Z Fold5", "Cream, 512 GB, 12 GB RAM", 164999.0d));
		prodList.add(new Products(905044882l, "SAMSUNG Galaxy S23 Ultra 5G", "Green, 1 TB, 12 GB RAM", 154999.0d));
		prodList.add(new Products(409033773l, "SAMSUNG Galaxy Z Fold5", "Phantom Black, 512 GB, 12 GB RAM", 164999.0d));
		prodList.add(new Products(201000444l, "SAMSUNG Galaxy Z Flip5 ", "Lavender, 512 GB, 8 GB RAM", 109999.0d));
		prodList.add(new Products(807055995l, "SAMSUNG Galaxy S23 Plus 5G", "Bora Purple, 256 GB, 8 GB RAM", 104999.0d));
		prodList.add(new Products(108077666l, "SAMSUNG Galaxy S23 FE 5G", "Lavender, 512 GB, 12 GB RAM", 79999.0d));
		
		//to make use of the compareTo(Object obj) method 
		//to call Collections.sort()
		Collections.sort(prodList);
		for(Products prod: prodList) {
			System.out.println(prod);
		}
	}

}
