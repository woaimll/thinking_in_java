package chapter21;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SleepingTask2 implements Runnable{
	private static Random rnd = new Random();
	private final int sleep_time = rnd.nextInt(10) + 1;
	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(sleep_time);
		}catch (Exception e) {
			System.out.println("Interrupted: " + e);
		}
		System.out.println(sleep_time);
	}

}
