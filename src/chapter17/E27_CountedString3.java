package chapter17;

import java.util.HashMap;
import java.util.Map;

import net.mindview.util.Print;

public class E27_CountedString3 {
	public static void main(String[] args) {
		Map<CountedString3, Integer> map = new HashMap<CountedString3, Integer>();
		CountedString3[] cs = new CountedString3[5];
		for (int i = 0; i < cs.length; i++) {
			cs[i] = new CountedString3("hi");
			map.put(cs[i], i); // Autobox int -> Integer
		}
		for (CountedString3 cstring : cs) {
			Print.print("Looking up " + cstring);
			Print.print(map.get(cstring));
		}
	}
}
