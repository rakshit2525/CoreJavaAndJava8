package coreJavaTopics.polymorphism.runtimePolymorphism.methodOverriding.basicExample;

public class MainApp {
	
	public static void main(String[] args) {
		
		Vehicle twoWheeler = new TwoWheeler();
		Vehicle fourwheeler = new FourWheeler();
		
		twoWheeler.start();
		twoWheeler.stop();
		System.out.println("");
		fourwheeler.start();
		fourwheeler.stop();                  
	}
}
