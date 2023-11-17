package coreJavaTopics.abstraction.abstractClass.abstractClassExample3;

public class RapidoApp {

	public static void main(String[] args) {
		
		//this is creating an object of implemented class with reference to that of abstract class
		//Bike and Auto are the implemented class and Rapido is the abstract class
		Rapido bike = new Bike("Himalayan", 2);
		Rapido auto = new Auto("Bajaj", 3);
		
		bike.moving();
		auto.moving();
	}

}
