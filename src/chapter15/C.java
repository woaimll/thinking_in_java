package chapter15;

public class C extends SelfBounded<C>{
	C setAndGet(C arg) {
		set(arg);
		return get();
	}
}
