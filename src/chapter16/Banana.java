package chapter16;

public class Banana {
	private final int id;

	Banana(int id) {
		this.id = id;
	}

	public String toString() {
		return getClass().getSimpleName() + " " + id;
	}
}
