//------ this is for PUBLIC access modifier ------

package coreJavaTopics.encapsulation.package1;

public class Public_P1_Test1 {

	public static void main(String[] args) {
		
		//it can be accessed from outside the class within same package
		Public_BOFATravelRewards rewards = new Public_BOFATravelRewards();
		rewards.displayTravelRewardsCCDetails();
	}
}
