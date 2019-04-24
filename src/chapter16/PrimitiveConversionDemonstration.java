package chapter16;

import java.util.Arrays;

import net.mindview.util.ConvertTo;
import net.mindview.util.CountingGenerator;
import net.mindview.util.Generated;

public class PrimitiveConversionDemonstration {

	public static void main(String[] args) {
		Integer[] a = net.mindview.util.Generated.array(Integer.class, 
				new net.mindview.util.CountingGenerator.Integer(),15);
		int[] b = ConvertTo.primitive(a);
		System.out.println(Arrays.toString(b));
		boolean[] c = ConvertTo.primitive(Generated.array(Boolean.class, new CountingGenerator.Boolean(), 7));
		System.out.println(Arrays.toString(c));
	}

}
