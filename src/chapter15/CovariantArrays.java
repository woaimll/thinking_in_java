package chapter15;

public class CovariantArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit[] fruit = new Apple[10];
		fruit[0] = new Apple();
		fruit[1] = new Jonathan();
		try {
			fruit[0] = new Fruit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		try {
			fruit[0] = new Orange();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
