interface Interf {
	public void m1();
}
public class AnonymousInnerClassLambdaExpression6 {

	int x = 10;

	public void m2() {
		int y = 90; 

		Interf i = () -> {
			System.out.println(y); 
			System.out.println(x); 
		};
		i.m1();		

	}

	public static void main(String[] args) {
		AnonymousInnerClassLambdaExpression6 an = new AnonymousInnerClassLambdaExpression6();
		an.m2();
	}
}