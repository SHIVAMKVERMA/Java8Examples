import java.util.*;

class Employee {
	int num;
	String name;

	Employee(int num, String name) {
		this.num = num;
		this.name = name;


	}

	public String toString() {
		return this.name + " : " + this.num;

	}
}
public class LambdaExpression10 {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Shivam"));
		list.add(new Employee(2, "Arjun"));
		list.add(new Employee(3, "Ojaswita"));
		list.add(new Employee(4, "Saurabh"));
		list.add(new Employee(5, "Abhay"));
		list.add(new Employee(6, "Ramnik"));

		//Ascending Order
		//Collections.sort(list, (e1, e2) -> (e1.num > e2.num) ? 1 : (e1.num < e2.num) ? -1 : 0 );
		//Descending Order
		//Collections.sort(list, (e1, e2) -> (e1.num > e2.num) ? -1 : (e1.num < e2.num) ? 1 : 0 );
		
		System.out.println(list);
	}
}