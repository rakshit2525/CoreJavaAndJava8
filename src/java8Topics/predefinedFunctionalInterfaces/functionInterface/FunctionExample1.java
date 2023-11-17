package java8Topics.predefinedFunctionalInterfaces.functionInterface;

import java.util.function.Function;

public class FunctionExample1 {
	
	public static void main(String[] args) {
		
		//getting the length of string without Function interface
		/*
		String name = "John Wick";
		System.out.println(name.length());
		*/
		
		//getting the length of string with Function interface
		Function<String, Integer> function =  (name) -> name.length();
		System.out.println("Length of the string: " + function.apply("John Wick"));
	}
}
