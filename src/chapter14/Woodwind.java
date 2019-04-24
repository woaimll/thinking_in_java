package chapter14;

public class Woodwind extends Wind{
	public void play() { System.out.println("Woodwind.play()"); }
	public String what() { return "Woodwind"; }
	public void clearSpitValve() {
		System.out.println("Woodwind.clearSpitValve");
	}
}
