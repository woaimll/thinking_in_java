package chapter15;

public class Widget {
	public static class Factory implements FactoryI<Widget>{

		@Override
		public Widget create() {
			// TODO Auto-generated method stub
			return new Widget();
		}
		
	}
}
