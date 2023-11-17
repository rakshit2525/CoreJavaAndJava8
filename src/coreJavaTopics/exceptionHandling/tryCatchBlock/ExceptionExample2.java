package coreJavaTopics.exceptionHandling.tryCatchBlock;

public class ExceptionExample2 {

	public static void main(String[] args) {
		
		//this below code gives a NullPoniterException and breaks  
		//the flow of program at line number 14
		/*
		System.out.println("Important Code1.....");
		System.out.println("Important Code2.....");
		
		String name = "";
		System.out.println("Length of the name: " + name.length());
		
		System.out.println("Important Code3.....");
		System.out.println("Important Code4.....");
		*/
		
		System.out.println("Important Code1.....");
		System.out.println("Important Code2.....");
		
		try {
		String name = "";
		System.out.println("Length of the name: " + name.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Important Code3.....");
		System.out.println("Important Code4.....");
	}
}
