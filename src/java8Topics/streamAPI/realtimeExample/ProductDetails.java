package java8Topics.streamAPI.realtimeExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductDetails {
	
	private static List<Products> productList = new ArrayList<Products>();
	
	public static void main(String[] args) {
		
		productList.add(new Products(5500111l, "Iphone 14", "Flagship Processor", 70000.0d));
		productList.add(new Products(5500121l, "OnePlus 11R", "Premium Budget Phone", 59000.0d));
		productList.add(new Products(5500131l, "Samsung S23 Ultra", "Flagship Camera", 150000.0d));
		productList.add(new Products(5500141l, "Moto Razr 40", "Good Build Quality", 40000.0d));
		productList.add(new Products(5500151l, "Mi 5a TV", "Best Budget TV", 24000.0d));
		productList.add(new Products(5500161l, "OnePlus TV", "Good Display", 40000.0d));
		productList.add(new Products(5500171l, "Samsung TV", "Premium TV", 90000.0d));
		productList.add(new Products(5500811l, "Sony Bravia", "Premium Budget TV", 59000.0d));
		
		System.out.println("------------------- Sorting without using Stream APi ---------------------");
		withoutStreamAPI();
		System.out.println();
		
		System.out.println("------------------- Using Stream API to display the prices of products greater than 450000.0 ---------------------");
		withStreamAPI();
		System.out.println();
		
		System.out.println("-------------------- Using Stream API to display the sum of all the products price --------------------------");
		Double sumTotal = productList.stream()
				.collect(Collectors.summingDouble((product) -> product.getProd_price()));
		System.out.println("Sum of prices of products - " + sumTotal);
		System.out.println();
		
		System.out.println("-------------------- Using Stream API to display the sum of all the products whose price is greater than 45000.0 --------------------------");
		Double sumTotal1 = productList.stream()
				.filter((product) -> product.getProd_price() > 45000.0)
				//.map((product) -> product.getProd_price()) //this line gives an error
				.collect(Collectors.summingDouble((product) -> product.getProd_price()));
		System.out.println("Sum - " + sumTotal1);
		System.out.println();
		
		System.out.println("--------------------------- Using Stream API to get the max price from the product list --------------------------------");
		Products maxPrice = productList.stream()
				.max((product1, product2) -> product1.getProd_price() > product2.getProd_price() ? 1 : -1)
				.get();
		System.out.println("Maximum price of a product- " + maxPrice);
		System.out.println();
		
		System.out.println("--------------------------- Using Stream API to get the min price from the product list --------------------------------");
		Products minPrice = productList.stream()
				.min((product1, product2) -> product1.getProd_price() > product2.getProd_price() ? 1 : -1)
				.get();
		System.out.println("Minimum price of a product- " + minPrice);
		System.out.println();
		
		System.out.println("-------------------- Using Stream API to get products with unique price greater than 18000.0 -------------------------");
		Set<Double> uniquePrice = productList.stream()
				.filter((product) -> product.getProd_price() > 18000.0)
				.map((product) -> product.getProd_price())
				.collect(Collectors.toSet());
		System.out.println(uniquePrice);
		System.out.println();
		
		System.out.println("---------------- Using Stream API to convert List to Map with id as key and price as value ----------------------");
		Map<Long, Double> mapObj = productList.stream()
				.collect(Collectors.toMap(prod -> prod.getProd_id(), prod -> prod.getProd_price()));
		System.out.println(mapObj);
	}
	
	//sorting based on prices without using StreamAPI
	private static void withoutStreamAPI() {
		for(Products prod : productList) {
			if (prod.getProd_price() > 45000.0) {
				System.out.println(prod.getProd_name() + " - " + prod.getProd_price());
			}
		}
	}
	
	private static void withStreamAPI() {
		List<Double> prodPriceList = productList.stream()
				.filter((prod) -> prod.getProd_price() > 45000.0)
				.map((product) -> product.getProd_price())
				.collect(Collectors.toList());
		System.out.println(prodPriceList);
	}
	
}
