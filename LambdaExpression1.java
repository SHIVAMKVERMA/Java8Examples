interface Interf {
	public void m1();
}
class Demo implements Interf {
	public void m1() {
		System.out.println("Normal method Implemetation");
	}
}
public class LambdaExpression1 {
	public static void main(String[] args) {
		Interf inf = new Demo();
		inf.m1();
	}
}