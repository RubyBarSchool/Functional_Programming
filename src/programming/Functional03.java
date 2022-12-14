package programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Functional03 {

//	all: this is sort of a wildcard that suppresses all warnings
//	boxing: suppresses warnings related to boxing/unboxing operations
//	unused: suppresses warnings of unused code
//	cast: suppresses warnings related to object cast operations
//	deprecation: suppresses warnings related to deprecation, such as a deprecated class or method
//	restriction: suppresses warnings related to the usage of discouraged or forbidden references
//	dep-ann: suppresses warnings relative to deprecated annotations
//	fallthrough: suppresses warnings related to missing break statements in switch statements
//	finally: suppresses warnings related to finally blocks that don't return
//	hiding: suppresses warnings relative to locals that hide variables
//	incomplete-switch: suppresses warnings relative to missing entries in a switch statement (enum case)
//	nls: suppresses warnings related to non-nls string literals
//	null: suppresses warnings related to null analysis
//	serial: suppresses warnings related to the missing serialVersionUID field, which is typically found in a Serializable class
//	static-access: suppresses warnings related to incorrect static variable access
//	synthetic-access: suppresses warnings related to unoptimized access from inner classes
//	unchecked: suppresses warnings related to unchecked operations
//	unqualified-field-access: suppresses warnings related to unqualified field access
//	javadoc: suppresses warnings related to Javadoc
//	rawtypes: suppresses warnings related to the usage of raw types
//	resource: suppresses warnings related to the usage of resources of type Closeable
//	super: suppresses warnings related to overriding a method without super invocations
//	sync-override: suppresses warnings due to missing synchronize when overriding a synchronized method
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(9, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Predicate<Integer> predicate = x -> x%2==0; // one input, one output type boolean
		
		Function<Integer, Integer> functon = x -> x*x; // one input, one output maybe different data
		
		Function<Integer, String> functon2 = x -> x + " "; // one input, one output
		
		Consumer<Integer> consumer = System.out::println; // one input, no output
		
		BinaryOperator<Integer> binaryOperator = (x,y) -> x+y; // two input, one output same type data
		
		Supplier<Integer> random = () -> 10; // no input, return something
		
		UnaryOperator<Integer> operator = x -> x*x; //one input, one output same type data
		
		BiPredicate<Integer, Integer> biPredicate = (a,b) -> a!=b;
		
		BiFunction<Integer, Integer, Boolean> biFunction = (a,b) -> a!=b;
		
		BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.println(a+""+b);
		
		System.out.println(operator); 
		
		Supplier<String> supplier = String::new; // contructer reference
		
		Predicate<Integer> predicate2 = x -> x>5;
		
		//.allMatch()   all element in stream true 
		//,noneMatch  all element in stream false
		//,anyMatch some element in stream true
		
		List<Course> courses = List.of(
				new Course("123", "123"),
				new Course("456", "123"),
				new Course("789", "789")
				);
		
		Function<Course, String> courseFunc = course -> course.getUuid();
		Comparator<Course> comparator = Comparator.comparing(courseFunc)
													.thenComparing(course -> course.getName())
													.reversed();
		
		
		Function<Integer, Integer> intFunc = x -> x;
		numbers.stream().filter(predicate2).sorted(Comparator.comparing(intFunc).reversed()).forEach(System.out::println);
		
		// .skip get element after index in put skip
		// .limit get total element == input limit
		// .takeWhile get all element same condition
		// .dropWhile get all element not same con??ition
		// .max get element max same condition
		// .min get element min same condition
		// findFirst
		// findAny
		// sum
		
		System.out.println(courses.stream().collect(Collectors.groupingBy(course -> course.getName())));
		
		
		System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getName,Collectors.mapping(Course::getName, Collectors.toList()))));
		
	}

}
