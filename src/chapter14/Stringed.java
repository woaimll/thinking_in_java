package chapter14;

public class Stringed implements Instrument{
	public void play() { System.out.println("Stringed.play()"); }
	public String what() { return "Stringed"; }
	public void adjust() {}
	public void prepareInstrument() {
		System.out.println("Stringed.prepareInstrument");
	}
}
