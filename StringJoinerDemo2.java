import java.util.*;

public class StringJoinerDemo2 {
	public static void main(String[] args) {
		
		StringJoiner sJoiner = new StringJoiner("-", "[", "]");

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