package coreJavaTopics.abstraction.implementationOfAbstractAndInterface;

//since TestClass is abstract and its object cannot be created, we are creating another class 
//and we are creating the object here and providing the implementation for the remaining unimplemented methods here
public class Test extends TestClass{
	
	@Override
	public void method2() {
		System.out.println("This is method 2");
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.method1();
		test.method2();
		test.method3();
		test.method4();
	}

}
