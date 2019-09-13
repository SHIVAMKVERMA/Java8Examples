import java.util.*;

public class LambdaCollection6 {
	public static void main(String[] args) {
		TreeMap<Integer, String> tmap= new TreeMap<Integer, String>((a, b) -> (a > b) ? -1 : (a < b) ? 1 : 0);
		//TreeMap<Integer, String> tmap= new TreeMap<Integer, String>();
		
		tmap.put(10, "A");
		tmap.put(0, "B");
		tmap.put(90, "C");
		tmap.put(69, "D");
		tmap.put(87, "E");
		tmap.put(98, "F");
		tmap.put(1450, "G");
		tmap.put(20, "H");
		tmap.put(0, "I");
		//System.out.println(tmap);
/*
		Collections.sort(list);
		System.out.println(list);
		System.out.println("------------------------");*/
		//Collections.sort(tSet, (a, b) -> (a > b) ? -1 : (a < b) ? 1 : 0);

		System.out.println(tmap);
	}
}