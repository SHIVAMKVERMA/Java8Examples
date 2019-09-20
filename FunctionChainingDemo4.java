import java.util.function.*; 	
import java.util.*;
public class FunctionChainingDemo4 {
	public static void main(String[] args) {
		Function<String, String> f1 = Function.identity();
		String s2 = f1.apply("abhay");
		System.out.println(s2);	
		

	}

}

