package chapter13;

import java.util.regex.Pattern;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "SDdfdss.d";
		boolean b = Pattern.matches("\\p{javaUpperCase}.*\\.", s);
		System.out.println(b);
	}

}
