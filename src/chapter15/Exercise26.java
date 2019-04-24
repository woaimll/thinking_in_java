package chapter15;

public class Exercise26 {
	public static void main(String[] args) {
		Number[] n = new Integer[10];
		try {
			n[0] = 9.0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
