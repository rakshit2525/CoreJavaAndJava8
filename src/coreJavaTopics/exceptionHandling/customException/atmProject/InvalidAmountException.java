package coreJavaTopics.exceptionHandling.customException.atmProject;

public class InvalidAmountException extends Exception{
	public InvalidAmountException(String errorMessage) {
		super(errorMessage);
	}
}
