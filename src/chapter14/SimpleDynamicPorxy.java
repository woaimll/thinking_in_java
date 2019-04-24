package chapter14;

import java.lang.reflect.Proxy;

public class SimpleDynamicPorxy {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}
	public static void main(String[] args) {
		RealObject real = new RealObject();
		consumer(real);
		Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), 
				new Class[] {Interface.class}, new DynamicProxyHandler(real));
		consumer(proxy);
	}
}
