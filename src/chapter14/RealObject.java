package chapter14;

public class RealObject implements Interface{

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("doSomething");
	}

	@Override
	public void somethingElse(String arg) {
		// TODO Auto-generated method stub
		System.out.println("somethingElse " + arg);
	}

}
