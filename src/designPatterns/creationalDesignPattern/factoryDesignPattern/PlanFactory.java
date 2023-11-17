package designPatterns.creationalDesignPattern.factoryDesignPattern;

public class PlanFactory {

	//here Plan type is like the class whose object has to be created
	//ex: Plan plan = new HomePlan();
	public Plan getPlan(String planName) {
		if(planName == null) {
			return null;
		}
		if (planName.equalsIgnoreCase("HomePlan")) {
			return new HomePlan();
		}
		if (planName.equalsIgnoreCase("CommercialPlan")) {
			return new CommercialPlan();
		}		
		if (planName.equalsIgnoreCase("InstitutionalPlan")) {
			return new InstitutionalPlan();
		}
		if (planName.equalsIgnoreCase("FarmerPlan")) {
			return new FarmerPlan();
		}
		return null;
	}
}
