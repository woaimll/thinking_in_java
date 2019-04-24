package chapter12;

public class Test4 {

	public static void main(String[] args) {

		try {
			throw new Exercise4("hahaha");
		}catch (Exercise4 e) {
			e.show();
		}
	}

}
