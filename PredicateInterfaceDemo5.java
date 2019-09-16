import java.util.function.*; 	
import java.util.*;

public class PredicateInterfaceDemo5 {
	public static void main(String[] args) {

		String[] names = {"Arjun", "Akshay", "Aman", "Abhi", "Parabhat"};
		
		Predicate<String> p1 = i -> i.charAt(0) == 'A';
		

		for (String s : names ) {
			if (p1.test(s)) {
				System.out.println(s);		
			}
		}	
	}
}