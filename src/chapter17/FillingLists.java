package chapter17;

import java.util.*;

public class FillingLists {

	public static void main(String[] args) {
		List<StringAddress> list = new ArrayList<StringAddress>(
				Collections.nCopies(4, new StringAddress("Hello")));
		System.out.println(list);
		List<StringAddress> list1 = new ArrayList<StringAddress>();
		Collections.fill(list1, new StringAddress("World!"));
		System.out.println(list1);
	}

}
