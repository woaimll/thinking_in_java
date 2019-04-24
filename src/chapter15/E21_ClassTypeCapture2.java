package chapter15;

public class E21_ClassTypeCapture2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassTypeCapture2 ctt = new ClassTypeCapture2();
		ctt.addType("Building", Building.class);
		ctt.addType("House", House.class);
		ctt.addType("Product", Product.class);
		System.out.println(ctt.createNew("Building").getClass());
		System.out.println(ctt.createNew("House").getClass());
		ctt.createNew("Product");
		ctt.createNew("Car");
	}

}
