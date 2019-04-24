package chapter14;

import java.util.*;

public class PetCount {
	static class PetCounter extends HashMap<String, Integer>{
		public void count(String type) {
			Integer quantity = get(type);
			if(quantity == null) {
				put(type,1);
			}else {
				put(type,quantity + 1);
			}
		}
	}
	public static void countPets(PetCreator creator) {
		PetCounter counter = new PetCounter();
		for(typeinfo.pets.Pet pet : creator.createArray(20)) {
			System.out.print(pet.getClass().getSimpleName() + " ");
			if(pet instanceof typeinfo.pets.Pet) {
				counter.count("Pet");
			}
			if(pet instanceof typeinfo.pets.Dog) {
				counter.count("Dog");
			}
			if(pet instanceof typeinfo.pets.Mutt) {
				counter.count("Mutt");
			}
			if(pet instanceof typeinfo.pets.Pug) {
				counter.count("Pug");
			}
			if(pet instanceof typeinfo.pets.Cat) {
				counter.count("Cat");
			}
			if(pet instanceof typeinfo.pets.Manx) {
				counter.count("EgyptianMau");
			}
			if(pet instanceof typeinfo.pets.Manx) {
				counter.count("Manx");
			}
			if(pet instanceof typeinfo.pets.Manx) {
				counter.count("Cymric");
			}
			if(pet instanceof typeinfo.pets.Rodent) {
				counter.count("Rodent");
			}
			if(pet instanceof typeinfo.pets.Rat) {
				counter.count("Rat");
			}
			if(pet instanceof typeinfo.pets.Mouse) {
				counter.count("Mouse");
			}
			if(pet instanceof typeinfo.pets.Hamster) {
				counter.count("Hamster");
			}
		}
		System.out.println();
		System.out.println(counter);
	}
	public static void main(String[] args) {
		countPets(new ForNameCreator());
	}
}
