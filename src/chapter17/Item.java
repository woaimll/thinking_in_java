package chapter17;

import java.util.Random;

public class Item implements Comparable<Item>{
	private static final Random rand = new Random(47);
	private Integer it = rand.nextInt(101);
	@Override
	public int compareTo(Item o) {
		return it < o.it ? -1 : (it == o.it ? 0 : 1);
	}
	public String toString() {
		return Integer.toString(it);
	}
}
