package chapter17;

import java.util.*;
import static net.mindview.util.Print.*;
import static net.mindview.util.Countries.*;

public class E01_CountryList {
	private static Random rnd = new Random(47);
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>(names(8));
		Collections.sort(l);
		print("sorted: " + l);
		for(int i = 1; i < 5; i++) {
		Collections.shuffle(l, rnd);
		print("shuffled (" + i + "): " + l);
		}
	}
}
