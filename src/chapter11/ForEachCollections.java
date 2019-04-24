package chapter11;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ForEachCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> cs = new LinkedList<>();
		Collections.addAll(cs, 
				"Take the long way home".split(" "));
		for(String s : cs) {
			System.out.print("'" + s + "' ");
		}
		
	}

}
