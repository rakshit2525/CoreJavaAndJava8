package coreJavaTopics.exceptionHandling.methodOverriding;

public class A {
	
	//for rule 1
	public void method() {
		System.out.println("This is method of class A");
	}
	
	//for rule 2
	public void method1() throws NullPointerException{
		System.out.println("This is method of class A");
	}
}
