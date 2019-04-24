package chapter7;

public class SelfConter {
	private  int count;
	private int id = count++;
	public String toString() {
		return "SelfCounter "+id;
	}
}
