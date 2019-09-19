import java.util.function.*;

public class BiFunctionDemo1 {
	public static void main(String[] args) {
		//i -> i > 10;		
		BiFunction<Integer, Integer, Integer> p = (a, b) -> (a * b);
		System.out.println(p.apply(100, 12));
		System.out.println(p.apply(10, 3));
		System.out.println(p.apply(10, 4));
	}

}