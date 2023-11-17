//---- this is for DEFAULT access modifier -------

package coreJavaTopics.encapsulation.package1;

public class Default_Employee {

	long emp_ID = 55985l;
	String emp_name = "Vinith";
	String company_name = "HCL";
	String address = "Prestige Towers";
	String location = "Electronic City";
	String city = "Bengaluru";
	
	void displayEmpInfo() {
		System.out.println("Employee ID: " + emp_ID);
		System.out.println("Employee Name: " + emp_name);
		System.out.println("Company Name: " + company_name);
		System.out.println("Address: " + address);
		System.out.println("Location: " + location);
		System.out.println("City: " + city);
	}
	
	public static void main(String[] args) {
		Default_Employee emp = new Default_Employee();
		//default access modifier can be accessed within the class
		emp.displayEmpInfo();
	}

}
