package chapter15;

import net.mindview.util.RandomGenerator;

public class PrimitiveGenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = FArray.fill(new String[7], 
				new RandomGenerator.String(10));
		for(String s : strings) {
			System.out.println(s);
		}
		Integer[] integers = FArray.fill(new Integer[7], 
				new RandomGenerator.Integer());
		for(int i : integers) {
			System.out.println(i);
		}
	}

}
