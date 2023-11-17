package coreJavaTopics.collection_framework.mapInterface.hashMap.realtimeExample.example2;

import java.util.HashMap;
import java.util.Map;


public class MainApp {

	public static void main(String[] args) {
		
		//creating an object of CreditCardDetails class, which contains details about 
		//different types of credit cards available 
		CreditCardDetails hdfcCreditCard11 = new CreditCardDetails(965874123587l, "Swiggy HDFC Bank Credit Card", 
				"10% Cashback on Swiggy application, 5% Cashback on online spends across online MCCs",
				"Net Monthly Income > ₹25,000", 200000.0d);
		CreditCardDetails hdfccreditCard12 = new CreditCardDetails(965874123588l, "Marriott Bonvoy HDFC Bank Credit Card", 
				"1 Free Night Award at Marriott Bonvoy, Marriott Bonvoy® Silver Elite Status",
				"Gross Monthly Income> Rs 1,00,000", 500000.0d);
		
		CreditCardDetails hdfccreditCard13 = new CreditCardDetails(965874123589l, "Regalia Gold Credit Card", 
				"Complimentary Club Vistara Silver Tier Membership, ₹ 1,500 worth vouchers on quarterly spends of Rs. 1.5 lakh",
				"ITR > Rs 12 Lakhs per annum", 300000.0d);
		
		
		
		CreditCardDetails axisCreditCard21 = new CreditCardDetails(698532562541l, "Flipkart Axis Bank Credit Card",
				"Unlimited cashbacks from Flipkart and many more, Enjoy our airport lounge access",
				"Age: Min 18 years & Max 70 Years", 100000.0d);
		CreditCardDetails axisCreditCard22 = new CreditCardDetails(698532562542l, "Axis Bank Privilege Credit Card",
				"12,500 EDGE RPs redeemable against Multi brand vouchers, Double the benefit upon achieving spends milestone of Rs.2.5 lakh",
				"Net income of Rs. 6,00,000 per annum", 250000.0d);
		CreditCardDetails axisCreditCard23 = new CreditCardDetails(698532562543l, "Axis Bank Select Credit Card",
				"Flat Rs. 200 off on Swiggy, Buy One & Get One ticket FREE on BookMyShow", 
				"Net income of 6,00,000 per annum or more", 150000.0d);
		
		
		CreditCardDetails yesCreditCard31 = new CreditCardDetails(854196527563l, "Wellness Plus Credit Card", 
				"Annual preventive Health Check-up, 12 complimentary fitness sessions", 
				"Minimum net salary of INR 20,000 per month", 200000.0d);
		CreditCardDetails yesCreditCard32 = new CreditCardDetails(854196527564l, "Yes Prosperity Rewards Plus credit card", 
				"Preferential Foreign Currency Markup of 2.75% only, Earn reward points on your spends", 
				"Minimum Net Salary of INR 25,000 per month", 150000.0d);
		CreditCardDetails yesCreditCard33 = new CreditCardDetails(854196527565l, "YES First Business Credit Card", 
				"Get up to 1.75% markup on foreign currency, Avail up to 6 complimentary visits to airport lounges", 
				"Minimum Income Tax Return of INR 10 lakh", 300000.0d);
		
		
		//creating object which contains account details
		Account account1 = new Account(985674584125l, "Ramesh", "Bengaluru");
		Account account2 = new Account(985674584125l, "Ramesh", "Bengaluru");
		Account account3 = new Account(985674584125l, "Ramesh", "Bengaluru");
		
		
		
		//adding the credit card details with specifying an id for each credit card to HashMap object
		Map<Long, CreditCardDetails> mapHdfc = new HashMap<Long, CreditCardDetails>();
		mapHdfc.put(2010051l, hdfcCreditCard11);
		mapHdfc.put(2010052l, hdfccreditCard12);
		mapHdfc.put(2010053l, hdfccreditCard13);
		
		Map<Long, CreditCardDetails> mapAxis = new HashMap<Long, CreditCardDetails>();
		mapAxis.put(3010071l, axisCreditCard21);
		mapAxis.put(3010072l, axisCreditCard22);
		mapAxis.put(3010073l, axisCreditCard23);
		
		Map<Long, CreditCardDetails> mapYes = new HashMap<Long, CreditCardDetails>();
		mapYes.put(4010091l, yesCreditCard31);
		mapYes.put(4010092l, yesCreditCard32);
		mapYes.put(4010093l, yesCreditCard33);
		
		//adding all the details into HashMap object with name creditcardMap with bank name as their key
		Map<String, Map<Long, CreditCardDetails>> creditCardMap = new HashMap<String, Map<Long, CreditCardDetails>>();
		creditCardMap.put("HDFC Bank", mapHdfc);
		creditCardMap.put("Axis Bank", mapAxis);
		creditCardMap.put("Yes Bank", mapYes);
		
		//displaying the details 
		for(Map.Entry<String, Map<Long, CreditCardDetails>> map : creditCardMap.entrySet()) {
			System.out.println("Bank Name: " + map.getKey() + " || Credit Card Details: " + map.getValue());
		}
	}

}
