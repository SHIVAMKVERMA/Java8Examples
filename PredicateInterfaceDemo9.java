import java.util.function.*; 	
import java.util.*;

public class PredicateInterfaceDemo9 {
	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();
		populate(list);
		

		Predicate<Employee> p1 = emp -> emp.designation.equals("Manager");
		System.out.println("Managers Information: ");
		display(p1, list);

		Predicate<Employee> p2 = emp -> emp.city.equals("Bangalore");
		System.out.println("Employee City Information From Bangalore : ");
		display(p2, list);

		Predicate<Employee> p3 = emp -> emp.salary < 20000;
		System.out.println("Employee Salary Information Below 20,000 : ");
		display(p3, list);

		Predicate<Employee> p4 = emp -> emp.salary > 20000;
		System.out.println("Employee Salary Information Above 20,000 : ");
		display(p4, list);

		//Predicate Joining
		System.out.println("All Manager from Bangalore : ");
		display(p1.and(p2), list);

		//Predicate Joining
		System.out.println("All Manager or salary less than 20,000 : ");
		display(p1.or(p3), list);

		//Negate Method
		System.out.println("All Emploees who are not Managers : ");
		display(p1.negate(), list);


		Predicate<Employee> p5 = Predicate.isEqual(new Employee("Ram", "CEO", 100000, "Satyalok"));
		System.out.println(p5.test(new Employee("Shyam", "Manager", 100000, "Hyderabad")));
		System.out.println(p5.test(new Employee("Ojaswita", "Employee", 100000000, "Pune")));
		System.out.println(p5.test(new Employee("Ram", "CEO", 100000, "Satyalok")));


	}

	public static void populate(ArrayList<Employee> list) {
		list.add(new Employee("Hey Ram", "General Manager", 100000, "Satyalok"));
		list.add(new Employee("Shyam", "Manager", 100000, "Hyderabad"));
		list.add(new Employee("Ram", "Manager", 100000, "Bangalore"));
		list.add(new Employee("Shyan", "Employee", 100000, "Hyderabad"));
		list.add(new Employee("Ojaswita", "Employee", 100000000, "Pune"));
		list.add(new Employee("Vinayak", "Employee", 10000, "Nagpur"));
		list.add(new Employee("Abhay", "Employee", 10000, "Bangalore"));
		list.add(new Employee("Ramnik", "Employee", 10000, "Pune"));
	}

	public static void display(Predicate<Employee> p, ArrayList<Employee> list) {
		for (Employee e : list) {
			if (p.test(e)) {
				System.out.println(e);
			}
		}
		System.out.println("-------------------------------------------------");
	}
}

class Employee {
	String name;
	String designation;
	double salary;
	String city;


	Employee(String name, String designation, double salary, String city) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	public String toString() {
		String s = String.format("(%s, %s, %.2f, %s)", name, designation, salary, city);
		return s;
	}

	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		if (name.equals(e.name)&&designation.equals(e.designation)&&salary==e.salary&&city.equals(e.city)) {
			return true;
		} else {
			return false;
		}
	}
}