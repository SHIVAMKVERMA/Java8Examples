import java.util.function.*; 	
import java.util.*;
public class SupplierDemo1 {
	public static void main(String[] args) {

		Supplier<Date> s = () -> new Date();


		System.out.println(s.get());
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(s.get());

	}

}