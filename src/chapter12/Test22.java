package chapter12;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FailingConstructor f = new FailingConstructor();
		} catch (ConstructionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
