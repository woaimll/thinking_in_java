package chapter15;

public class FactoryConstraint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Foo2<Integer>(new IntegerFactory());
		new Foo2<Widget>(new Widget.Factory());
	}

}
