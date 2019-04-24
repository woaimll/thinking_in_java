package chapter12;

public class E18_LostMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			LostMessage2 lm = new LostMessage2();
			try {
				try {
					lm.f();
				} finally {
					lm.dispose();
				}
			} finally {
				lm.cleanup();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
