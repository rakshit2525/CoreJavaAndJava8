package designPatterns.behavioralDesignPattern.strategyDesignPattern;

public class AmazonApp {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item samsung = new Item("Samsung855", 50000.0d);
		Item onePlus = new Item("onePlus526", 40000.0d);
		
		cart.addProducts(samsung);
		cart.addProducts(onePlus);
		
		//making payment through credit/debit card
		cart.pay(new CreditCardOrDebitCardPayment(996528741l, "Ramesh", "20-12-2024", 632));
		
		//making payment thorugh UPI
		//cart.pay(new UPIPayment(554121846));
		
		//making payment through netbanking
		//cart.pay(new NetBanking(63254187, "Santosh", "Mysore Branch", 60000.0d));
	}
}
