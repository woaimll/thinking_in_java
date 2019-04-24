package chapter12;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		try {
			s.length();
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e);
		}
	}

}
