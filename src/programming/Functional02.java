package programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Functional02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Predicate<Integer> predicateNUmber = x -> x%2==0;
		
		Predicate<Integer> predicateNUmber2 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer x) {
				return x%2==0;
			}
		};
		
		
		Function<Integer,Integer> mapperNumber = x -> x*x;
		
		Function<Integer,Integer> mapperNumber2 = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer x) {
				// TODO Auto-generated method stub
				return x*x;
			}
		};
		
		
		Consumer<Integer> actionNumber = System.out::println;
		
		
		Consumer<Integer> actionNumber2 = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		};
		
		numbers.stream()
		.filter(predicateNUmber2)
		.map(mapperNumber2)
		.forEach(actionNumber2);
		
//		BinaryOperator<Integer> accumulatorNumber = Integer::sum;
		BinaryOperator<Integer> accumulatorNumber = (a,b) -> a+b;
		BinaryOperator<Integer> accumulatorNumber2 = new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return t+u;
			}
		};
		
		int sum = numbers.stream()
		.reduce(0,accumulatorNumber);
		
		
	}

}
