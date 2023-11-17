package coreJavaTopics.abstraction.multipleInheritanceWithInterface.problemWithClasses;

//extending multiple classes causes ambiguity if those parent classes have the same method
//hence multiple inheritance isn't possible with classes in Java
//public class C extends A,B{
public class C extends A{

	public static void main(String[] args) {
		C c = new C();
		c.method();
	}

}
