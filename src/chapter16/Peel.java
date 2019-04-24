package chapter16;

public class Peel<T> {
	T fruit;

	Peel(T fruit) {
		this.fruit = fruit;
	}

	void peel() {
		System.out.println("Peeling " + fruit);
	}
}
