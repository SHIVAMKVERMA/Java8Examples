import java.util.function.*; 	
import java.util.*;
public class ConsumerDemo1 {
	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		
		c.accept("Hello");

		c.accept("Brother");
		

	}

}

