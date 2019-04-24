package chapter15;

import java.util.Iterator;

public class IterableFibonacci implements Iterable<Integer>{
	private int n;
	private Fibonacci fibonacci = new Fibonacci();
	public IterableFibonacci(int count) {
		n = count;
	}
	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return n > 0;
			}

			@Override
			public Integer next() {
				n--;
				return fibonacci.next();
			}
		};
	}
	public static void main(String[] args) {
		for(int i : new IterableFibonacci(18)) {
			System.out.print(i + " ");
		}
	}

}
