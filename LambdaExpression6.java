interface Interf {
	public int getLength(String s);
}

public class LambdaExpression6 {
	public static void main(String[] args) {
		Interf inf = s -> s.length();
		System.out.println(inf.getLength("Hello"));
		System.out.println(inf.getLength("WithLambdaExpression"));
	}
}