import java.util.function.*; 	

public class PredicateInterfaceDemo10 {
	public static void main(String[] args) {


		Predicate<String> p1 = Predicate.isEqual("Admin");
		System.out.println(p1.test("Admin"));
		System.out.println(p1.test("Admin1"));
	}
}