package chapter12;

public class MultipleRetruns {
	public static void f(int i) {
		System.out.println("Initialization that requires cleanup");
		try {
			System.out.println("Point 1");
			if(i == 1) return;
			System.out.println("Point 2");
			if(i == 2) return;
			System.out.println("Point 3");
			if(i == 3) return;
			System.out.println("End");
			return;
		}finally {
			System.out.println("Performing cleanup");
		}
	}
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			f(i);
		}
	}
}
