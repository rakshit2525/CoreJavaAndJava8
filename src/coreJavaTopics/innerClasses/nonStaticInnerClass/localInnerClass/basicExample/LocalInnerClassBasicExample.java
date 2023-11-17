package coreJavaTopics.innerClasses.nonStaticInnerClass.localInnerClass.basicExample;

public class LocalInnerClassBasicExample {
	
	private int number = 456;
	private String name = "John";
	
	//declaring the method
	public void displayInfo() {
		//class declared inside the method
		class LocalInnerClass {
			public void display() {
				System.out.println("The number is: " + number);
				System.out.println("Name is " + name);
			}
		}
		
		//this below instantiation/object creation is to invoke the method of inner class
		//the object must be instantiated inside the method in which it is declared/created
		LocalInnerClass inner = new LocalInnerClass();
		inner.display();
	}
	
	public static void main(String[] args) {
		//this below instantiation/object creation is to invoke the method of outer class
		LocalInnerClassBasicExample outer = new LocalInnerClassBasicExample();
		outer.displayInfo();
	}
}
