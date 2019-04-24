package chapter14;

import java.util.*;

public abstract class PetCreator {
	private Random rand = new Random(47);
	public abstract List<Class<? extends typeinfo.pets.Pet>> types();
	public typeinfo.pets.Pet randomPet() {
		int n = rand.nextInt(types().size());
		try {
			return types().get(n).newInstance();
		}catch (InstantiationException e) {
			throw new RuntimeException(e);
		}catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
		
	}
	public typeinfo.pets.Pet[] createArray(int size) {
		typeinfo.pets.Pet[] result = new typeinfo.pets.Pet[size];
		for (int i = 0; i < size; i++) {
			result[i] = randomPet();
		}
		return result;
	}
	public ArrayList<typeinfo.pets.Pet> arrayList(int size){
		ArrayList<typeinfo.pets.Pet> result = new ArrayList<>();
		Collections.addAll(result, createArray(size));
		return result;
	}
}
