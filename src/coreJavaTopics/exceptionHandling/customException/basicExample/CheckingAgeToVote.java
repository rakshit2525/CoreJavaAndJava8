package coreJavaTopics.exceptionHandling.customException.basicExample;

public class CheckingAgeToVote {

	public static void main(String[] args) {
		
		try {
			ageValidation(15);
		} catch (InvalidAgeException ie) {
			System.out.println("Handled Invalid age exception");
			ie.printStackTrace();
		}
	}
	
	public static void ageValidation(int age) throws InvalidAgeException{
		if(age < 18) {
			throw new InvalidAgeException("Invalid age to cast vote. Must be above 18");	
		} else {
			System.out.println("You are eligible to vote");
		}
	}

}
