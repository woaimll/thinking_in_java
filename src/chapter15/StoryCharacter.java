package chapter15;

public class StoryCharacter {
	private static long counter;
	private final long id = counter++;
	public String toString() {
	return getClass().getSimpleName() + " " + id;
	}
}
