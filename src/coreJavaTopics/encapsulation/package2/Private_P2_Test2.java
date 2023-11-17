// ---- this is for PRIVATE access modifier -----

package coreJavaTopics.encapsulation.package2;

import coreJavaTopics.encapsulation.package1.Private_WholesaleGTRFAccount;

public class Private_P2_Test2 extends Private_WholesaleGTRFAccount{

	public static void main(String[] args) {
		Private_P2_Test2 account = new Private_P2_Test2();
		//even after importing the class and extending it 
		//i.e., outside the package and outside the package by sub class
		//the below method cannot be called as it is declared private
		//account.displayGTRFInfo();
	}

}
