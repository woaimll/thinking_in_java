package chapter17;

import java.util.PriorityQueue;

public class E11_PriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Item> queue = 
				new PriorityQueue<>();
		for (int i = 0; i < 10; i++) {
			queue.add(new Item());
		}
		Item item;
		while((item = queue.poll()) != null) {
			System.out.println(item);
		}
	}
}
