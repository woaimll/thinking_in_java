package chapter14;

import java.lang.reflect.Constructor;

public class E19_ReflectionToyCreation {
	public static Toy makeToy(String toyName, int IQ) {
		try {
			Class<?> tClass = Class.forName(toyName);
			for(Constructor<?> ctor : tClass.getConstructors()) {
				Class<?>[] params = ctor.getParameterTypes();
				if(params.length == 1) {
					if(params[0] == int.class) {
						return (Toy) ctor.newInstance(new Object[] {IQ});
					}
				}
			}
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
		return null;
	}
	public static void main(String[] args) {
		System.out.println(makeToy("chapter14.SuperToy", 150));
		System.out.println(Integer.valueOf(190));
	}
}
