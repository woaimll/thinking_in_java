package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class E04_MovieNameGenerator {
	private static final MovieNameGenerator mng = 
			new MovieNameGenerator();
	static String[] fill(String[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = mng.next();
		}
		return array;
	}
	static Collection<String> fill(Collection<String> collection){
		for (int i = 0; i < 5; i++) {
			collection.add(mng.next());
			
		}
		return collection;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(fill(new String[5])));
		System.out.println(fill(new ArrayList<String>()));
		System.out.println(fill(new LinkedList<String>()));
		System.out.println(fill(new HashSet<String>()));
		System.out.println(fill(new LinkedHashSet<String>()));
		System.out.println(fill(new TreeSet<String>()));
	}

}
