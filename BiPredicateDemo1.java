import java.util.function.*;

public class BiPredicateDemo1 {
	public static void main(String[] args) {
		//i -> i > 10;		
		BiPredicate<Integer, Integer> p = (a, b) -> (a + b) % 2 == 0;
		System.out.println(p.test(100, 12));
		System.out.println(p.test(10, 3));
		System.out.println(p.test(10, 4));
	}

}