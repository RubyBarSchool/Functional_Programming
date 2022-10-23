package programming;

import java.util.List;
import java.util.function.Predicate;

public class BehaviorParameterzation {
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Predicate<Integer> predicateNumber = x -> x%2==0;
		
		extracted(numbers, predicateNumber);
		
		Predicate<Integer> predicateNumber2 = x -> x%2!=0;
		
		extracted(numbers, x -> x%2!=0);
	}

	private static void extracted(List<Integer> numbers, Predicate<Integer> predicateNumber2) {
		numbers.stream()
		.filter(predicateNumber2)
		.forEach(System.out::println);
	}
}
