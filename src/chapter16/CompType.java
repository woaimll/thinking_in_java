package chapter16;

import java.util.Arrays;
import java.util.Random;

import chapter15.Generator;

public class CompType implements Comparable<CompType> {
	int i;
	int j;
	private static int count = 1;
	public CompType(int n1, int n2) {
		i = n1;
		j = n2;
	}
	public String toString() {
		String result = "[i = " + i + ", j = " + j + "]";
		if(count++ % 3 == 0) {
			result += "\n";
		}
		return result;
	}
	@Override
	public int compareTo(CompType rv) {
		// TODO Auto-generated method stub
		return (i < rv.i ? -1 : (i == rv.i ? 0 : 1));
	}
	private static Random r = new Random(47);
	public static net.mindview.util.Generator<CompType> generator(){
		return new net.mindview.util.Generator<CompType>() {

			@Override
			public CompType next() {
				// TODO Auto-generated method stub
				return new CompType(r.nextInt(100),r.nextInt(100));
			}
		};
	}
	public static void main(String[] args) {
		CompType[] a =
				net.mindview.util.Generated.array(new CompType[12], generator());
		System.out.println("before sorting:");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after sorting:");
		System.out.println(Arrays.toString(a));
	}
}
