package chapter15;

public class ErasureAndInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived2 d2 = new Derived2();
		Object obj = d2.get();
		d2.set(obj);
	}

}
