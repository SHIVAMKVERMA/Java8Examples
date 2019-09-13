interface Interf {
	public void m1();
}
public class LambdaExpression2 {
	public static void main(String[] args) {
		Interf inf = () -> System.out.println("Lambda Expression Implementation");
		inf.m1();
	}
}