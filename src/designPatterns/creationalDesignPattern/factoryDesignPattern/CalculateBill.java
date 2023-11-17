package designPatterns.creationalDesignPattern.factoryDesignPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculateBill {

	public static void main(String[] args) {
		
		try {
			PlanFactory factory = new PlanFactory();
			System.out.println("Enter the plan name to calculate bill:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			//pass the plan name at runtime to create the object of that particular plan
			String planName = reader.readLine();
			
			//pass the unit consumed by the customer
			System.out.println("Enter the number of units consumed:");
			int numberOfUnits = Integer.parseInt(reader.readLine());
			
			//the below line is just line - Plan plan = new HomePlan();
			//instead of directly creating object of every subclass
			//here we are just creating the object of the subclass that we need to work with
			Plan plan = factory.getPlan(planName);
			
			System.out.println("Bill amount generated for " + planName + " for " + numberOfUnits + " units:");
			plan.getRate();
			plan.calculateBill(numberOfUnits);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
