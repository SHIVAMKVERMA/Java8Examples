import java.util.function.*;
import java.util.*;

public class PredicateInterfaceDemo4 {
	public static void main(String[] args) {

		int[] x = {1,5,7,3,7,2,8,9,4,10, 50};
		//i -> i > 10;		
		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;

		System.out.println("Number greater than 10 is : ");

		m1(p1, x);

		System.out.println("Number even are : ");

		m1(p2, x);

		System.out.println("Number not greater than 10 are : ");

		m1(p1.negate(), x);

		System.out.println("Number greater than 10 and even numbers are : ");

		m1(p1.and(p2), x);
		
		System.out.println("Number greater than 10 or even numbers are : ");

		m1(p1.or(p2), x);
	}

	public static void m1(Predicate<Integer> p, int[] x) {
		for (int x1 : x ) {
			if (p.test(x1)) {
				System.out.println(x1);
			}
		}
	}

}