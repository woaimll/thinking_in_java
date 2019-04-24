package chapter12;

public class FailingConstructor2 {
	private final WithDispose wd1, wd2;

	FailingConstructor2(boolean fail) throws ConstructionException {
		wd1 = new WithDispose(1);
		try {
			// "Simulate" other code that might throw exceptions
			if (fail)
				throw new ConstructionException();
		} catch (ConstructionException e) {
			wd1.dispose();
			throw e;
		}
		wd2 = new WithDispose(2);
	}
}
