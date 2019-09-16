import java.util.function.*; 	
import java.util.*;

public class PredicateInterfaceDemo7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username : ");
		String username = sc.next();
		System.out.println("Enter Password : ");
		String password = sc.next();

		Predicate<User> p1 = user -> user.username.equals("Admin") && user.password.equals("welcome");
		
		User user = new User("Admin" , "welcome");

		User user1 = new User(username, password);
		
		System.out.println(p1.test(user));
		

		if(p1.test(user1)) {
			System.out.println("Valid User");
		} else {
			System.out.println("Invalid User");
		}
		/*for (String s : names) {
			if (p1.test(s)) {
				al.add(s);
				
			}
		}*/

					
	}
}

class User {
	String username;
	String password;


	User(String username, String password) {
		this.username = username;
		this.password = password;
	}
}