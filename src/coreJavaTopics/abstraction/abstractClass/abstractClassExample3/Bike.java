package coreJavaTopics.abstraction.abstractClass.abstractClassExample3;

public class Bike extends Rapido{

	int numberOfWheels;
	
	public Bike(String name, int numberOfWheels) {
		super(name);
		this.numberOfWheels = numberOfWheels;
	}

	@Override
	public void moving() {
		System.out.println("This is " + name + " bike running on " + numberOfWheels + " wheels");
	}
	
}	
