import java.util.function.*; 	
import java.util.*;
public class ConsumerDemo2 {
	public static void main(String[] args) {

		ArrayList<Movie> list = new ArrayList<Movie>();

		populate(list);

		Consumer<Movie> c = m -> {
			System.out.println(m.name);
			System.out.println(m.actor);
			System.out.println(m.actress);
			System.out.println();
		};
		
		for (Movie m : list) {
			c.accept(m);
		}
		

	}

	static void populate(ArrayList<Movie> list) {
		list.add(new Movie("ABCD", "Varun", "Shraddha"));
		list.add(new Movie("ABCD2", "Varun1", "Shraddha1"));
		list.add(new Movie("ABCD3", "Tiger", "Shraddha2"));

	}

}
class Movie {
	String name;
	String actor;
	String actress;

	Movie(String name, String actor, String actress) {
		this.name = name;
		this.actor = actor;
		this.actress = actress;
	}
}
