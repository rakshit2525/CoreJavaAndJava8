package coreJavaTopics.constructorInJava.defaultConstructor;

public class FeatureCDAccount {
	
	//no-arg / default constructor
	//constructor name must be same as the class name
	//constructor should not have any return type, not even void
	//constructor cannot be declared as abstract, static or synchronized
	
	public FeatureCDAccount() {
		System.out.println("This is no-arg/default constructor...........");
	}
	
	public void displayInfo() {
		System.out.println("This is a method..........");
	}

	public static void main(String[] args) {
		FeatureCDAccount account = new FeatureCDAccount();
		account.displayInfo();
	}

}
