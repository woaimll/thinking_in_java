package chapter15;

public class IntegerFactory implements FactoryI<Integer>{

	@Override
	public Integer create() {
		// TODO Auto-generated method stub
		return new Integer(0);
	}

}
