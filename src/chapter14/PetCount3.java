package chapter14;

import java.util.LinkedHashMap;
import java.util.Map;

import net.mindview.util.MapData;
import typeinfo.pets.LiteralPetCreator;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class PetCount3 {
	static class PetCounter
	extends LinkedHashMap<Class<? extends typeinfo.pets.Pet>, Integer>{
		public PetCounter() {
			super(MapData.map(LiteralPetCreator.allTypes, 0));
		}
		public void count(typeinfo.pets.Pet pet) {
			for(Map.Entry<Class<? extends typeinfo.pets.Pet>, Integer> pair : entrySet()) {
				if(pair.getKey().isInstance(pet)) {
					put(pair.getKey(),pair.getValue() + 1);
				}
			}
		}
		public String toString() {
			StringBuilder sb = new StringBuilder("{");
			for(Map.Entry<Class<? extends typeinfo.pets.Pet>, Integer> pair : entrySet()) {
				sb.append(pair.getKey().getSimpleName());
				sb.append("=");
				sb.append(pair.getValue());
				sb.append(", ");
			}
			sb.delete(sb.length() - 2, sb.length());
			sb.append("}");
			return sb.toString();
		}
	}
	public static void main(String[] args) {
		PetCounter count = new PetCounter();
		for(Pet pet : Pets.createArray(20)) {
			System.out.print(pet.getClass().getSimpleName() + " ");
			count.count(pet);
		}
		System.out.println();
		System.out.println(count);
	}
}
