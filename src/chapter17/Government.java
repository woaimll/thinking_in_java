package chapter17;

import chapter15.Generator;

public class Government implements Generator<String> {
	String[] foundation = ("strange women lying in ponds "
			+ "distributing swords is no basis for a system of "
			+ "government").split(" ");
	private int index;
	@Override
	public String next() {
		// TODO Auto-generated method stub
		return foundation[index++];
	}

}
