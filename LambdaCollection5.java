import java.util.*;

public class LambdaCollection5 {
	public static void main(String[] args) {
		TreeSet<Integer> tSet= new TreeSet<Integer>((a, b) -> (a > b) ? -1 : (a < b) ? 1 : 0); //Without any arhument it will
		// follow natural sorting order
		//TreeSet<Integer> tSet= new TreeSet<Integer>(NEW cOMPARAABLE);
		//Customize csorting order
		tSet.add(10);
		tSet.add(0);
		tSet.add(90);
		tSet.add(69);
		tSet.add(87);
		tSet.add(98);
		tSet.add(1450);
		tSet.add(20);
		tSet.add(0);
		System.out.println(tSet);
/*
		Collections.sort(list);
		System.out.println(list);
		System.out.println("------------------------");*/
		//Collections.sort(tSet, (a, b) -> (a > b) ? -1 : (a < b) ? 1 : 0);

		System.out.println(tSet);
	}
}