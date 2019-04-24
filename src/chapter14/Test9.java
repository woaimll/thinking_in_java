package chapter14;

import java.lang.reflect.Field;
import java.util.*;

public class Test9 {
	static Set<Class<?>> alreadyDisplayed = new HashSet<>();
	static void printClasses(Class<?> c) {
		if(c == null) {
			return;
		}
		System.out.println(c.getName());
		Field[] fields = c.getDeclaredFields();
		if(fields.length != 0) {
			System.out.println("Fields:");
		}
		for(Field fld : fields) {
			System.out.println("  " + fld);
		}
		for(Field fld : fields) {
			Class<?> k = fld.getType();
			if(!alreadyDisplayed.contains(k)) {
				printClasses(k);
				alreadyDisplayed.add(k);
			}
		}
		for(Class<?> k : c.getInterfaces()) {
			System.out.println("Interface: " + k.getName());
			printClasses(k.getSuperclass());
		}
		printClasses(c.getSuperclass());
	}
	public static void main(String[] args) throws ClassNotFoundException {
		for (int j = 0; j < args.length; j++) {
			System.out.println("Displaying " + args[j]);
			printClasses(Class.forName(args[j]));
			if(j < args.length - 1)
				System.out.println("==================");
		}
	}
}
