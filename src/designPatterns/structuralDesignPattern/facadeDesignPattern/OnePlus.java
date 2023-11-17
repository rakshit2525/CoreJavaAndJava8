package designPatterns.structuralDesignPattern.facadeDesignPattern;

public class OnePlus implements SmartPhones{

	@Override
	public void productId() {
		System.out.println("Product ID: 32547896");
	}

	@Override
	public void productName() {
		System.out.println("Product Name: OnePlus 11R");
	}

	@Override
	public void productPrice() {
		System.out.println("Product Price: 69,999");
	}

	@Override
	public void productDesc() {
		System.out.println("Affordable SmartPhone");
	}
}
