package chapter12;

public class Exercise4 extends Exception{
	private String str;
	public Exercise4() {
		
	}
	public Exercise4(String str) {
		this.str = str;
	}
	public void show() {
		System.out.println(str);
	}
}
