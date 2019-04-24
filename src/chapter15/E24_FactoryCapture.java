package chapter15;

public class E24_FactoryCapture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryCapture fc = new FactoryCapture();
		fc.addFactory("Integer", new IntegerFactory());
		fc.addFactory("chapter15.Widget", new Widget.Factory());
		System.out.println(fc.createNew("Integer"));
		System.out.println(fc.createNew("chapter15.Widget"));
		fc.createNew("chapter15.Product");
	}

}
