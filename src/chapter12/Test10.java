package chapter12;

public class Test10 {
	public static void f() throws NewException2 {
		try {
			g();
		} catch (NewException e) {
			// TODO Auto-generated catch block
			throw new NewException2();
		}
	}
	
	public static void g() throws NewException{
		throw new NewException();
	}
	public static void main(String[] args) {
		try {
			f();
		} catch (NewException2 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
