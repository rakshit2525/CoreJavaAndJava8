package coreJavaTopics.exceptionHandling.throwKeyword;

public class ValidateAgeForVoting {
	
	public static void validateAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Can't cast vote due to under age!");
		} else {
			System.out.println("You can cast your vote");
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Important code1.....");
		try {
			//validateAge(25);
			validateAge(17);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} finally {
			System.out.println("Rest of the important code");
		}
	}

}
