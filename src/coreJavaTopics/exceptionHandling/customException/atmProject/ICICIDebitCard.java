package coreJavaTopics.exceptionHandling.customException.atmProject;

public class ICICIDebitCard implements IATMService{

	private double balance; {
		this.balance = 22000.0d;
	}

	@Override
	public void depositAmount(double deptAmt) throws InvalidAmountException {
		if(deptAmt <= 0) {
			throw new InvalidAmountException("Invalid Amount : Please deposit valid amount in multiple's of 100, 200, 500, 2000");
		} else {
			balance += deptAmt;
		}
	}

	@Override
	public double withdrawAmount(double wthAmt) throws InvalidAmountException, InsufficientAmountException {
		if (wthAmt <= 0) {
			throw new InvalidAmountException("Invalid Amount : You can't withdraw zero amount - Multiple of 100s");
		} else if (balance < wthAmt){
			throw new InsufficientAmountException("Insufficient Amount : Please check your available balance");
		}
		balance -= wthAmt;
		return balance;
	}

	@Override
	public double checkBalance() {
		return balance;
	}

}
