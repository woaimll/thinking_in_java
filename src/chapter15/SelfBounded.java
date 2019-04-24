package chapter15;

public class SelfBounded<T extends SelfBounded<T>> {
	T element;
	SelfBounded<T> set(T arg){
		element = arg;
		return this;
	}
	T get() {
		return element;
	}
}
