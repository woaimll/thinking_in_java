package chapter15;

public class FixedSizeStack<T> {
	private int index = 0;
	private Object[] storage;
	public FixedSizeStack(int size) {
		storage = new Object[size];
	}
	public void push(T item) {
		storage[index++] = item;
	}
	
	public T pop() {
		return (T) storage[--index];
	}
}
