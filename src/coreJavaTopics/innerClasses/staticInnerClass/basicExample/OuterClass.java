package coreJavaTopics.innerClasses.staticInnerClass.basicExample;

public class OuterClass {
	
	static long number = 964548351358l;
	
	static class InnerClass {
		
		static void displayNum() {
			System.out.println("The number is: " + number);
		}
	}
	
	public static void main(String[] args) {
		
		/*
		OuterClass.InnerClass obj = new OuterClass.InnerClass();
		obj.displayNum();
		*/
		OuterClass.InnerClass.displayNum();
	}
}
