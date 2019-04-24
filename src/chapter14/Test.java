package chapter14;

import java.lang.reflect.Field;

public class Test {
	public static void f(Class<?> c) {
		Field[] fields = c.getDeclaredFields();
		for(Field f : fields) {
			System.out.println(f);
		}
	}
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("chapter14.Derived");
		f(c);
	}

}
