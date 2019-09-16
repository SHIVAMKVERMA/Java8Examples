import java.util.function.*; 	
import java.util.*;
public class SupplierDemo2 {
	public static void main(String[] args) {

		Supplier<String> s = () -> {
			String[] x = {"Rohit", "Abhay", "Mohit", "Ramnik" };
			int x1 = (int)(Math.random() * 4);
			return x[x1];
		};


		System.out.println(s.get());
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(s.get());

	}

}