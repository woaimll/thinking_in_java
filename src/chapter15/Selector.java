package chapter15;

public interface Selector<T> {
	boolean end();
	T current();
	void next();
}
