import java.util.function.*; 	
import java.util.*;

public class PredicateInterfaceDemo6 {
	public static void main(String[] args) {

		String[] names = {"Arjun", null, "Aman", "Abhi", ""};
		
		Predicate<String> p1 = i -> i != null && i.length() != 0;
		
		ArrayList<String> al = new ArrayList<String>();

		for (String s : names) {
			if (p1.test(s)) {
				al.add(s);
				
			}
		}

		System.out.println(al);			
	}
}