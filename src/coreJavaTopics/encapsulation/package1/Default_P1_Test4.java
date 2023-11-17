//---- this is for DEFAULT access modifier -------

package coreJavaTopics.encapsulation.package1;

public class Default_P1_Test4 {
	
	public static void main(String[] args) {
		Default_Employee emp = new Default_Employee();
		//since the below method is declared as default, it can be accessed
		//within the package
		emp.displayEmpInfo();
	}
}
