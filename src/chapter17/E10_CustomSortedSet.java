package chapter17;

import static net.mindview.util.Print.print;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;

public class E10_CustomSortedSet {

	public static void main(String[] args) {
		SortedSet<String> sortedSet = new CustomSortedSet<String>();
		Collections.addAll(sortedSet, "one two three four five six seven eight".split(" "));
		print(sortedSet);
		String low = sortedSet.first();
		String high = sortedSet.last();
		print(low);
		print(high);
		Iterator<String> it = sortedSet.iterator();
		for (int i = 0; i <= 6; i++) {
			if (i == 3)
				low = it.next();
			if (i == 6)
				high = it.next();
			else
				it.next();
		}
		print(low);
		print(high);
		print(sortedSet.subSet(low, high));
		print(sortedSet.headSet(high));
		print(sortedSet.tailSet(low));
		print(sortedSet.contains("three"));
		print(sortedSet.contains("eleven"));
		print(sortedSet.addAll(Arrays.asList("three", "eleven")));
		print(sortedSet);
		print(sortedSet.retainAll(Arrays.asList("three", "eleven")));
		print(sortedSet);
		// Demonstrate data integrity
		try {
			sortedSet.addAll(Arrays.asList("zero", null));
		} catch (NullPointerException e) {
			System.out.println("Null elements not supported!");
		}
		// The set will not contain "zero"!
		print(sortedSet);
	}

}
