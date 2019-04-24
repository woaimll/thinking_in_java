package chapter19;

import java.util.Random;

public enum CartoonCharacter2 {
	SLAPPY,SPANKY,PUNCHY,SILLY,BOUNCY,NUTTY,BOB;
	private static Random rand = new Random(47);
	public static CartoonCharacter2 next() {
		return values()[rand.nextInt(values().length)];
	}
}
