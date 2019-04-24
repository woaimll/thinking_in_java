package chapter12;

public class Exercise5 extends Exception{
	private int i = 0;
	public void add() {
		i++;
	}
	public int getI() {
		return i;
	}
	public void show() {
		System.out.println(i);
	}
}
