package java8Topics.predefinedFunctionalInterfaces.predicateInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample1 {

	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Predicate<Integer> predicate1 = (num) -> num > 4;
		Predicate<Integer> predicate2 = (num) -> num < 9;
		
		numList.stream().filter(predicate1.and(predicate2)).collect(Collectors.toList()).forEach(System.out::println);
	}
}
