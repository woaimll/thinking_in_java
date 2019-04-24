package chapter14;

import java.lang.reflect.Method;

import packageaccess.HiddenC;

public class HiddenImplementation {

	public static void main(String[] args) throws Exception {
		A a = HiddenC.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		callHiddenMethod(a, "g");
		callHiddenMethod(a, "u");
		callHiddenMethod(a, "v");
		callHiddenMethod(a, "w");
	}

	static void callHiddenMethod(Object a, String str) throws Exception{
		Method g = a.getClass().getDeclaredMethod(str);
		g.setAccessible(true);
		g.invoke(a);
	}

}
