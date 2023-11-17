package java8Topics.predefinedFunctionalInterfaces.consumerInterface;

import java.util.function.Consumer;

public class ConsumerExample2 {

	public static void main(String[] args) {
		
		Consumer<String> consumer1 = (inputParam) -> System.out.println(inputParam + "Kohli");
		Consumer<String> consumer2 = (inputParam) -> System.out.println(inputParam + "Rohit");
		consumer1.andThen(consumer2).accept("Well Played! ");
	}
}
