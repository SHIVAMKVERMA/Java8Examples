import java.util.*;

public class StringJoinerDemo1 {
	public static void main(String[] args) {
		
		ArrayList<String> alist = new ArrayList<String>();

		StringJoiner sJoiner = new StringJoiner("-");

		sJoiner.add("ABC");
		sJoiner.add("DE");
		sJoiner.add("FG");
		sJoiner.add("HI");
		sJoiner.add("JKL");
		sJoiner.add("MNO");
		sJoiner.add("PQRST");
		sJoiner.add("UVWXYZ");



		System.out.println(sJoiner);
	}
}