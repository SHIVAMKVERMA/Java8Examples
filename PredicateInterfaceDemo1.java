import java.util.function.*;

public class PredicateInterfaceDemo1 {
	public static void main(String[] args) {
		//i -> i > 10;		
		Predicate<Integer> p = i -> i > 10;
		System.out.println(p.test(100));
		System.out.println(p.test(10));
		System.out.println(p.test("10"));
	}

}