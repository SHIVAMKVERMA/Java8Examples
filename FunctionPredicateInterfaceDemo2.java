import java.util.function.*; 	
import java.util.*;
public class FunctionPredicateInterfaceDemo2 {
	public static void main(String[] args) {

		ArrayList<Student> list1 = new ArrayList<Student>();
		populate(list1);



		Function<Student, String> f = s -> {
			int marks = s.marks;
			if (marks >= 80) {
				return "A[Distinction]";
			} else if (marks >= 60) {
				return "B[First Class]";
			} else if (marks >= 50) {
				return "C[Second Class]";
			} else if (marks >= 35) {
				return "D[Third Class]";
			} else {
				return "E[Failed]";
			}
		};

		Predicate<Student> p = s -> s.marks >= 60;

		for(Student s2 : list1) {
			if (p.test(s2)) {
				System.out.println("Name: " + s2.name);
				System.out.println("Marks: " + s2.marks);
				System.out.println("Grade: " + f.apply(s2));
				System.out.println("-----------------------------------");		
			}
		}
		/*for(Student s1 : list1) {
			System.out.println("Name: " + s1.name);
			System.out.println("Marks: " + s1.marks);
			System.out.println("Grade: " + f.apply(s1));
			System.out.println("-----------------------------------");
		}*/

	}

	public static void populate(ArrayList<Student> list) {
		list.add(new Student("Ram", 400));
		list.add(new Student("Adiyogi", 500));
		list.add(new Student("Indra", 30));
		list.add(new Student("Shyam", 80));
		list.add(new Student("Buddha", 65));
		list.add(new Student("Mangal", 60));
		list.add(new Student("Sunny", 50));
	}

}
class Student {
	String name;
	int marks;


	Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}
