package chapter14;

class SuperToy extends FancierToy{
	int IQ;
	public SuperToy(int intelligence) {
		IQ = intelligence;
	}
	public String toString() {
		return "I'm a SuperToy. I'm smarter than you.";
	}
}
