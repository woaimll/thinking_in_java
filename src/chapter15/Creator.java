package chapter15;

public class Creator extends GenericWithCreate<X>{
	@Override
	X create() {
		// TODO Auto-generated method stub
		return new X();
	}
	void f() {
		System.out.println(element.getClass().getSimpleName());
	}

}
