// ---- this is for PRIVATE access modifier -----

package coreJavaTopics.encapsulation.package1;

public class Private_P1_Test2 {

	public static void main(String[] args) {

		Private_WholesaleGTRFAccount account = new Private_WholesaleGTRFAccount();
		
		//even though the below method is inside the same package
		//it cannot be called because it is declared as private
		//account.displayGTRFInfo();
	}

}
