//---- this is for PROTECTED access modifier ----

package coreJavaTopics.encapsulation.package1;

public class Protected_P1_Test3 {

	public static void main(String[] args) {
		
		Protected_RetailCustomerCreditLimit limit = new Protected_RetailCustomerCreditLimit();
		//as we have declared the method as protected, it can be called within the same package
		limit.displayCreditLimit();
	}

}
