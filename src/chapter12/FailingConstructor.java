package chapter12;

public class FailingConstructor {
	public FailingConstructor()throws ConstructionException {
		throw new ConstructionException();
	}
	public void dispose() {
		System.out.println("WithDispose.dispose(): ");
	}
}
