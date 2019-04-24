package chapter17;

import java.util.*;

public class Synchronization {
	public static void main(String[] args) {
		Collection<String> c = 
				Collections.synchronizedCollection(
						new ArrayList<>());
		Set<String> s = Collections.synchronizedSet(
				new HashSet<>());
	}
}
