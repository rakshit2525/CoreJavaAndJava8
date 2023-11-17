package coreJavaTopics.innerClasses.nonStaticInnerClass.memberInnerClass.basicExample;

public class A {
	
	private long number = 5698425137l;
	private String name = "Robert";
	
	class B {
		public void displayB() {
			System.out.println("--------- This is Member Inner Class --------------------");
			System.out.println("Number: " + number);
			System.out.println("Name: " + name);
		}
	}
	
	public void displayA() {
		System.out.println("This is outer class");
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		
		//since class B belongs to class A, hence if we want to create
		//the object of class B we have to use class A as reference and 
		//use dot operator to create the object
		A.B b = a.new B();
		b.displayB();
		
		a.displayA();
	}
}
