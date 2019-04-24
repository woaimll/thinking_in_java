package chapter13;

public class Test {

	public static void main(String[] args) {
		String s = "abcdef";
		boolean b = s.startsWith("abd");
		String s2 = s.intern();
		System.out.println(s2);
	}

}
