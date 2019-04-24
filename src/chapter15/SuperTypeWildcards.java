package chapter15;

import java.util.ArrayList;
import java.util.List;

public class SuperTypeWildcards {
	static void writeTo(List<? super Apple> apples) {
		//apples = new ArrayList<Fruit>();
		apples.add(new Apple());
		apples.add(new Jonathan());
		//apples.add(new Fruit());
	}
}
