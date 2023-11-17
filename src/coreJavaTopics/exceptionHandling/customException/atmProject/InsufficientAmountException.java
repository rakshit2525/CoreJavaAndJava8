package coreJavaTopics.exceptionHandling.customException.atmProject;

public class InsufficientAmountException extends Exception{
	public InsufficientAmountException(String errorMessage) {
		super(errorMessage);
	}
}
