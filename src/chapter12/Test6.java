package chapter12;

public class Test6 {
	public static void main(String[] args) {
		try {
			throw new Exercise6_1();
		}catch (Exercise6_1 e) {
			e.printStackTrace();
		}
		
		try {
			throw new Exercise6_2();
		}catch (Exercise6_2 e) {
			System.err.println(e);
		}
	}
}
