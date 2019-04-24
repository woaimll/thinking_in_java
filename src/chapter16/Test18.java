package chapter16;

import java.util.Arrays;

public class Test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BerylliumSphere[] bs = {
			new BerylliumSphere(),	
			new BerylliumSphere(),
			new BerylliumSphere(),
			new BerylliumSphere()
		};
		System.out.println(Arrays.toString(bs));
		BerylliumSphere[] bs2 = new BerylliumSphere[8];
		System.arraycopy(bs, 0, bs2, 0, bs.length);
		System.out.println(Arrays.toString(bs2));
	}

}
