package chapter16;

import java.util.Arrays;

import net.mindview.util.Generated;

public class ComparatorTest {

	public static void main(String[] args) {
		CompType[] a = Generated.array(new CompType[12],
				CompType.generator());
		System.out.println("before sorting:");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a,new CompTypeComparator());
		System.out.println("after sorting:");
		System.out.println(Arrays.toString(a));
	}

}
