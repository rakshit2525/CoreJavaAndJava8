package coreJavaTopics.exceptionHandling.customException.basicExample;

public class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String errorMsg) {
		super(errorMsg);
	}
}
