package coreJavaTopics.exceptionHandling.finallyBlock;

public class FinallyExample1 {

	public static void main(String[] args) {
		
		//even though we have arithmetic exception we are not handling it
		//instead we are handling null pointer exception, but still the finally 
		//block gets executed
		/*
		try {
			int num = 50/0;
			System.out.println("The number is: " + num);
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		} finally {
			System.out.println("Finally block will always gets executed.....");
		}
		*/
		
		//here we are handling arithmetic exception and still the 
		//finally block gets executed
		try {
			int num = 50/0;
			System.out.println("The number is: " + num);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} finally {
			System.out.println("Finally block will always gets executed.....");
		}
	}
}
