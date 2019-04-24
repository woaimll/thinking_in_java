package chapter15;

import java.util.HashMap;
import java.util.Map;

public class ClassTypeCapture2 {
	Map<String, Class<?>> types = new HashMap<String, Class<?>>();

	public Object createNew(String typename) {
		Class<?> cl = types.get(typename);
		try {
			return cl.newInstance();
		} catch (NullPointerException e) {
			System.out.println("Not a registered typename: " + typename);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return null;
	}

	public void addType(String typename, Class<?> kind) {
		types.put(typename, kind);
	}
}
