package coreJavaTopics.abstraction.abstractClass.abstractClassExample3;

public class Auto extends Rapido{

	int numberOfWheels;
	
	public Auto(String name, int numberOfWheels) {
		super(name);
		this.numberOfWheels = numberOfWheels;
	}

	@Override
	public void moving() {
		System.out.println("This is " + name + " auto running on " + numberOfWheels + " wheels");
	}

}
