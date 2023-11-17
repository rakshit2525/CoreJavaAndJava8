package java8Topics.lambdaExpressions.returnType;

public class StringReturnType {

	public static void main(String[] args) {
		//without lambda expression
		ISayable sayService = new ISayable() {
		
			@Override
			public String saySomething() {
				return "This is returning string value without lambda expression";
			}
		};
		System.out.println(sayService.saySomething());
		
		//with lambda expression
		ISayable say = () -> {
			return "This is returning string value with lambda expression";
		};
		System.out.println(say.saySomething());
	}
}
