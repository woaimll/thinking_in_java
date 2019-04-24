package chapter14;

public class Percussion implements Instrument{
	public void play() { System.out.println("Percussion.play()"); }
	public String what() { return "Percussion"; }
	public void adjust() {}
	public void prepareInstrument() {
		System.out.println("Percussion.prepareInstrument");
	}
}
