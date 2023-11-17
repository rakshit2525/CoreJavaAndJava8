package designPatterns.structuralDesignPattern.facadeDesignPattern;

public class IPhone implements SmartPhones{

	@Override
	public void productId() {
		System.out.println("Product ID: 66589745");
	}

	@Override
	public void productName() {
		System.out.println("Product Name: IPhone 15");
	}

	@Override
	public void productPrice() {
		System.out.println("Product Price: 99,999");
	}

	@Override
	public void productDesc() {
		System.out.println("Premium SmartPhone");
	}
	

}
