package chapter14;

import java.lang.reflect.Proxy;

public class SelectingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomeMethods proxy = (SomeMethods) Proxy.newProxyInstance(SomeMethods.class.getClassLoader(),
				new Class[] {SomeMethods.class}, new MethodSelector(new Implementation()));
		proxy.boring1();
		proxy.boring2();
		proxy.interesting("bonobo");
		proxy.boring3();
	}

}
