interface Interf {
	public int squareIt(int n);
}
class Demo implements Interf {
	public int squareIt(int n) {
		return n * n;
	}	
}
public class LambdaExpression7 {
	public static void main(String[] args) {
		Interf inf = new Demo();
		System.out.println(inf.squareIt(5));
		System.out.println(inf.squareIt(9));
	}
}