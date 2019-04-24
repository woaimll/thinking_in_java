package chapter16;

import java.util.ArrayList;

public class E09_PeelBanana {

	public static void main(String[] args) {
		// Compile error:
		// ! Peel<Banana>[] a = new Peel<Banana>[10];
		ArrayList<Peel<Banana>> a = new ArrayList<Peel<Banana>>();
		for (int i = 0; i < 10; i++)
			a.add(new Peel<Banana>(new Banana(i)));
		for (Peel<Banana> p : a)
			p.peel();
	}

}
