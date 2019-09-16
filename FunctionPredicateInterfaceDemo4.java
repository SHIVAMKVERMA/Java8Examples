import java.util.function.*; 	
import java.util.*;
public class FunctionPredicateInterfaceDemo4 {
	public static void main(String[] args) {

		ArrayList<Employee> list1 = new ArrayList<Employee>();
		populate(list1);


		Function<ArrayList<Employee>, Double> fn = e -> {
			double totalSalary = 0;
			for(Employee emp : e) {
				totalSalary = totalSalary + emp.salary;
			}
			return totalSalary; 
		};


		System.out.println(fn.apply(list1));

		Predicate<Employee> p = e3 -> e3.salary < 3000;

		Function<Employee, Employee> fn2 = e4 -> {
			e4.salary = e4.salary + 447;
			return e4; 
		};

		ArrayList<Employee> list2 = new ArrayList<Employee>();
		//populate(list2);
		System.out.println(list2);

		for(Employee e2 : list2) {
			if (p.test(e2)) {
				fn1.apply(e2);
				list2.add(e2);
			}
		}

		System.out.println(list1);
		System.out.println("-----------------------------------------");
		System.out.println(list2);

	}

	public static void populate(ArrayList<Employee> list) {
		list.add(new Employee("Abhya", 2000));
		list.add(new Employee("Abhi", 20000));
		list.add(new Employee("Vinayak", 20000));
		list.add(new Employee("Chaitaya", 200000));
		list.add(new Employee("Ojas", 200000));
		list.add(new Employee("Rohit", 200000));
		list.add(new Employee("Mohit", 200000));

	}

}
class Employee {
	String name;
	double salary;


	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return name + " : " + salary;
	}
}
