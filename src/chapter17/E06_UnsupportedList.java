package chapter17;

import java.util.*;

public class E06_UnsupportedList {
	static void test(String msg, List<String> l) {
		System.out.println("--- " + msg + " ---");
		List<String> subList = new ArrayList<String>(l.subList(1, 8));
		try {
			l.add(0, "Test");
			System.out.println(l);
		} catch (Exception e) {
			System.out.println("add(index, element): " + e);
		}
		try {
			l.addAll(0, subList);
			System.out.println(l);
		} catch (Exception e) {
			System.out.println("addAll(index, c): " + e);
		}
		try {
			l.remove(0);
			System.out.println(l);
		} catch (Exception e) {
			System.out.println("remove(index): " + e);
		}
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
		test("Modifiable Copy", new ArrayList<String>(list));
		test("Arrays.asList()", list);
		test("unmodifiableList()", Collections.unmodifiableList(new ArrayList<String>(list)));
	}
}
