package coreJavaTopics.exceptionHandling.nestedTryBlock;

public class NestedTryBlockExample {

	public static void main(String[] args) {
		
		System.out.println("Important Code1.....");
		
		//outer try block
		try {
			
			//inner try block
			try {
				System.out.println("Want to divide a number");
				int number = 45/0;
				System.out.println("Number: " + number);
			} catch (ArithmeticException ae) {
				ae.printStackTrace();
			}
			
			//another nested try block
			try {
				System.out.println("Get the element of specific index");
				int arr[] = {45, 69, 89, 79};
				System.out.println("The element at specific index: " + arr[6]);
 			} catch (ArrayIndexOutOfBoundsException aie) {
 				aie.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Important Code1.....");
	}
}
