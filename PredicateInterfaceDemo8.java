import java.util.function.*; 	
import java.util.*;

public class PredicateInterfaceDemo8 {
	public static void main(String[] args) {

		Predicate<SoftwareEngineer> p1 = se -> se.age >= 18 && se.isHavingGf == true;
		
		SoftwareEngineer[] list = {
			new SoftwareEngineer("Ram", 500, true),
			new SoftwareEngineer("Arjun", 30, true),
			new SoftwareEngineer("Vinayak", 50, false),
			new SoftwareEngineer("Shyam", 15, true),
			new SoftwareEngineer("Adiyogi", 5, false),
			new SoftwareEngineer("Abhay", 27, true),
			new SoftwareEngineer("Ramnik", 28, true),
		};
		
		System.out.println("The allowed members into pub are : ");
		for (SoftwareEngineer sc1 : list ) {
			if (p1.test(sc1)) {
				System.out.println(sc1);
			}
		}
	}
}

class SoftwareEngineer {
	String name;
	int age;
	boolean isHavingGf;


	SoftwareEngineer(String name, int age, boolean isHavingGf) {
		this.name = name;
		this.age = age;
		this.isHavingGf = isHavingGf;
	}

	public String toString() {
		return this.name;
	}
}