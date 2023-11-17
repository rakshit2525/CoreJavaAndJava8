//---- this is for PROTECTED access modifier ----

package coreJavaTopics.encapsulation.package2;

import coreJavaTopics.encapsulation.package1.Protected_RetailCustomerCreditLimit;

public class Protected_P2_Test3 extends Protected_RetailCustomerCreditLimit{

	public static void main(String[] args) {
		
		Protected_P2_Test3 test = new Protected_P2_Test3();
		//as we have declared the method as protected, 
		//it can be called outside package by sub class
		test.displayCreditLimit();
		
		
		//here are we are directly creating the object of parent class
		//it is similar to calling the method from outside the class
		//hence it gives an error as protected cannot be accessed outside the class 
		/*
		 * RetailCustomerCreditLimit limit = new RetailCustomerCreditLimit();
		 * limit.displayCreditLimit();
		 */
	}

}
