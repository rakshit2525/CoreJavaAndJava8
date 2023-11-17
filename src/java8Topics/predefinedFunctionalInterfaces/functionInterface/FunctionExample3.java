package java8Topics.predefinedFunctionalInterfaces.functionInterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample3 {

	//converting List into Map using Function Interface
	public static void main(String[] args) {
		
		List<String> listOfNames = Arrays.asList("Rohit", "Gilchrist", "Kohli", "Sachin", "AB De villiers", "Sangakkara", "Warner");
		Map<String, Integer> mapObj = listToMap(listOfNames, t -> t.length());
		System.out.println(mapObj);
	}
	
	private static<T, R> Map<T, R> listToMap(List<T> list, Function<T, R> func) {
		Map<T, R> result = new HashMap<T, R>();
		for(T t: list) {
			result.put(t, func.apply(t));
		}
		return result;
	}
}
