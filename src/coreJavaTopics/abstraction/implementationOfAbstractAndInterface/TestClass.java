package coreJavaTopics.abstraction.implementationOfAbstractAndInterface;

//here from interface it is must to implement every method, but if we want to 
//exclude any method from being implemented into this class  we need to declare it as abstract
public abstract class TestClass implements ITestInterface{

	@Override
	public void method1() {
		System.out.println("This is method 1");
	}

	@Override
	public void method3() {
		System.out.println("This is method 3");
	}

	@Override
	public void method4() {
		System.out.println("This is method 4");
	}

}
