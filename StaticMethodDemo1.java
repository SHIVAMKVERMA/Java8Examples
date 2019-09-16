interface Interf {
	public static void m1() {
		System.out.println("interface static Method");
	}
}

public class StaticMethodDemo1 implements Interf {
	
	public static void main(String[] args) {
	
		StaticMethodDemo1 dmd2 = new StaticMethodDemo1();
		//Cannot Call Like this
		//dmd2.m1();
		//StaticMethodDemo1.m1();
		//m1();

		Interf.m1();
	}
}