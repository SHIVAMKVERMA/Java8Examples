import java.util.function.*; 	

public class FunctionPredicateInterfaceDemo1 {
	public static void main(String[] args) {

		String s = "Hello World";
		Function<String, String> f = i -> i.replaceAll(" ", "");
		System.out.println(f.apply(s));
		

		String s1 = "New Hello World "; 
		Function<String, Integer> f1 = i1 -> i1.length() - i1.replaceAll(" ", "").length();
		System.out.println(f1.apply(s1));
	}
}