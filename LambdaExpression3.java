interface Interf {
	public void add(int a, int b);
}
class Demo implements Interf {
	public void add(int a, int b) {
		System.out.println("Sum : " + (a + b));
	}
}
public class LambdaExpression3 {
	public static void main(String[] args) {
		Interf inf = new Demo();
		inf.add(10, 20);
	}
}