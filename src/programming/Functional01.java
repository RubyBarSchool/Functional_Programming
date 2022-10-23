package programming;

import java.util.Collection;
import java.util.List;

public class Functional01 {
	public static void main(String[] args) {
//		generateConlection(List.of(1,2,3,4,5,6,7,8,9));
		List<Integer> abc = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		changedata(abc);
//		abc.forEach(System.out::println);
	}

	public static void print(Object model) {
		System.out.println(model);
	}

	public static boolean checkEven(Integer model) {
		if (model % 2 == 0) {
			return true;
		}
		return false;
	}

	private static void generateConlection(List<Integer> models) {
		models.stream()
//				.filter(Functional01::checkEven)  // function reference
//				.filter(model -> model%2==0) //lamda expression
				.filter(model -> {
					return model % 2 == 0;
				}).forEach(System.out::println); // method reference
	}

	private static void changedata(List<Integer> models) {
		models.stream().map(model -> model*2).forEach(System.out::println);
		models.forEach(System.out::println);
	}

}
