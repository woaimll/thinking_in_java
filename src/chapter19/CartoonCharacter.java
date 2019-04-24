package chapter19;

import java.util.Random;

import chapter15.Generator;

public enum CartoonCharacter implements Generator<CartoonCharacter>{
	SLAPPY,SPANKY,PUNCHY,SILLY,BOUNCY,NUTTY,BOB;
	private Random rand = new Random(47);
	@Override
	public CartoonCharacter next() {
		// TODO Auto-generated method stub
		return values()[rand.nextInt(values().length)];
	}

}
