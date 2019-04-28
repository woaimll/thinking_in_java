package chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class E06_SleepingTask2 {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		if (args.length != 1) {
			System.err.println("Provide the quantity of tasks to run");
			return;
		}
		for (int i = 0; i < Integer.parseInt(args[0]); i++) {
			exec.execute(new SleepingTask2());
			
		}
		Thread.yield();
		exec.shutdown();
	}
}
