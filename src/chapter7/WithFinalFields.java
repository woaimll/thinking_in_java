package chapter7;

public class WithFinalFields {
	final SelfConter scf = new SelfConter();
	static final SelfConter scsf = new SelfConter();
	public String toString() {
		return "scf = " + scf + "\nscsf = " + scsf;
	}
}
