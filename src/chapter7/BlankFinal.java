package chapter7;

public class BlankFinal {
	private final int i = 0;
	private final int j;
	private final People p;
	public BlankFinal() {
		j = 1;
		p = new People(1);
	}
	public BlankFinal(int x) {
		j = x;
		p = new People(x);
	}
	public static void main(String[] args) {
		new BlankFinal();
		new BlankFinal(44);
	}
}
