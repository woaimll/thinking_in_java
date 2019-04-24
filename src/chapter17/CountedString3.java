package chapter17;

import java.util.ArrayList;
import java.util.List;

public class CountedString3 {
	private static List<String> created = new ArrayList<String>();
	private String s;
	private int id = 0;

	public CountedString3(String str) {
		s = str;
		created.add(s);
		// id is the total number of instances
		// of this string in use by CountedString3:
		for (String s2 : created)
			if (s2.equals(s))
				id++;
	}

	public String toString() {
		return "String: " + s + " id: " + id + " hashCode(): " + hashCode();
	}

	public int hashCode() {
		// The very simple approach:
		// return s.hashCode();
		// Using Joshua Bloch's recipe:
		int result = 17;
		result = 37 * result + s.hashCode();
		// result = 37 * result + id;
		return result;
	}

	public boolean equals(Object o) {
		return o instanceof CountedString3 && s.equals(((CountedString3) o).s) && id == ((CountedString3) o).id;
	}
}
