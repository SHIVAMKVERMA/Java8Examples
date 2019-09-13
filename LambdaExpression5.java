interface Interf {
	public int getLength(String s);
}
class Demo implements Interf {
	public int getLength(String s) {
		return s.length();
	}	
}
public class LambdaExpression5 {
	public static void main(String[] args) {
		Interf inf = new Demo();
		System.out.println(inf.getLength("Hello"));
	}
}