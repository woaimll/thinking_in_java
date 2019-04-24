package chapter13;

import java.util.ArrayList;

import generics.coffee.Coffee;
import generics.coffee.CoffeeGenerator;

public class ArrayListDisplay {

	public static void main(String[] args) {
		ArrayList<Coffee> coffees = new ArrayList<Coffee>();
		for(Coffee c : new CoffeeGenerator(10)) {
			coffees.add(c);
		}
		System.out.println(coffees);
	}

}
