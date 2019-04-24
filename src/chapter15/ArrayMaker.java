package chapter15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMaker<T> {
	private Class kind;
	public ArrayMaker(Class kind) {
		this.kind = kind;
	}
	T[] create(int size) {
		return (T[]) Array.newInstance(kind, size);
	}
	public static void main(String[] args) {
		ArrayMaker<String> maker = new ArrayMaker<>(String.class);
		String[] stringArray = maker.create(9);
		System.out.println(Arrays.toString(stringArray));
	}
}
