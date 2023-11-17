package designPatterns.behavioralDesignPattern.strategyDesignPattern;

public class NetBanking implements PaymentMethod{

	private long acc_num;
	private String acc_holder_name;
	private String branch_name;
	private double acc_balance;
	
	public NetBanking(long acc_num, String acc_holder_name, String branch_name, double acc_balance) {
		super();
		this.acc_num = acc_num;
		this.acc_holder_name = acc_holder_name;
		this.branch_name = branch_name;
		this.acc_balance = acc_balance;
	}

	@Override
	public void makePayment(double amount) {
		System.out.println(amount + "/- successfully debited from your account");
	}

}
