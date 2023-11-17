package coreJavaTopics.polymorphism.superKeyword;

public class A extends IMPSTransfer{

	public A() {
		//the super() here invokes the constructor from immediate parent class
		super();
		System.out.println("This is the constructor of class A");
		System.out.println("");
	}

	public void checkingPIN() {
		super.method1();
		System.out.println("PIN Number: " + super.pin_number);
	}
	
	public static void main(String[] args) {
		
		// here when we create an object of the Child class A, constructors 
		//of all three classes are invoked in the order of the inheritance hierarchy
		A pin = new A();
		pin.checkingPIN();
	}
}
