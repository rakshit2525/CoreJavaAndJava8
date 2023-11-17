package coreJavaTopics.objectInJava.copyingValuesFromOneObjectToAnother.byCloneMethodOfObjectClass;

//to use clone() method we are implementing Cloneable interface
public class BOFACashBackCreditCards implements Cloneable {

	long cbc_num;
	String cbc_holder_name;
	String expiry_date;
	int cvv_num;
	double cbc_limit;

	public BOFACashBackCreditCards(long cbc_num, String cbc_holder_name, String expiry_date, int cvv_num,
			double cbc_limit) {
		super();
		this.cbc_num = cbc_num;
		this.cbc_holder_name = cbc_holder_name;
		this.expiry_date = expiry_date;
		this.cvv_num = cvv_num;
		this.cbc_limit = cbc_limit;
	}

	public void displayCardInfo() {
		System.out.println("Card Number: " + cbc_num + " | Card Holder Name: " + cbc_holder_name
				+ " | Card Expiry Date: " + expiry_date + " | CVV Number: " + cvv_num + " | Card Limit: " + cbc_limit);
	}

	//overriding clone method
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {

		try {
			BOFACashBackCreditCards card1 = new BOFACashBackCreditCards(998856983324l, "Ramesh", "11-05-2036", 598, 50000.0d);
			System.out.println("----------------------- Card Details Before Cloning -------------------------");
			card1.displayCardInfo();

			// cloning the object
			BOFACashBackCreditCards card2 = (BOFACashBackCreditCards) card1.clone();
			System.out.println("----------------------- Card Details After Cloning --------------------------");
			card2.displayCardInfo();
		} 
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
