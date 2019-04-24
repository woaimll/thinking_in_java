package chapter16;

import java.util.*;

public class ContainerComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BerylliumSphere[] spheres = new BerylliumSphere[10];
		for (int i = 0; i < 5; i++) {
			spheres[i] = new BerylliumSphere();
		}
		System.out.println(Arrays.toString(spheres));
		System.out.println(spheres[4]);
		List<BerylliumSphere> sphereList =
				new ArrayList<BerylliumSphere>();
		for (int i = 0; i < 5; i++) {
			sphereList.add(new BerylliumSphere());
		}
		System.out.println(sphereList);
		System.out.println(sphereList.get(4));
		
		int[] integers = {0,1,2,3,4,5};
		System.out.println(Arrays.toString(integers));
		System.out.println(integers[4]);
		
		List<Integer> intList = new ArrayList<>(Arrays.asList(0,1,2,3,4,5));
		intList.add(9);
		System.out.println(intList);
		System.out.println(intList.get(4));
	}

}
