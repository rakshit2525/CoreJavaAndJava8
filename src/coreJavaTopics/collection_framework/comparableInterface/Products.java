package coreJavaTopics.collection_framework.comparableInterface;

public class Products implements Comparable<Products>{

	long product_id;
	String product_name;
	String product_description;
	double product_price;
	
	
	public Products(long product_id, String product_name, String product_description, double product_price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_description = product_description;
		this.product_price = product_price;
	}


	//for low to high and if we want high to low interchange 
	//the greater and lower signs between if and else if
	@Override
	public int compareTo(Products prod) {
		if(product_price > prod.product_price)
			return 1;
		else if(product_price < prod.product_price)
			return -1;
		else
			return 0;
	}


	@Override
	public String toString() {
		return "Products [product_id=" + product_id + ", product_name=" + product_name + ", product_description="
				+ product_description + ", product_price=" + product_price + "]";
	}
	
}
