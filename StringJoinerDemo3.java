import java.util.*;

public class StringJoinerDemo3 {
	public static void main(String[] args) {
		
		StringJoiner sJoiner1 = new StringJoiner("-", "[", "]");

		StringJoiner sJoiner2 = new StringJoiner("-");

		sJoiner1.add("ABC");
		sJoiner1.add("DE");
		sJoiner1.add("FG");



		sJoiner2.add("HI");
		sJoiner2.add("JKL");
		sJoiner2.add("MNO");
		sJoiner2.add("PQRST");
		sJoiner2.add("UVWXYZ");

		System.out.println(sJoiner1);
		System.out.println(sJoiner2);

		StringJoiner sJoiner3 = sJoiner1.merge(sJoiner2);

		System.out.println(sJoiner3);
	}
}