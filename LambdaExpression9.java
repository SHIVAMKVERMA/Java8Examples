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
public class LambdaExpression9 {
	public static void main(String[] args) {
		Employee e = new Employee(1, "Shivam");
		System.out.println(e);
	}
}