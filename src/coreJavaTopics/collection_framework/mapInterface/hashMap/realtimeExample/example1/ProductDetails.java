package coreJavaTopics.collection_framework.mapInterface.hashMap.realtimeExample.example1;

public class ProductDetails {

	long product_id;
	String product_name;
	String product_description;
	double product_price;
	
	public ProductDetails(long product_id, String product_name, String product_description, double product_price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_description = product_description;
		this.product_price = product_price;
	}

	@Override
	public String toString() {
		return "ProductDetails [product_id=" + product_id + ", product_name=" + product_name + ", product_description="
				+ product_description + ", product_price=" + product_price + "]";
	}
	
}
