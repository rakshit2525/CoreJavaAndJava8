package coreJavaTopics.exceptionHandling.methodOverriding;

public class B extends A{

	//it(child class method) can't declare checked exception since the parent method has not declared an exception
	/*
	public void method() throws FileNotFoundException{
		System.out.println("This is method of class B");
	}
	*/
	
	//it(child class method) can declare unchecked exception since the parent method has not declared an exception
	public void method() throws NullPointerException{
		System.out.println("This is method of class B");
	}
	
	/*child class method throws same exception as parent class method,
	 *sub class exception or not exception but cannot declare parent exception
	 */
	//public void method1() throws NullPointerException{
	//public void method1() throws ArrayIndexOutOfBoundsException{
	//public void method1() throws Exception{
	public void method1() {
		System.out.println("This is method of class B");
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.method();
	}
}
