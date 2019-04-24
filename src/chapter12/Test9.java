package chapter12;

public class Test9 {
	public static void aa() throws OneException,TwoException,ThreeException{
		//throw new OneException();
		//throw new TwoException();
		//throw new ThreeException();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			aa();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
