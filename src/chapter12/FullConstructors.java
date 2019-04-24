package chapter12;

public class FullConstructors {
	public static void f() throws MyExcetion{
		System.out.println("Throwing MyException from f()");
		throw new MyExcetion();
	}
	
	public static void g() throws MyExcetion{
		System.out.println("Throwing MyException from G()");
		throw new MyExcetion("Originated in g()");
	}
	
	public static void main(String[] args) {
		try {
			f();
		} catch (MyExcetion e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
		
		try {
			g();
		} catch (MyExcetion e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
		
		try {
			f();
		} catch (MyExcetion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			g();
		} catch (MyExcetion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
