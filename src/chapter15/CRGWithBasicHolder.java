package chapter15;

public class CRGWithBasicHolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subtype st1 = new Subtype(),
				st2 = new Subtype();
		st1.set(st2);
		Subtype st3 = st1.get();
		st1.f();
	}

}
