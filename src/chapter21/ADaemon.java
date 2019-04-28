package chapter21;

import java.util.concurrent.TimeUnit;

public class ADaemon implements Runnable{
	private static int count = 0;
	private final int num = count++;
	@Override
	public void run() {
		try {
			System.out.println("Starting ADaemon" + num);
			TimeUnit.SECONDS.sleep(1);
		}catch (Exception e) {
			System.out.println("Exiting via InterruptedException");
		}finally {
			System.out.println("This should always run?");
		}
		
	}

}
