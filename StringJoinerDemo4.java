import java.util.*;

public class StringJoinerDemo4 {
	public static void main(String[] args) {
		
		StringJoiner sJoiner1 = new StringJoiner("-", "[", "]");

		sJoiner1.setEmptyValue("This is the empty String");

		sJoiner1.add("ABC");
		sJoiner1.add("DE");
		sJoiner1.add("FG");
		sJoiner1.add("HI");
		sJoiner1.add("JKL");
		sJoiner1.add("MNO");
		sJoiner1.add("PQRST");
		sJoiner1.add("UVWXYZ");

		System.out.println(sJoiner1);

		int i = sJoiner1.length();

		System.out.println(i);

		String s = sJoiner1.toString();

		System.out.println(s);

	}
}