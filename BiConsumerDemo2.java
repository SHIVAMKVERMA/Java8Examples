import java.util.function.*; 	
import java.util.*;
public class BiConsumerDemo2 {
	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();

		BiFunction<String, Double, Employee> f = (name, salary) -> new Employee(name, salary);

		list.add(f.apply("Abhay", 200.0));
		list.add(f.apply("Arjun", 2000.0));
		list.add(f.apply("Mohit", 250.0));
		list.add(f.apply("Rohit", 100.0));
		list.add(f.apply("Ramnik", 900.0));

		BiConsumer<Employee, Double> c = (e, increment) -> e.salary = e.salary + increment;

		for (Employee e : list) {
			c.accept(e, 10000.0);
		}

		Consumer<Employee> c1 = e1 -> {
			System.out.println(e1.name);
			System.out.println(e1.salary);
			System.out.println();
		};

		for (Employee e : list) {
			c1.accept(e);
		}
	
	}


}
class Employee {
	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}		
}