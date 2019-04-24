package chapter13;

import java.util.Scanner;

public class Test20 {
	private static int a;
	private static long b;
	private static float c;
	private static double d;
	private static String s;
	public static void full(String str) {
		Scanner sc = new Scanner(str);
		a = sc.nextInt();
		b = sc.nextLong();
		c = sc.nextFloat();
		d = sc.nextDouble();
		s = sc.next();
	}
	public static void show() {
		System.out.println(a + "*" + b + "*" + c + "*" + d + "*" + s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		full("1 43434 1.1 2.43 sdfaf");
		show();
	}

}
