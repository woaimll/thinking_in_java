package chapter14;

public class SimpleProxy implements Interface{
	private Interface proxied;
	public SimpleProxy(Interface proxied) {
		this.proxied = proxied;
	}
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("SimplePorxy doSomething");
		long start = System.nanoTime();
		proxied.doSomething();
		long duration = System.nanoTime() - start;
		System.out.println("METHOD-CALL TIME: " + duration);
	}

	@Override
	public void somethingElse(String arg) {
		System.out.println("SimpleProxy somethingElse " + arg);
		long start = System.nanoTime();
		proxied.somethingElse(arg);
		long duration = System.nanoTime() - start;
		System.out.println("METHOD-CALL TIME: " + duration);
	}

}
