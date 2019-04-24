package chapter12;

public class Test21 extends Exercise21{
	public Test21()throws ConstructionException {
		
	}
	public static void main(String[] args) {
		try {
			new Test21();
		} catch (ConstructionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
