package java8Topics.predefinedFunctionalInterfaces.functionInterface;

import java.util.function.Function;

public class FunctionExample2 {

	public static void main(String[] args) {
		
		//without Function interface
		/*
		String name = "Lightning";
		System.out.println(name.length() * 2);
		 */
		
		//with Function interface
		Function<String, Integer> func1 = (name) -> name.length();
		Function<Integer, Integer> func2 = (name) -> name * 2;
		
		Integer length1 = func1.andThen(func2).apply("Lightning");
		//or it can also be done in the below way
		//Integer length1 = func1.andThen((name) -> name * 2).apply("Lightning");
		System.out.println(length1);
	}
}
