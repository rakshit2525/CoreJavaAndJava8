package designPatterns.structuralDesignPattern.facadeDesignPattern;

public class Samsung implements SmartPhones{

	@Override
	public void productId() {
		System.out.println("Product ID: 84596521");
	}

	@Override
	public void productName() {
		System.out.println("Product Name: Samsung S23");
	}

	@Override
	public void productPrice() {
		System.out.println("Product Price: 89,999");
	}

	@Override
	public void productDesc() {
		System.out.println("Flagship SmartPhone");
	}
}
