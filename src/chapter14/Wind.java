package chapter14;

public class Wind implements Instrument{
	public void play() { System.out.println("Wind.play()"); }
	public String what() { return "Wind"; }
	public void adjust() {}
	public void clearSpitValve() {
		System.out.println("Wind.clearSpitValve");
	}
	public void prepareInstrument() {
	clearSpitValve();
	}
}
