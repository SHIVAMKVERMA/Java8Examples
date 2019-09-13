import java.util.*;

public class AnonymousInnerClassLambdaExpression1 {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run() {
				for (int i = 0;i < 10;i++) {
					System.out.println("Child Thread");
				}
			}
		};

		Thread t = new Thread(r);
		t.start();
		for (int i = 0;i < 10;i++) {
			System.out.println("Main Thread");
		}
	}
}