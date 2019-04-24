package chapter15;

public class E08_CharacterGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharacterGenerator gen = new CharacterGenerator();
		for(int i = 0; i < 7; i++)
		System.out.println(gen.next());
		for(StoryCharacter p : new CharacterGenerator(7))
			System.out.println(p);
	}

}
