package coreJavaTopics.exceptionHandling.customException.atmProject;

public interface IATMService {
	
	public void depositAmount(double deptAmt) throws InvalidAmountException; 
	public double withdrawAmount(double wthAmt) throws InvalidAmountException, InsufficientAmountException;
	public double checkBalance();
}
