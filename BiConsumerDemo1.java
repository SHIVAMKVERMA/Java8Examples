import java.util.function.*; 	
import java.util.*;
public class BiConsumerDemo1 {
	public static void main(String[] args) {

		BiConsumer<String, String> c = (s1,s2) -> System.out.println(s1 + s2);
		
		c.accept("Hello", "Brother");
	
	}
}