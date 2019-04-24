package chapter12;

public class Test7 {
	public static void main(String[] args) {
		try {
			int[] i = {1,2};
			int j = i[9];
		}catch (ArrayIndexOutOfBoundsException e) {
			NullException.printLogger(e);
		}
	}
}
