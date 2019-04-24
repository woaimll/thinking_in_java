package chapter15;

import java.util.Iterator;
import java.util.Random;

public class CharacterGenerator implements Generator<StoryCharacter>,Iterable<StoryCharacter>{
	private Class<?>[] types = {
			Morton.class, Frank.class,
			Harmonica.class, Cheyenne.class
			};
			private static Random rand = new Random(47);
			public CharacterGenerator() {}
			private int size = 0;
			public CharacterGenerator(int sz) { size = sz; }
			public StoryCharacter next() {
			try {
			return (StoryCharacter)
			types[rand.nextInt(types.length)].newInstance();
			} catch(Exception e) {
			throw new RuntimeException(e);
			}
			}
			class CharacterIterator implements
			Iterator<StoryCharacter> {
			int count = size;
			public boolean hasNext() { return count > 0; }
			public StoryCharacter next() {
			count--;
			return CharacterGenerator.this.next();
			}
			public void remove() { // Not implemented
			throw new UnsupportedOperationException();
			}
			};
			public Iterator<StoryCharacter> iterator() {
			return new CharacterIterator();
			}
}
