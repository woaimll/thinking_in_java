package chapter15;

public abstract class GenericWithCreate<T> {
	final T element;
	public GenericWithCreate() {
		element = create();
	}
	abstract T create();
}
