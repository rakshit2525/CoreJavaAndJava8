package coreJavaTopics.keywords.thisKeyword.currentClassConstructor;

public class BOFAPremiumRewardsCard {
	
	long prc_num;
	String prc_holder_name;
	String expiry_date;
	int cvv_num;
	double prc_limit;
	
	public BOFAPremiumRewardsCard() {
		System.out.println("----------- Constructor Chaining --------------");
	}

	public BOFAPremiumRewardsCard(long prc_num, String prc_holder_name, String expiry_date, int cvv_num,
			double prc_limit) {
		this();
		this.prc_num = prc_num;
		this.prc_holder_name = prc_holder_name;
		this.expiry_date = expiry_date;
		this.cvv_num = cvv_num;
		this.prc_limit = prc_limit;
	}
	
	public static void main(String[] args) {
		BOFAPremiumRewardsCard card = new BOFAPremiumRewardsCard(8856884522l, "Rajesh", "12-09-2035", 568, 50000.0d);
		System.out.println(card);
	}

	@Override
	public String toString() {
		return "BOFAPremiumRewardsCard [prc_num=" + prc_num + ", prc_holder_name=" + prc_holder_name + ", expiry_date="
				+ expiry_date + ", cvv_num=" + cvv_num + ", prc_limit=" + prc_limit + "]";
	}
}
