package coreJavaTopics.exceptionHandling.tryCatchBlock;

public class ExceptionExample1 {

	public static void main(String[] args) {
		
		//this below code gives an ArrayOutOfBoundsException and breaks  
		//the flow of program at line number 14
		/*
		System.out.println("Important Code1.....");
		System.out.println("Important Code2.....");
		
		int arr[] = {5, 69, 35, 45};
		System.out.println("The element value : " + arr[5]);
		
		System.out.println("Important Code3.....");
		System.out.println("Important Code4.....");
		*/
		
		
		System.out.println("Important Code1.....");
		System.out.println("Important Code2.....");
		
		try {
		int arr[] = {5, 69, 35, 45};
		System.out.println("The element value : " + arr[5]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Important Code3.....");
		System.out.println("Important Code4.....");
	}
}
