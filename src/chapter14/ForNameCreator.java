package chapter14;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator{
	private static List<Class<? extends typeinfo.pets.Pet>> types =
			new ArrayList<>();
	private static String[] typeNames = {
			"typeinfo.pets.Mutt",
			"typeinfo.pets.Pug",
			"typeinfo.pets.EgyptianMau",
			"typeinfo.pets.Manx",
			"typeinfo.pets.Cymric",
			"typeinfo.pets.Rat",
			"typeinfo.pets.Mouse",
			"typeinfo.pets.Hamster"
	};
	private static void loader() {
		try {
			for(String name : typeNames) {
				types.add((Class<? extends typeinfo.pets.Pet>)Class.forName(name));
			}
		}catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	static {
		loader();
	}
	@Override
	public List<Class<? extends typeinfo.pets.Pet>> types() {
		// TODO Auto-generated method stub
		return types;
	}

}
