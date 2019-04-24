package chapter14;

public abstract class RShape {
	void draw() {
		System.out.println(this + ".draw()");
	}

	abstract public String toString();

	void rotate(int degrees) {
		System.out.println("Rotating " + this + " by " + degrees + " degrees");
	}
}
