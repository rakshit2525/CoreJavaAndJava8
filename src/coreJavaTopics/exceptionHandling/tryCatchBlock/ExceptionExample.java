package coreJavaTopics.exceptionHandling.tryCatchBlock;

public class ExceptionExample {

	public static void main(String[] args) {
		
		//this below code gives an ArithematicException and breaks  
		//the flow of program at line number 12
		/*
		System.out.println("Important Code1.....");
		System.out.println("Important Code2.....");
		int number = 55/0;
		System.out.println("The value is : " + number);
		System.out.println("Important Code3.....");
		System.out.println("Important Code4.....");
		*/
		
		
		System.out.println("Important Code1.....");
		System.out.println("Important Code2.....");
		try {
		int number = 55/0;
		System.out.println("The value is : " + number);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Important Code3.....");
		System.out.println("Important Code4.....");
	}
}
