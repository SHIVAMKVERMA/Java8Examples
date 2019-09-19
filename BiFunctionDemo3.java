import java.util.function.*;
import java.util.*;
public class BiFunctionDemo3 {
	public static void main(String[] args) {
		//i -> i > 10;		
		ArrayList<Student> list = new ArrayList<Student>();


		BiFunction<Employee, TimeSheet, Double> f = (e, t) -> e.dailyWage * t.days;
		
		Employee e = new Employee(101, "Abhay", 1500);
		TimeSheet t = new TimeSheet(101, 25);

		System.out.println("Monthly Salary: " + f.apply(e, t));
		
	}

}
class Employee {
	String name;
	int eno;
	double dailyWage;

	Employee(int eno, String name, double dailyWage) {
		this.eno = eno;
		this.name = name;
		this.dailyWage = dailyWage;
	}
}

class TimeSheet {
	int eno;
	int days;

	TimeSheet(int eno, int days) {
		this.eno = eno;
		this.days = days;
	}
}