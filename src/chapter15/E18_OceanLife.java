package chapter15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class E18_OceanLife {
	public static void eat(BigFish bf, LittleFish lf) {
		System.out.println(bf + " eat " + lf);
	}

	public static void main(String[] args) {
		Random rand = new Random(47);
		List<LittleFish> littleF = new LinkedList<LittleFish>();
		Generators.fill(littleF, LittleFish.generator(), 15);
		List<BigFish> bigF = new ArrayList<BigFish>();
		Generators.fill(bigF, BigFish.generator, 4);
		for (LittleFish lf : littleF)
			eat(bigF.get(rand.nextInt(bigF.size())), lf);
	}
}
