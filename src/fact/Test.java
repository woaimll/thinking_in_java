package fact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	public static <T> void f(T t) {
		System.out.println();
	}
	static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= (1<<30)) ? (1<<30) : n + 1;
    }
	public static void main(String[] args) {
//		Factory<String> f = new SnowFactory();
//		System.out.println(f.getClass().getInterfaces());
		/*char[] c = {'a','b','g'};
		String s = new String(c);
		System.out.println(s);*/
		int a = tableSizeFor(16);
	}

}
