package chapter15;

import java.util.List;
import java.util.Map;

import chapter14.Person;
import typeinfo.pets.Pet;

public class LimitsOfInference {
	static void f(Map<Person,List<? extends Pet>> petPeople) {
		
	}
	public static void main(String[] args) {
		f(New.<Person,List<? extends Pet>>map());
		
	}
	public <T> T gg(T t){
		ee(this.<String> gg(""));
		return t;
	}
	public <T> void ee(T t){
		
	}
}
