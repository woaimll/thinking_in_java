package chapter17;

import java.util.*;

public class E07_CrossInsertion {

	public static void main(String[] args) {
		ArrayList<String> al = 
				new ArrayList<>(Countries.names(10));
		LinkedList<String> ll =
				new LinkedList<>(Countries.names(20).subList(10, 20));
		for(Iterator<String> it = al.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
		System.out.println("************");
		for(Iterator<String> it = ll.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
		System.out.println("************");
		int alindex = 0;;
		for(ListIterator<String> lit2 = ll.listIterator();lit2.hasNext();) {
			al.add(alindex,lit2.next());
			alindex += 2;
			
		}
		System.out.println("al = " + al);
		System.out.println("************");
		alindex = 0;
		// Start at the end:
		for(ListIterator<String> lit2 = ll.listIterator(ll.size());
		lit2.hasPrevious();) {
		al.add(alindex, lit2.previous());
		alindex += 2;
		}
		System.out.println("al = " + al);
	}

}
