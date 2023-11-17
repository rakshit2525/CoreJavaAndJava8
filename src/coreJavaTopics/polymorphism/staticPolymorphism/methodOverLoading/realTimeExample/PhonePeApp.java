package coreJavaTopics.polymorphism.staticPolymorphism.methodOverLoading.realTimeExample;

public class PhonePeApp {
	
	public static void main(String[] args) {
		BillPayment.makePayment(88596632547l, "HDFC Bank", 66354825l, "18-09-23", "Krishna Lane, Kormangala", 1852.0d);
		BillPayment.makePayment(5698746l, "John", 558.55d, "Entertainment Package");
		BillPayment.makePayment(66354l, 950.0d, "Indane Gas");
		
		System.out.println("");
		System.out.println("Ouput of Main method overloading");
		PhonePeApp.main(2259);
		PhonePeApp.main("John Wick");
	}
	
	//example for overloading the main method
	public static void main(int number) {
		System.out.println("Number: " + number);
	}
	
	public static void main(String name) {
		System.out.println("Name: " + name);
	}
}
