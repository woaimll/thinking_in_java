package chapter12;

public class RethrowNew {
	public static void f()throws OneException{
		System.out.println("originating the exception in f()");
		throw new OneException("thrown from f()");
	}
	public static void main(String[] args) {
		try {
			try {
				f();
			}catch (OneException e) {
				System.out.println(
						"Caught in inner try, e.printStackTrace()");
				e.printStackTrace(System.out);
				throw new TwoException("from inner try");
			}
		}catch (TwoException e) {
			System.out.println(
					"Caught in outer try, e.printStackTrace()");
			e.printStackTrace(System.out);
		}
	}
}
