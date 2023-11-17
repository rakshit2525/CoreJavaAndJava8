package coreJavaTopics.innerClasses.staticInnerClass.realtimeExample;

public class OuterClass {
	
	private static int CUST_ID = 6155;
	private static String DOMESTIC_CUSTOMER_BRANCH = "Mysore Branch";
	static long SOCIAL_SECURITY_NUMBER = 524854684l;
	static String VALUATION_DATE = "28-09-2023";
	static String GURANTOR_BRANCH = "Bengaluru Branch";
	
	static class WholesaleCollateralBasic {
		static void displayCollateral() {
			System.out.println("Customer ID: " + CUST_ID);
			System.out.println("Domestic Customer Branch: " + DOMESTIC_CUSTOMER_BRANCH);
			System.out.println("Social Security Number: " + SOCIAL_SECURITY_NUMBER);
			System.out.println("Valuation Date: " + VALUATION_DATE);
			System.out.println("Gurantor Branch: " + GURANTOR_BRANCH);
		}
	}
	
	public static void main(String[] args) {
		/*
		OuterClass.WholesaleCollateralBasic basic = new OuterClass.WholesaleCollateralBasic();
		basic.displayCollateral();
		*/
		
		OuterClass.WholesaleCollateralBasic.displayCollateral();
	}
}
