interface Interf {
	public void m1();
}
public class AnonymousInnerClassLambdaExpression5 {

	int x = 888;

	public void m2() {
		Interf i = () -> {
			int x = 99;
			System.out.println(this.x); 
		};
		i.m1();		

	}

	public static void main(String[] args) {
		AnonymousInnerClassLambdaExpression5 an = new AnonymousInnerClassLambdaExpression5();
		an.m2();
	}
}