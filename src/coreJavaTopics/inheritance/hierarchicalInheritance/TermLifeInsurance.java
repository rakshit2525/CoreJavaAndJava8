package coreJavaTopics.inheritance.hierarchicalInheritance;

public class TermLifeInsurance extends Insurance{
	
	private String insurer_name;
	private int cover_till_age;
	private long life_cover;
	private double claim_settled;
	
	public String getInsurer_name() {
		return insurer_name;
	}
	public void setInsurer_name(String insurer_name) {
		this.insurer_name = insurer_name;
	}
	public int getCover_till_age() {
		return cover_till_age;
	}
	public void setCover_till_age(int cover_till_age) {
		this.cover_till_age = cover_till_age;
	}
	public long getLife_cover() {
		return life_cover;
	}
	public void setLife_cover(long life_cover) {
		this.life_cover = life_cover;
	}
	public double getClaim_settled() {
		return claim_settled;
	}
	public void setClaim_settled(double claim_settled) {
		this.claim_settled = claim_settled;
	}
	
	public void displayTLIInfo() {
		super.displayInsuranceInfo();
		System.out.println("---------------------- Term Life Insurance --------------------");
		System.out.println("Insurer Name: " + insurer_name);
		System.out.println("Cover Till Age: " + cover_till_age);
		System.out.println("Life Cover: " + life_cover);
		System.out.println("Claim settled: " + claim_settled);
	}
}
