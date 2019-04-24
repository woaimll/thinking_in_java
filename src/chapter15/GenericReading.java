package chapter15;

import java.util.Arrays;
import java.util.List;

public class GenericReading {
	static <T> T readExact(List<T> list) {
		return list.get(0);
				
	}
	static List<Apple> apples = Arrays.asList(new Apple());
	static List<Fruit> fruit = Arrays.asList(new Fruit());
	static void f1() {
		Apple a = readExact(apples);
		Fruit f = readExact(fruit);
		f = readExact(apples);
	}
	static class Reader<T>{
		T readExact(List<T> list) {
			return list.get(0);
		}
	}
	static void f2() {
		Reader<Fruit> fruitReader = new Reader<>();
		Fruit f = fruitReader.readExact(fruit);
		//f = fruitReader.readExact(apples);
	}
	static class CovariantRead<T>{
		T readCovariant(List<? extends T> list) {
			return list.get(0);
		}
	}
	static void f3() {
		CovariantRead<Fruit> cr = new CovariantRead<>();
		Fruit f = cr.readCovariant(fruit);
		Fruit a = cr.readCovariant(apples);
	}
}
