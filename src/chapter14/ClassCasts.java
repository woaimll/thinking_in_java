package chapter14;

import typeinfo.pets.Individual;

public class ClassCasts {
	public static void main(String[] args) {
		Building b = new House();
		Class<House> houseType = House.class;
		House h = houseType.cast(b);
		h = (House) b;
		
	}
}
