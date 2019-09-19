import java.util.function.*;
import java.util.*;
public class BiFunctionDemo2 {
	public static void main(String[] args) {
		//i -> i > 10;		
		ArrayList<Student> list = new ArrayList<Student>();


		BiFunction<String, Integer, Student> f = (name, rollNumber) -> new Student(name, rollNumber);
		
		list.add(f.apply("Abhay", 2));
		list.add(f.apply("Ramnik", 5));
		list.add(f.apply("Rohit", 4));
		list.add(f.apply("Mohit", 6));

		for (Student s : list) {
			System.out.println("Name of Student: " + s.name);
			System.out.println("Roll Number of Student: " + s.rollNumber);
			System.out.println();
		}
	}

}
class Student {
	String name;
	int rollNumber;

	Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
}
