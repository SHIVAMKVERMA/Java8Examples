import java.util.*;

class MyComparator implements Comparator<Integer> {
	public int compare(Integer a, Integer b) {
		if (a > b) {
			return -1;
		} else if(a < b) {
			return 1;
		} else {
			return 0;
		}
	}
}

public class LambdaCollection3 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(0);
		list.add(15);
		list.add(5);
		list.add(20);
		System.out.println(list);

		//Collections.sort(list);
		Collections.sort(list, new MyComparator());

		System.out.println(list);
	}
}