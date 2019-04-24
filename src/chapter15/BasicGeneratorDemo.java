package chapter15;

import fact.CountedObject;

public class BasicGeneratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generator<CountedObject> gen =
				new BasicGenerator(CountedObject.class);
		for (int i = 0; i < 5; i++) {
			System.out.println(gen.next());
		}
	}

}
