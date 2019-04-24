package chapter19;

public class RandomTest {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.print(Enums.random(Activity.class) + " ");
		}
	}
}
