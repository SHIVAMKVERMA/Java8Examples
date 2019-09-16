import java.util.function.*; 	
import java.util.*;
public class FunctionPredicateInterfaceDemo3 {
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

	}

	public static void populate(ArrayList<Employee> list) {
		list.add(new Employee("Abhya", 200000));
		list.add(new Employee("Abhi", 200000));
		list.add(new Employee("Vinayak", 200000));
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
