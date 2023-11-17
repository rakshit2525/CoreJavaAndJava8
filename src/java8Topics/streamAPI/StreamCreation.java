package java8Topics.streamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		
		System.out.println("------------------------ Source is Collection -----------------------------");
		Collection<String> collection = Arrays.asList("Rohit", "Gill", "Kohli", "Shreyas", "Rahul", "Hardik", "Jadeja");
		Stream<String> stream = collection.stream();
		stream.forEach(System.out::println); // :: is called as Method reference	
		System.out.println("");
		
		System.out.println("------------------------ Source is List -----------------------------");
		List<String> list = Arrays.asList("Bengaluru", "Hyderabad", "Dharmashala", "Mumbai", "Lucknow", "Delhi");
		Stream<String> streamObj = list.stream();
		streamObj.forEach(System.out::println);
		System.out.println("");
		
		System.out.println("------------------------ Converting List into Set -----------------------------");
		Set<String> setObj = new HashSet<String>(list);
		Stream<String> streamObj1 = setObj.stream();
		streamObj1.forEach(System.out::println);
	}
}
