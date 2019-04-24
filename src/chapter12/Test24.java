package chapter12;

public class Test24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FailingConstructor f = new FailingConstructor();
			f.dispose();
		} catch (ConstructionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
