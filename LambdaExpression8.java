interface Interf {
	public int squareIt(int n);
}

public class LambdaExpression8 {
	public static void main(String[] args) {
		Interf inf = n -> n * n;
		System.out.println(inf.squareIt(4));
		System.out.println(inf.squareIt(9));
	}
}