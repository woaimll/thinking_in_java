package chapter11;

public class IDClass {
	private static int counter;
	private int count = counter++;
	public String toString() {
		return "IDClass " + count;
	}
}
