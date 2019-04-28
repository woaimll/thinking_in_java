package chapter21;

public class DaemonsDontRunFinally {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			
			Thread t = new Thread(new ADaemon());
			t.setDaemon(true);
			t.start();
		}
	}
}
