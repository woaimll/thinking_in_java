package chapter17;

import java.util.*;

public class CollectionDataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new LinkedHashSet<>(
				new CollectionData<>(new Government(), 15));
		System.out.println(set);
		set.addAll(CollectionData.list(new Government(), 15));
		System.out.println(set);
		
		
	}

}
