package chapter13;

import java.util.regex.Pattern;

public class Test10 {
	private static final String str = "Java now has regular expressions";
	public static boolean show(String s) {
		boolean b = Pattern.matches(s, str);
		return b;
	}
	public static void main(String[] args) {
		System.out.println(show("^Java"));
		System.out.println(show("\\Breg.*"));
		
	}
}
