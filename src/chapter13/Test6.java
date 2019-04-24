package chapter13;

public class Test6 {
	private int a = 1;
	private long b = 99999999;
	private float c = 32.534f;
	public String toString() {
		return String.format("%d %d %f", a,b,c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Test6());
	}

}
