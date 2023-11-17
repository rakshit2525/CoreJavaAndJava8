//------ this is for PUBLIC access modifier ------

package coreJavaTopics.encapsulation.package1;

public class Public_BOFATravelRewards {

	public long cc_num = 99632587415l;
	public String cc_holder_name = "Umesh";
	public String cc_expiry_date = "22-09-2036";
	public int cvv_num = 965;
	public int pinNumber = 6451;
	public double cc_limit = 50000.0d;
	
	public void displayTravelRewardsCCDetails() {
		System.out.println("Credit Card Number: " + cc_num);
		System.out.println("Holder name: " + cc_holder_name);
		System.out.println("Expiry Date: " + cc_expiry_date);
		System.out.println("CVV Number: " + cvv_num);
		System.out.println("PIN Number: " + pinNumber);
		System.out.println("Credit Card Limit: " + cc_limit);
	}
	
	public static void main(String[] args) {
		Public_BOFATravelRewards rewards = new Public_BOFATravelRewards();
		//since the method is declared public it can be accessed within the class
		rewards.displayTravelRewardsCCDetails();
	}
}
