import java.util.function.*; 	
import java.util.*;
public class SupplierDemo3 {
	public static void main(String[] args) {

		Supplier<String> s = () -> {
			String otp = "";
			for (int i = 0;i < 6; i++) {
				otp = otp + (int)(Math.random() * 10);	
			}
			
			return otp;
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