interface Interf {
	public void add(int a, int b);
}

public class LambdaExpression4 {
	public static void main(String[] args) {
		Interf inf = (a, b) -> System.out.println("Sum : " + (a + b));
		inf.add(10, 20);
		inf.add(100, 200);
	}
}