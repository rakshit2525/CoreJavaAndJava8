package designPatterns.behavioralDesignPattern.strategyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	List<Item> items;
	
	public ShoppingCart() {
		this.items = new ArrayList<Item>();
	}
	
	public void addProducts(Item item) {
		this.items.add(item);
	}
	
	public void removeProduct(Item item) {
		this.items.remove(item);
	}
	
	public double calculateSubTotal() {
		double sum = 0;
		for(Item product : items) {
			sum += product.getItemPrice();
		}
		return sum;
	}
	
	public void pay(PaymentMethod payment) {
		double amount = calculateSubTotal();
		payment.makePayment(amount);
	}
}

