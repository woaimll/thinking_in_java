package chapter15;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassAsFactory<T> {
	private Class<T> kind;
	public ClassAsFactory(Class<T> kind) {
		this.kind = kind;
	}
	public T create(int arg) {
		Constructor<?>[] con = kind.getConstructors();
		for(Constructor<?> c : con) {
			Class<?>[] czz = c.getParameterTypes();
			if(czz.length == 1) {
				if(czz[0] == int.class) {
					try {
						return kind.cast(c.newInstance(arg));
					} catch (InstantiationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
		return null;
	}
}
