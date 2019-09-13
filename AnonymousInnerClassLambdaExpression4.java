import java.util.*;

interface Interf {
	public void m1();
}
public class AnonymousInnerClassLambdaExpression4 {

	int x = 888;

	public void m2() {
		Interf i = new Interf() {
			int x = 999; // We can declare instance variable 
			public void m1() {
				System.out.println(this.x); // this is referring to current Inner class object
			}
		};
		i.m1();
	}

	public static void main(String[] args) {
		AnonymousInnerClassLambdaExpression4 an = new AnonymousInnerClassLambdaExpression4();
		an.m2();
	}
}