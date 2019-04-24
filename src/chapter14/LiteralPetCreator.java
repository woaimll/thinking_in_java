package chapter14;

import java.util.*;

import typeinfo.pets.*;

public class LiteralPetCreator extends PetCreator{
	public static final List<Class<? extends Pet>> allTypes =
			Collections.unmodifiableList(Arrays.asList(Pet.class,Dog.class,Cat.class,Rodent.class,
					Mutt.class,Pug.class,EgyptianMau.class,Manx.class,
					Cymric.class,Rat.class,Mouse.class,Hamster.class));
	@Override
	public List<Class<? extends typeinfo.pets.Pet>> types() {
		// TODO Auto-generated method stub
		return null;
	}
	private static final List<Class<? extends Pet>> types =
			allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());
	
	public static void main(String[] args) {
		System.out.println(types);
	}
}
