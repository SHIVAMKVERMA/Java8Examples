import java.util.function.*;
import java.util.*;

public class PredicateInterfaceDemo3 {
	public static void main(String[] args) {
		//i -> i > 10;		
		Predicate<Collection> p = i -> i.isEmpty();

		List<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(3);
		List<Integer> al2 = new ArrayList<>();
		System.out.println(p.test(al));
		System.out.println(p.test(al2));
		
	}

}