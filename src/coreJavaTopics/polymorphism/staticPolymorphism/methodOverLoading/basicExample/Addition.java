package coreJavaTopics.polymorphism.staticPolymorphism.methodOverLoading.basicExample;

public class Addition {
	
	//method overloading by changing the data type 
	static double add(int a, double b) {
		return a + b;
	}
	
	//method overloading by changing the number of parameters
	static int add(int a, int b) {
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	static int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	
	public static void main(String[] args) {
		System.out.println("Addition of 2 numbers: " + Addition.add(10, 20.0d));
		System.out.println("Addition of 2 numbers: " + Addition.add(10, 20));
		System.out.println("Addition of 3 numbers: " + Addition.add(10, 20, 30));
		System.out.println("Addition of 4 numbers: " + Addition.add(10, 20, 30, 40));
	}
}
