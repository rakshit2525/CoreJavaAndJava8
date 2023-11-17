package java8Topics.predefinedFunctionalInterfaces.consumerInterface;

import java.util.function.Consumer;

public class ConsumerExample1 {

	public static void main(String[] args) {
		
		//without Consumer Interface
		/*
		double number = 75.0d;
		System.out.println(number);
		*/ 
		
		//with Consumer Interface
		Consumer<Integer> consumer = (num) -> System.out.println(num);
		consumer.accept(100);	
	}
}
