package coreJavaTopics.abstraction.abstractClass.abstractClassExample1;

public class Addition extends MyClass{
	
	@Override
	public void calculate(int a, int b) {
		int c = a + b;
		System.out.println("Addition of 2 numbers: " + c);
	}
}
