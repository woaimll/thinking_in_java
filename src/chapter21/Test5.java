package chapter21;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test5 {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> list = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			list.add(exec.submit(new Fibonacci2(i)));
		}
		for(Future<String> f : list) {
			try {
				System.out.println(f.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				exec.shutdown();
			}
		}
	}
}
