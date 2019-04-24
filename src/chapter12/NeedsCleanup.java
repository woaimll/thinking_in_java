package chapter12;

public class NeedsCleanup {
	private static long counter = 1;
	private final long id = counter++;
	public void dispose() {
		System.out.println("NeedsCleanup " + id + " disposed");
	}
}	
