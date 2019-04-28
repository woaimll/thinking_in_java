package chapter21;

import java.util.Arrays;
import java.util.concurrent.Callable;

import chapter15.Generator;

public class Fibonacci2 implements Callable<String>,Generator<Integer>{
	private int count;
	private final int n;

	public Fibonacci2(int n) {
		this.n = n;
	}
	@Override
	public String call() throws Exception {
		Integer[] sequence = new Integer[n];
		for (int i = 0; i < n; i++)
			sequence[i] = next();
		System.out.println("#####" + Arrays.toString(sequence));
		return "Seq. of " + n + ": " + Arrays.toString(sequence);
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return fib(count++);
	}
	private int fib(int n) {
		if (n < 2)
			return 1;
		return fib(n - 2) + fib(n - 1);
	}
}
