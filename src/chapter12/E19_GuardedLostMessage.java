package chapter12;

public class E19_GuardedLostMessage {
	

	public static void main(String[] args) {
		try {
			LostMessage lm = new LostMessage();
			try {
				lm.f();
			} finally {
				try {
					lm.dispose();
				} catch (HoHumException e) {
					System.out.println(e);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
