package chapter14;

public class E26_ClearSpitValve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind(), };
		Music5.prepareAll(orchestra);
		Music5.tuneAll(orchestra);
	}

}
