package coreJavaTopics.abstraction.abstractClass.problemWithoutAbstraction;

public class MyClass {

	/*
	 * public void calculate(int a, int b) { 
	 * int c = a + b;
	 * System.out.println("Addition of 2 numbers: " + c); }
	 */
	
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("Addition of 2 numbers: " + c);
	}
	
	public void sub(int a, int b) {
		int c = a - b;
		System.out.println("Substraction of 2 numbers: " + c);
	}
	
	public void mul(int a, int b) {
		int c = a * b;
		System.out.println("Multiplication of 2 numbers: " + c);
	}
	
	public void div(int a, int b) {
		int c = a / b;
		System.out.println("Division of 2 numbers: " + c);
	}
	
	public static void main(String[] args) {
		
		//here the client wants each object to access only one method in particular
		//but here every object can access all the methods
		MyClass obj1 = new MyClass();
		MyClass obj2 = new MyClass();
		MyClass obj3 = new MyClass();
		MyClass obj4 = new MyClass();
		
		obj1.add(20, 30);
		obj1.sub(50, 25);
		obj1.mul(5, 10);
		obj1.div(100, 2);
		
		/*
		 * obj1.calculate(60, 90); 
		 * obj2.calculate(10, 40); 
		 * obj3.calculate(20, 80);
		 */
		
		
	}
}
