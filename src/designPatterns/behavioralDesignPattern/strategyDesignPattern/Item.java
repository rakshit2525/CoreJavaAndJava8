package designPatterns.behavioralDesignPattern.strategyDesignPattern;

public class Item {

	private String itemCode;
	private double itemPrice;
	
	public Item(String itemCode, double itemPrice) {
		super();
		this.itemCode = itemCode;
		this.itemPrice = itemPrice;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
}
