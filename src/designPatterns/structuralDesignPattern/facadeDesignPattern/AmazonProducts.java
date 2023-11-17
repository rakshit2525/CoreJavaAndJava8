package designPatterns.structuralDesignPattern.facadeDesignPattern;

public class AmazonProducts {

	private SmartPhones iPhone;
	private SmartPhones samsung;
	private SmartPhones onePlus;
	
	public AmazonProducts() {
		iPhone = new IPhone();
		samsung = new Samsung();
		onePlus = new OnePlus();
	}
	
	public void getOnePlus() {
		onePlus.productId();
		onePlus.productName();
		onePlus.productDesc();
		onePlus.productPrice();
	}
	
	public void getIPhone() {
		iPhone.productId();
		iPhone.productName();
		iPhone.productDesc();
		iPhone.productPrice();
	}
	
	public void getSamsung() {
		samsung.productId();
		samsung.productName();
		samsung.productDesc();
		samsung.productPrice();
	}
}

