package chapter17;

import static net.mindview.util.Print.*;

public class E25_FullSimpleHashMap2 {
	public static void main(String args[]) {
		SimpleHashMap5<String, String> m = new SimpleHashMap5<String, String>(),
				m2 = new SimpleHashMap5<String, String>();
		/*m.putAll(Countries.capitals(10));
		m2.putAll(Countries.capitals(10));
		print("m.size() = " + m.size());
		print("m.isEmpty() = " + m.isEmpty());
		print("m.equals(m2) = " + m.equals(m2));
		print("m.containsKey(\"BENIN\") = " + m.containsKey("BENIN"));
		print("m.containsKey(\"MARS\") = " + m.containsKey("MARS"));
		print("m.keySet() = " + m.keySet());
		print("m.values() = " + m.values());
		m.remove("ALGERIA");
		print("m = " + m);*/
		m2.put("A", "11111");
		m2.put("B", "ddddd");
		m2.put("A", "ffff");
	}
}
