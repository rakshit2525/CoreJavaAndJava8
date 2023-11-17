//---- this is for DEFAULT access modifier -------

package coreJavaTopics.encapsulation.package2;

import coreJavaTopics.encapsulation.package1.Default_Employee;

public class Default_P2_Test4 extends Default_Employee{

	Default_P2_Test4 test = new Default_P2_Test4();
	//below method cannot be accessed because the method is declared 
	//as default which cannot be accessed outside the package by subclass
	//test.displayEmpInfo();
	
	
	//here are we are directly creating the object of parent class it is 
	//similar to calling the method from outside the class hence it gives an  
	//error as default access modifier cannot be accessed outside the class
	/*
	 * Default_Employee emp = new Default_Employee(); 
	 * emp.displayEmpInfo();
	 */
}
