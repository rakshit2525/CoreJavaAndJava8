package coreJavaTopics.exceptionHandling.finalFinallyFinalize;

public final class ExampleCode {
	
	final long cc_num = 985614756635l;
	
	final void displayCCNum() {
		System.out.println("Credit Card Number: " + cc_num);
	}
	
	//final variable cannot be changed 
	/*
	void changeCC() {
		cc_num = 85467155661654l;
	}
	*/
	
	
	
	public static void main(String[] args) {
		
		try {
			System.out.println("This is try block....");
		} finally {
			System.out.println("This will always gets executed");
		}
		
		
		ExampleCode exm = new ExampleCode();
		
		System.out.println("Hash Code of the object: " + exm.hashCode());
		
		//making the object null which becomes used and hence we call garbage collection to remove it
		exm = null;
		System.gc();
		System.out.println("End of garbage collection....");
		
		//the below line throws NullPointerException because since the object (exm) is removed
		// using garbage collection there won't be an object
		exm.displayCCNum();
	}
	
	protected void finalize() {
		System.out.println("Called the finalize() method....");
	}
}
