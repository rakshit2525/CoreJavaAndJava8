package coreJavaTopics.exceptionHandling.customException.atmProject;

public class AxisDebitCard implements IATMService{

	private double balance; {
		this.balance = 30000.0d;
	}

	@Override
	public void depositAmount(double deptAmt) throws InvalidAmountException {
		if(deptAmt <= 0) {
			throw new InvalidAmountException("Invalid Amount : Please deposit valid amount");
		} else {
			balance += deptAmt;
		}
	}

	@Override
	public double withdrawAmount(double wthAmt) throws InvalidAmountException, InsufficientAmountException {
		if (wthAmt <= 0) {
			throw new InvalidAmountException("Invalid Amount : Please enter valid amount to withdraw");
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
