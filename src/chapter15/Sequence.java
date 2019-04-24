package chapter15;

public class Sequence<T> {
	private Object[] items;
	private int next;

	public Sequence(int size) {
		items = new Object[size];
	}

	public void add(T x) {
		if (next < items.length)
			items[next++] = x;
	}

	private class SequenceSelector implements Selector<T> {
		private int i;

		public boolean end() {
			return i == items.length;
		}

		@SuppressWarnings("unchecked")
		public T current() {
			return (T) items[i];
		}

		public void next() {
			if (i < items.length)
				i++;
		}
	}
	public Selector<T> selector() {
		return new SequenceSelector();
	}
}
