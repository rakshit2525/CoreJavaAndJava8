package coreJavaTopics.abstraction.abstractClass.abstractClassExample1;

public class MainApp {

	public static void main(String[] args) {
		
		MyClass add = new Addition();
		MyClass sub = new Substraction();
		
		add.calculate(20, 30);
		sub.calculate(50, 25);
	}

}
