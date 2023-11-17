package java8Topics.staticAndDefault.realtimeExample;

public class BankOfAmerica implements IFederalReserveService{

	@Override
	public void getWithdrawlDetails() {
		System.out.println("This is Bank Of America withdrawl details");
	}
	
	public void linkPAN() {
		System.out.println("PAN Number: LIODB5214H");
		System.out.println("Address: 4-11/7O");
		System.out.println("City: Mysore");
	}

}
