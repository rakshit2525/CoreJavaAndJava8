package java8Topics.staticAndDefault.basicExample;

public interface A {

	public void method1();
	
	/*
	this is a new requirement
	we need to override this below method in every class that implements the interface
	even if it's needed or not, or else it'll throw compilation error
	to overcome this we use static and default method
	*/
	
	//public void method2();
}
