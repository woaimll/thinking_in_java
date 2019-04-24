package chapter15;

public class LittleFish {
	private static long counter = 1;
	private final long id = counter++;

	private LittleFish() {
	}

	public String toString() {
		return "LittleFish " + id;
	}

	public static Generator<LittleFish> generator() {
		return new Generator<LittleFish>() {
			public LittleFish next() {
				return new LittleFish();
			}
		};
	}
}
