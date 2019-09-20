import java.util.function.*; 	
import java.util.*;
public class FunctionChainingDemo2 {
	public static void main(String[] args) {

		Function<Integer, Integer> f1 = i -> i + i; 

		Function<Integer, Integer> f2 = i -> i * i * i;
		
	
		System.out.println(f1.andThen(f2).apply(2));


		System.out.println(f1.compose(f2).apply(2));

	}



}
