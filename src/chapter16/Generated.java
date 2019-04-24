package chapter16;

import chapter15.Generator;
import net.mindview.util.CollectionData;

public class Generated {
	public static <T> T[] array(T[] a, Generator<T> gen) {
		return new CollectionData<T>((net.mindview.util.Generator<T>) gen, a.length).toArray(a);
	}
}
