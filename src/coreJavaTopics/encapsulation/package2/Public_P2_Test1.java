//------ this is for PUBLIC access modifier ------

package coreJavaTopics.encapsulation.package2;

import coreJavaTopics.encapsulation.package1.Public_BOFATravelRewards;

public class Public_P2_Test1 extends Public_BOFATravelRewards{

	public static void main(String[] args) {
		
		
		//since it is public it can be accessed from outside the package by subclass
		Public_P2_Test1 test = new Public_P2_Test1();
		test.displayTravelRewardsCCDetails();
		
		
		//here we are directly creating the object of parent class
		//it is similar to calling the method from outside the class
		//since it is public it can be accessed from outside the package
		Public_BOFATravelRewards rewards = new Public_BOFATravelRewards();
		rewards.displayTravelRewardsCCDetails();
	}

}
