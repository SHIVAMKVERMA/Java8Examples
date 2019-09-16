import java.util.function.*;

public class PredicateInterfaceDemo2 {
	public static void main(String[] args) {
		//i -> i > 10;		
		Predicate<String> p = i -> i.length() > 5;
		System.out.println(p.test("Radhe"));
		System.out.println(p.test("Ojaswita"));
		System.out.println(p.test("Ramniklal"));
	}

}